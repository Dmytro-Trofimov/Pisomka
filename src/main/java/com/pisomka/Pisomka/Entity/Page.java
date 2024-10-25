package com.pisomka.Pisomka.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="page")
public class Page implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100)
	private String title;
	@Column(length = 100)
	private String author;
	@Column(columnDefinition = "LONGTEXT")
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
	public Page(String title, String author, String story) {
		this.title = title;
		this.author = author;
		this.story = story;
	}
	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}