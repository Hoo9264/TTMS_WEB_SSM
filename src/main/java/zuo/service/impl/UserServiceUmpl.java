package zuo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import zuo.dao.UserDao;
import zuo.entity.User;
import zuo.service.UserService;

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
