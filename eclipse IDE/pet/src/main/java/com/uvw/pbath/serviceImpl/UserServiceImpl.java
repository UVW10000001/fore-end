package com.uvw.pbath.serviceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uvw.pbath.entity.Users;
import com.uvw.pbath.mapper.UserMapper;
import com.uvw.pbath.service.UserService;

@Service
public class UserServiceImpl implements UserService {
   @Autowired
   private UserMapper mapper;
	@Override
	public List<Users> findUsers() {
		
		return mapper.findUsers();
	}
	@Override
	public Users findUsersByPhone(String user_name) {
		
		return mapper.findUsersByPhone(user_name);
	}

}
