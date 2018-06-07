package xiyou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xiyou.dao.UserDao;
import xiyou.dao.UserMapper;
import xiyou.pojo.User;
import xiyou.service.UserService;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserByNo(String emp_no) {
        return userMapper.selectByPrimaryKey(emp_no);
    }

    @Override
    public List<User> getUser() {
        return userMapper.selectByExample(null);
    }
}
