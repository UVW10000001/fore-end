package com.uvw.pbath.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.uvw.pbath.entity.Users;

@Mapper
public interface UserMapper {
	/**根据用户的手机号,查找一个用户对象*/

	@Select("select * from db_pbath")
	public abstract List<Users> findUsers();
	@Select("select * from db_pbath where phone=#{user_name}")
	public Users findUsersByPhone(String user_name);
}
