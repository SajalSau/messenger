package org.sajal.rest.messenger.model;

public class Link {

	private String link;
	private String rel;
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getRel() {
		return rel;
	}
	public void setRel(String rel) {
		this.rel = rel;
	}
	public Link(String link, String rel) {
		super();
		this.link = link;
		this.rel = rel;
	}
	public Link() {

	}
	
	
}
