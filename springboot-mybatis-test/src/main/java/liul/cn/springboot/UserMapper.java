package liul.cn.springboot;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


public interface UserMapper {

	@Select("select * from user where username=#{username}")
	public List<User> findByName(String username);
	
	@Insert("insert into user(username,password) values(#{username},#{password})")
	@Options(useGeneratedKeys=true,keyProperty="userid",keyColumn="userid")
	public void saveUser(User user);
}
