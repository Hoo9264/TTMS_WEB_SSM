package xiyou.dao;

import xiyou.pojo.User;

import java.util.List;

public interface UserDao {
    /**
     * 通过账号查找user
     * @param emp_no
     * @return
     */
    public User queryByNo(String emp_no);

    /**
     * 查找所有user
     * @return
     */

    public List<User> queryAll();

    /**
     * 按账号删除,返回1成功，0失败
     * @param emp_no
     * @return
     */
    public void delete(String emp_no);

    /**
     * 更新user
     * @param user
     * @return
     */
    public void update(User user);

    /**
     * 插入
     * @param user
     */
    public void insert(User user);
}
