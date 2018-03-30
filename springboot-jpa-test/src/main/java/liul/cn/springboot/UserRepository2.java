package liul.cn.springboot;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 *   PagingAndSortingRepository 继承--> CrudRepository  继承--> Repository
 */
public interface UserRepository2 extends PagingAndSortingRepository<User_jpa, Integer>{
	/*
	 * 自定义方法 方法命名需按规范
	 * 1/ 查询方法 以 get | find | read 开头.
	 * 2/ 涉及查询条件时，条件的属性用条件关键字连接，要注意的是条件属性以首字母大写。
	 */
	
	public User_jpa findByUsername(String username);
	
	/*
	 * JPQL语句， 
	 * Hibernate  -- HQL语句.
	 * JPQL 语句 和HQL语句是类似的.
	 */
	@Query("from User_jpa where username=:un")
	public User_jpa readByUsername(@Param("un")String username);
}
