package com.uvw.pbath.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.uvw.pbath.entity.Users;

@Mapper
public interface PetMapper {
	
   boolean saveRecord(Users users);
  
   Users findRecordByPhone(@Param("phone") String phone);
}
