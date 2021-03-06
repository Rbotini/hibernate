package com.botidev_hibernate.hibernate_project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;



@Entity
public class Song {
	
	@Id
	@Column(name="songid")
	private int id;
	
	@Column(name="songname")
	private String songName;
	
	@Column(name = "singer")
	private String artista;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	

}
