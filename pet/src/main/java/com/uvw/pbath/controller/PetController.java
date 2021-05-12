package com.uvw.pbath.controller;

import java.util.Date;

//import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
@Api("用户使用的接口")
public class PetController {
	
	@Autowired
	private PetService petService;
	
	@PostMapping("/record")
	@ApiOperation("用户预约")
	public ResultObject saveRecord(Users users, HttpSession session) {
		
		System.out.println(users);
		Date date = new Date();
        //时间类型强转
//		users.setDate(date.toString());
		ResultObject object = new ResultObject();
		boolean success = petService.saveRecord(users);
		if(success) {
		object.setStatus(1);
		object.setInfo("预约成功");
		Object data;
		data = date;
		object.setData(users);
		session.setAttribute("phone", users.getPhone());
		return object;
		}else {
			object.setStatus(0);
			object.setInfo("预约失败");
			Object data;
			data = date;
			object.setData(users);
			return object;
		}

	}

}
