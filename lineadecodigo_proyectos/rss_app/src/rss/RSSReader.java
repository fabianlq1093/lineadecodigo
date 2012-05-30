package rss;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import list.adt.PositionList;
import list.imp.sll.SLList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class RSSReader {

	protected URL url;

	public RSSReader(String feed) throws MalformedURLException {
		url = new URL(feed);
	}

	public Iterable<Entry> getNews() {
		
		PositionList<Entry> list = new SLList<Entry>();
		
		try {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder();

			Document doc = builder.parse(url.openStream());
			NodeList nodes = doc.getElementsByTagName("item");
			


			for (int i = 0; i < nodes.getLength(); i++)
				list.addLast(new Entry((Element) nodes.item(i)));
				
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return list;
	}
}