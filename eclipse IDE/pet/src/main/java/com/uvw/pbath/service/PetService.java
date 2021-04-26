package com.uvw.pbath.service;
import java.util.List;
import com.uvw.pbath.entity.Users;

public interface PetService {
	
	public boolean saveRecord(Users users);
	public  List<Users> findRecordByPhone(String phone);

}