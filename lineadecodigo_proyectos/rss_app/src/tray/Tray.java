package tray;

import icon.Icon;

import java.awt.Desktop;
import java.awt.SystemTray;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import rss.Entry;
import util.Statics;

public class Tray {

	protected JTrayIcon icon;
	protected JMenuItem itmAll;
	protected JPopupMenu menu;
	protected boolean in;

	protected JMenu mnuPost;
	protected SystemTray tray;

	public Tray() {

		if (!SystemTray.isSupported()) {
			System.out.println("La bandeja del sistema no es soportada");
			return;
		}

		try {
			tray = SystemTray.getSystemTray();

			icon = new JTrayIcon(Icon.getIcon("ldc").getImage());
			
			tray.add(icon);
			makeMenu();
			icon.setJPopupMenu(menu);
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}

	private void makeMenu() {
		menu = new JPopupMenu();

		JMenuItem itmLDC = new JMenuItem("Linea de codigo");
		itmLDC.setIcon(Icon.getIcon("ldc"));
		itmLDC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				try {
					Desktop.getDesktop().browse(
							new URI("http://www.lineadecodigo.com"));
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});

		JMenuItem itmOptions = new JMenuItem("Opciones");
		itmOptions.setIcon(Icon.getIcon("options"));
		itmOptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// FIXME: Options
			}
		});

		mnuPost = new JMenu("Ultimos posts");
		mnuPost.setIcon(Icon.getIcon("post"));

		itmAll = new JMenuItem("Ver Todos");
		itmAll.setIcon(Icon.getIcon("ldc"));
		itmAll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				try {
					Desktop.getDesktop().browse(
							new URI("http://lineadecodigo.com/articulos/"));
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});

		JMenuItem itmExit = new JMenuItem("Exit");
		itmExit.setIcon(Icon.getIcon("close"));
		itmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		menu.add(itmLDC);
		menu.add(mnuPost);
		mnuPost.add(itmAll);
		menu.addSeparator();
		menu.add(itmOptions);
		menu.add(itmExit);
	}

	private String parse(String category) {
		return category.replace('á', 'a').replace('é', 'e').replace('í', 'i')
				.replace('ó', 'o').replace('ú', 'u').toLowerCase();
	}

	public void reload() {

		if (itmAll.isShowing())
			return;

		mnuPost.removeAll();

		mnuPost.add(itmAll);
		mnuPost.addSeparator();

		for (Entry e : Statics.news) {
			final String link = e.getLink();

			JMenuItem itm = new JMenuItem(e.getCategory() + " > " + e.getTitle());
			itm.setIcon(Icon.getIcon(parse(e.getCategory())));
			itm.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent evt) {
					try {
						Desktop.getDesktop().browse(new URI(link));
					} catch (Exception e) {
						System.out.println(e);
					}
				}
			});

			mnuPost.add(itm);
		}

	}

}
