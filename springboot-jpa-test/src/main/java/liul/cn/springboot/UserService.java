package liul.cn.springboot;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Resource
	private UserDao userDao;
    @Resource
    private UserRepository userRepository;
    @Resource
    private UserRepository2 userRepository2;
   
    public User_jpa findByName(String username){
    	return userDao.findByName(username);
    }
    
    public Iterable<User_jpa> findByName_repo(String username){
    	return userRepository.findAll();
    }
    
    public User_jpa findByName_repo2(String username) {
    	return userRepository2.findByUsername(username);
    }
    
    public User_jpa findByUserName_repo2(String username) {
    	return userRepository2.readByUsername(username);
    }
}
