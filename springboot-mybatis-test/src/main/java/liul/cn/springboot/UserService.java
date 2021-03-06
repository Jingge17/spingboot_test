package liul.cn.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
	private UserMapper userMapper;
    
    public List<User> findByName(String username){
    	return userMapper.findByName(username);
    }
    
    @Transactional
    public void saveUser(User user) {
    	userMapper.saveUser(user);
    }
}
