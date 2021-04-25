package com.uvw.pbath.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uvw.pbath.entity.ResultObject;
import com.uvw.pbath.entity.Users;
import com.uvw.pbath.service.UserService;
	
@RestController
@RequestMapping("/users")	
public class UsersController {
	  @Autowired
	  private UserService service;
	  
		@RequestMapping("/findusers")
		public ResultObject findUsers() {
			ResultObject result = new ResultObject();
			List<Users> users = service.findUsers();
			result.setStatus(1);
			result.setInfo("提交成功");
			result.setData(users);
			return result;
		}
	}

