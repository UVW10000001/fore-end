package com.uvw.pbath.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author uvw
 *
 */

public class Users {
   
    private String user_name;
    private String pets_name;
    private String phone;
    private String combo;
    private String date;
    
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPets_name() {
		return pets_name;
	}
	public void setPets_name(String pets_name) {
		this.pets_name = pets_name;
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
		return "Users [user_name=" + user_name + ", pets_name=" + pets_name + ", phone=" + phone + ", combo="
				+ combo + ", date=" + date + "]";
	}
    
	
	
}
