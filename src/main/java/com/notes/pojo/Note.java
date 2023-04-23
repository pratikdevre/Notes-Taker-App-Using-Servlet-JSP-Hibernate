package com.notes.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "notes")
public class Note {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int note_id;
	private String title;
	private String message;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	public Note() {
		super();
		//TODO Auto-generated constructor stub
	}

	public Note(int note_id, String title, String message, Date date) {
		super();
		this.note_id = note_id;
		this.title = title;
		this.message = message;
		this.date = date;
	}

	public int getNote_id() {
		return note_id;
	}

	public void setNote_id(int note_id) {
		this.note_id = note_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Note [note_id=" + note_id + ", title=" + title + ", message=" + message + ", date=" + date + "]";
	}
	
	
}
