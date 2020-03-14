package com.demo.vo;

public class ClientVO {
	private int client_id;
	private String client_Name;
	private String client_Address;
	private int client_Age;
	private String client_mobile;
	@Override
	public String toString() {
		return "ClientVO [client_id=" + client_id + ", client_Name=" + client_Name + ", client_Address="
				+ client_Address + ", client_Age=" + client_Age + ", client_mobile=" + client_mobile
				+ ", getClient_id()=" + getClient_id() + ", getClient_Name()=" + getClient_Name()
				+ ", getClient_Address()=" + getClient_Address() + ", getClient_Age()=" + getClient_Age()
				+ ", getClient_mobile()=" + getClient_mobile() + "]";
	}
	public int getClient_id() {
		return client_id;
	}
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
	public String getClient_Name() {
		return client_Name;
	}
	public void setClient_Name(String client_Name) {
		this.client_Name = client_Name;
	}
	public String getClient_Address() {
		return client_Address;
	}
	public void setClient_Address(String client_Address) {
		this.client_Address = client_Address;
	}
	public int getClient_Age() {
		return client_Age;
	}
	public void setClient_Age(int client_Age) {
		this.client_Age = client_Age;
	}
	public String getClient_mobile() {
		return client_mobile;
	}
	public void setClient_mobile(String client_mobile) {
		this.client_mobile = client_mobile;
	}

}