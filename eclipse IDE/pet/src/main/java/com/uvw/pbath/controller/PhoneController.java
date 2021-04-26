package com.uvw.pbath.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.record.Record;
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
@Api("学生使用的接口")
@RequestMapping("/phone")
public class PhoneController {

	
	@Autowired
	private PetService petService;

		//预约详情
		@PostMapping("/appointmentinfo")
		@ApiOperation(value = "teacher",
		notes = "老师登录传入的参数")	
		public ResultObject findStudentInfo(HttpSession session) {
			//1.从session中获取用户手机号的对象
			String phone = (String) session.getAttribute("phone");
			
			List<Users> list = petService.findRecordByPhone(phone);
			
			for (Users users : list) {
				System.out.println(users.toString());
			}
			
			ResultObject object = new ResultObject();
			
			object.setStatus(1);
			object.setInfo("获取成功");
			object.setData(list);
			
			return object;
		}
}
