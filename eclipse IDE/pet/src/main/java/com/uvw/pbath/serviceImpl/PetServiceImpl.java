package com.uvw.pbath.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uvw.pbath.entity.Users;
import com.uvw.pbath.mapper.PetMapper;
import com.uvw.pbath.service.PetService;

@Service
public class PetServiceImpl implements PetService {

	@Autowired
	private PetMapper petMapper;

	@Override
	public boolean saveRecord(Users users) {
		// TODO Auto-generated method stub
		return petMapper.saveRecord(users);
	}

	@Override
	public List<Users> findRecordByPhone(String phone) {
		
		return petMapper.findRecordByPhone(phone);
	}


}
