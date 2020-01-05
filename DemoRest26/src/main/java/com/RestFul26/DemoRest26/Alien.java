package com.RestFul26.DemoRest26;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement // Tells that the Alien is the root element
public class Alien {
	
	private String name;
	private String lname;
	private String domain;
	private int point;
	private int id;
	
	private Date creationDate;
	private Date updateDate; 
	
	
	private String city;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	int insertStatus;
	
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public int getInsertStatus() {
		return insertStatus;
	}
	public void setInsertStatus(int insertStatus) {
		this.insertStatus = insertStatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "Alien [name=" + name + ", lname=" + lname + ", domain=" + domain + ", point=" + point + ", id=" + id
				+ ", creationDate=" + creationDate + ", updateDate=" + updateDate + ", city=" + city + ", insertStatus="
				+ insertStatus + "]";
	}
	
}
