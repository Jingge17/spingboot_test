package liul.cn.springboot;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
@Autowired
private UserService userService;

@RequestMapping("/query-name")
public List<User> queryName(String username){
	return userService.findByName(username);
}

@RequestMapping("/save-user")
public User saveUser(User user) {
	userService.saveUser(user);
	return user;
}
}
