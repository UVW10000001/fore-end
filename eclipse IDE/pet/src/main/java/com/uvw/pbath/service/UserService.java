package com.uvw.pbath.service;
import java.util.List;
import com.uvw.pbath.entity.Users;
public interface UserService {
	  public abstract List<Users> findUsers();
	  public abstract Users findUsersByPhone(String user_name);
	}