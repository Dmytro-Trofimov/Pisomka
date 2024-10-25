package com.pisomka.Pisomka.Entity;


public class PageDTO{
	private int id;
	private String title;
	private String author;
	private String story;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	@Override
	public String toString() {
		return "Page [id=" + id + ", title=" + title + ", author=" + author + ", story=" + story + "]";
	}
	public PageDTO(int id, String title, String author, String story) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.story = story;
	}
	public PageDTO() {
		super();
	}
	
	
}