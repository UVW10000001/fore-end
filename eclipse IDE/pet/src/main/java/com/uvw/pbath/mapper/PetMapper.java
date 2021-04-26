package com.uvw.pbath.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.uvw.pbath.entity.Users;

@Mapper
public interface PetMapper {
	
  public boolean saveRecord(Users users);
  
  public List<Users> findRecordByPhone(String phone);
}
