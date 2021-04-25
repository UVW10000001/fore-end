package com.uvw.pbath.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author uvw
 *
 */
@SuppressWarnings("serial")
public class Users implements Serializable{
   
    private String user_name;
    private String Pets_name;
    private String phone;
    private String BathingCombo;
    private Date date;
    
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPets_name() {
		return Pets_name;
	}
	public void setPets_name(String pets_name) {
		Pets_name = pets_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBathingCombo() {
		return BathingCombo;
	}
	public void setBathingCombo(String bathingCombo) {
		BathingCombo = bathingCombo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Users [user_name=" + user_name + ", Pets_name=" + Pets_name + ", phone=" + phone + ", BathingCombo="
				+ BathingCombo + ", date=" + date + "]";
	}
	
	
}
