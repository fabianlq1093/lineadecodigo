package main;

import rss.RSSReader;
import tray.Tray;
import util.Statics;

public class Main {

	protected static Tray tray;

	public static void main(String[] args) throws Exception {
		lookAndFeel();
		Statics.rss = new RSSReader("http://feeds.feedburner.com/LineaDeCodigo");

		new ReloadThread().start();

		tray = new Tray();

	}

	protected static void lookAndFeel() {
		try {
			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager
					.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected static class ReloadThread extends Thread {
		public void run() {
			try {
				Thread.sleep(5 * 1000);
			} catch (InterruptedException e) {

			}
			
			while (true) {
				try {
					Statics.news = Statics.rss.getNews();

					if (tray != null)
						tray.reload();

					Thread.sleep(5 * 60 * 1000);
				} catch (InterruptedException e) {

				}
			}
		}
	}

}
