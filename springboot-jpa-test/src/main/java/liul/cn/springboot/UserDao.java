package liul.cn.springboot;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Resource
	private JdbcTemplate jdbcTemplate;
	
     public User_jpa findByName(String username){
		
		/**
		 * 1、定义一个Sql语句；
		 * 2、定义一个RowMapper.
		 * 3、执行查询方法.
		 */
		String sql = "select *from user_jpa where username=?";
		RowMapper<User_jpa> rowMapper = new BeanPropertyRowMapper<>(User_jpa.class);
		User_jpa user = jdbcTemplate.queryForObject(sql, new Object[]{username}, rowMapper);
		return user;
	}
}
