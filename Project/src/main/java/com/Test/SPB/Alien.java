package com.Test.SPB;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype" )
public class Alien {
	
	private String alienName;
	private int alienId;
	private String alienTech;
	public String getAlienName() {
		return alienName;
	}
	public void setAlienName(String alienName) {
		this.alienName = alienName;
	}
	public int getAlienId() {
		return alienId;
	}
	public void setAlienId(int alienId) {
		this.alienId = alienId;
	}
	public String getAlienTech() {
		return alienTech;
	}
	public void setAlienTech(String alienTech) {
		this.alienTech = alienTech;
	}
	
	
	public void show() {
		System.out.println("In show of alien");
	}

}
