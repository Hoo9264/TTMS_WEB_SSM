package xiyou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import xiyou.dao.UserDao;
import xiyou.pojo.User;
import xiyou.service.UserService;

import java.util.List;

public class UserServiceUmpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public User getUserByNo(String emp_no) {
        return userDao.queryByNo(emp_no);
    }

    @Override
    public List<User> getUserList() {
        return userDao.queryAll();
    }
}
