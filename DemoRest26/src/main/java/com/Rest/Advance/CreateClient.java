package com.Rest.Advance;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CreateClient {
	
	private int clientId ;
	private String clientName;
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	

}
