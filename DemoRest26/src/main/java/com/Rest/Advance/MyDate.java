package com.Rest.Advance;

public class MyDate {
	
	private int date;
	private int month;
	private int year;
	
	private String note;
	
	
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return note + " [date=" + date + ", month=" + month + ", year=" + year+  "] " ;
	}
	
	

}
