package tray;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.TrayIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPopupMenu;
import javax.swing.JWindow;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

import util.Util;

public class JTrayIcon extends TrayIcon {

	private static JWindow window;

	private static PopupMenuListener popupListener = new PopupMenuListener() {

		public void popupMenuCanceled(PopupMenuEvent e) {
			window.setVisible(false);
		}

		public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
			window.setVisible(false);
		}

		public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
		}
	};

	static {
		window = new JWindow();
		window.setAlwaysOnTop(true);
	}

	private JPopupMenu menu;

	public JTrayIcon(Image image) {
		super(image);
		addMouseListener(new MouseAdapter() {

			public void mouseReleased(MouseEvent e) {
				switch (e.getButton()) {
					case MouseEvent.BUTTON2 :
						System.exit(0);
						break;
					case MouseEvent.BUTTON1 :
					case MouseEvent.BUTTON3 :
						showJPopupMenu(e);
						break;
				}
			}
		});
	}

	public JPopupMenu getJPopupMenu() {
		return menu;
	}

	public void setJPopupMenu(JPopupMenu menu) {
		if (this.menu != null) {
			this.menu.removePopupMenuListener(popupListener);
		}

		this.menu = menu;
		menu.addPopupMenuListener(popupListener);
	}

	protected void showJPopupMenu(int x, int y) {
		window.setLocation(x, y);
		window.setVisible(true);
		menu.show(window.getContentPane(), 0, 0);
		window.toFront();
	}

	protected void showJPopupMenu(MouseEvent e) {
		if (menu != null) {
			Dimension size = menu.getPreferredSize();
			if (Util.isLinux())
				showJPopupMenu(e.getX(), 20);
			else
				showJPopupMenu(e.getX(), e.getY() - size.height);
		}
	}
}