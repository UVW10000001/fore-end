package com.uvw.pbath.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uvw.pbath.entity.ResultObject;
import com.uvw.pbath.entity.Users;
import com.uvw.pbath.service.PetService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/pet")
@Api("学生使用的接口")
public class PetController {
	
	@Autowired
	private PetService petService;
	
	@PostMapping("/record")
	@ApiOperation("学生登录使用的方法")
	public ResultObject saveRecord(Users users, HttpSession session) {
		
		petService.saveRecord(users);
		session.setAttribute("phone", users.getPhone());
		ResultObject object = new ResultObject();
		object.setStatus(1);
		object.setInfo("预约成功");
		return object;

	}

}
