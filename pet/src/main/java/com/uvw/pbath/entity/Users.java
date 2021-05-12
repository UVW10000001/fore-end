package com.uvw.pbath.entity;

import java.io.Serializable;

//import java.io.Serializable;
//import java.util.Date;

/**
 * @author uvw
 *
 */

public class Users implements Serializable {

	private static final long serialVersionUID = -5878672996231418389L;
	
	private String username;
    private String petname;
    private String phone;
    private String combo;
    private String date;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPetname() {
		return petname;
	}
	public void setPetname(String petname) {
		this.petname = petname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCombo() {
		return combo;
	}
	public void setCombo(String combo) {
		this.combo = combo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Users [username=" + username + ", petname=" + petname + ", phone=" + phone + ", combo=" + combo
				+ ", date=" + date + "]";
	}
    
}