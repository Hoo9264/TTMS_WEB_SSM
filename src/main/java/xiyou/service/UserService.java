package xiyou.service;

import xiyou.pojo.User;

import java.util.List;

public interface UserService {

    /**
     * 通过emp_no查询user
     * @param emp_no
     * @return
     */
    User getUserByNo(String emp_no);

    /**
     * 返回所有user
     * @return
     */
    List<User> getUser();
}
