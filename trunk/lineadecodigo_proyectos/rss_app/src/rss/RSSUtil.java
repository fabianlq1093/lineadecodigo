package rss;

import org.w3c.dom.Element;
import org.w3c.dom.CharacterData;

public class RSSUtil {

	protected static String getCharacterDataFromElement(Element e) {
		try {
			return ((CharacterData) e.getFirstChild()).getData();
		} catch (Exception ex) {

		}

		return "";
	}

	public static String getElementValue(Element parent, String label) {
		return getCharacterDataFromElement((Element) parent
				.getElementsByTagName(label).item(0));
	}
}
