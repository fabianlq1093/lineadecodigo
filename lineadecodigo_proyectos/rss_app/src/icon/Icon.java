package icon;

import java.net.URL;

import javax.swing.ImageIcon;

import map.adt.Map;
import map.imp.bstm.BSTMap;
import map.imp.ohm.OpenHashMap;

public class Icon {

	protected static Map<String, ImageIcon> map;

	public static ImageIcon getIcon(String str) {
		if (map == null)
			map = new BSTMap<String, ImageIcon>();

		ImageIcon img = map.get(str);

		if (img == null) {
			URL url = Icon.class.getResource("/icons/" + str + ".png");

			if (url == null)
				url = Icon.class.getResource("/icons/txt.png");

			img = new ImageIcon(url);
			map.put(str, img);
		}

		return img;
	}
	
	public static Map<String, ImageIcon> getMap() {
		if (map == null)
			map = new OpenHashMap<String, ImageIcon>();
		
		return map;
	}
}
