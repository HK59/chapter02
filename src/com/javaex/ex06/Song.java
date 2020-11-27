package com.javaex.ex06;

public class Song {
	private String title; 
	private String artist; 
	private String album;
	private String composer;
	private String year;
	private int track;
		
	public String getTitle() {
		return title;
	}
	
	//constructor 0
	
	public Song() {
		super();
	}
	
	//constructor 6

	public void setTitle(String title) {
		this.title = title;
	}
	public Song(String title, String artist, String album, String composer, String year, int track) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	//2 constructors
	
	public String getArtist() {
		return artist;
	}
	public Song(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	//override
	public void setArtist(String artist) {
		this.artist = artist;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}

	//getter,setter
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	} 
	
	public void showInfo( ) {
		System.out.println(artist + "," + title + "(" +album + "," + year + "," + track + "번 track," + composer + "작곡)"  );
		
		
	
}
