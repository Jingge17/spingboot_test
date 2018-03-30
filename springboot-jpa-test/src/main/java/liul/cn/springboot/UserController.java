package liul.cn.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
@Autowired
private UserService userService;

@RequestMapping("/query-name-dao")
public User_jpa queryName(String username){
	return userService.findByName(username);
}
@RequestMapping("/query-name-repo")
public Iterable<User_jpa>  findByName_repo(String username){
	return userService.findByName_repo(username);
}

@RequestMapping("/query-name-repo2")
public User_jpa  findByName_repo2(String username){
	return userService.findByName_repo2(username);
}
@RequestMapping("/query-username-repo2")
public User_jpa  findByUserName_repo2(String username){
	return userService.findByUserName_repo2(username);
}

@RequestMapping("/jsp-index")
public String jspindex(){
	return "index";
}
}
