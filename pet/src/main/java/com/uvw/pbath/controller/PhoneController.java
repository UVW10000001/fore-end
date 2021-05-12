package com.uvw.pbath.controller;

import javax.servlet.http.HttpSession;

//import org.junit.jupiter.params.shadow.com.univocity.parsers.common.record.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uvw.pbath.entity.ResultObject;
import com.uvw.pbath.entity.Users;
import com.uvw.pbath.service.PetService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("查询信息使用的接口")
@RequestMapping("/phone")
public class PhoneController {

	
	@Autowired
	private PetService petService;

		//预约详情
		@GetMapping("/appointmentinfo")
		@ApiOperation(value = "order",
		notes = "预约功能传入的参数")	
		public ResultObject findStudentInfo(HttpSession session) {
			//1.从session中获取用户手机号的对象
			String phone = session.getAttribute("phone").toString();
			System.out.println(phone);
			
			Users users = petService.findRecordByPhone(phone);
			System.out.println(users.toString());	
			ResultObject object = new ResultObject();		
			object.setStatus(1);
			object.setInfo("获取成功");
			object.setData(users);
			return object;
		}
}
