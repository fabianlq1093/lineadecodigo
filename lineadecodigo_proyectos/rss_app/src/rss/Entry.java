package rss;

import static rss.RSSUtil.getElementValue;

import org.w3c.dom.Element;

public class Entry {

	protected String title, link, date, author, description, category;

	public Entry(Element element) {
		this.title = getElementValue(element, "title");
		this.link = getElementValue(element, "link");
		this.date = getElementValue(element, "pubDate");
		this.author = getElementValue(element, "dc:creator");
		this.description = getElementValue(element, "description");
		this.category = getElementValue(element, "category");
	}

	public String getTitle() {
		return this.title;
	}

	public String getLink() {
		return this.link;
	}

	public String getDate() {
		return this.date;
	}

	public String getAuthor() {
		return this.author;
	}

	public String getDescription() {
		return this.description;
	}

	public String getCategory() {
		return this.category;
	}
		
}
