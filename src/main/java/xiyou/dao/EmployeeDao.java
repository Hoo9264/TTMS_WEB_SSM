package xiyou.dao;

import xiyou.pojo.Employee;

import java.util.List;

public interface EmployeeDao {

    /**
     * 通过id单个employee
     * @param emp_id
     * @return
     */
    Employee queryById(int emp_id);

    /**
     * 查询所有employee;
     * @return
     */
    List<Employee> queryAll();

    /**
     * 插入
     * @param employee
     */
    void insert(Employee employee);

    /**
     * 删除
     * @param emp_id
     */
    void delete(int emp_id);

    /**
     * 更新
     * @param employee
     */
    void update(Employee employee);

}
