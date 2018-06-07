package xiyou.mobileController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xiyou.dao.EmployeeMapper;
import xiyou.pojo.Employee;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/mobileEmployee")
public class MobileEmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @ResponseBody
    @RequestMapping(value ="getEmployeeById",method = RequestMethod.GET)
    public Employee getEmployeeById(@RequestParam int emp_id)
    {
        return employeeMapper.selectByPrimaryKey(emp_id);
    }
    @ResponseBody
    @RequestMapping(value = "getEmployee",method = RequestMethod.GET)
    public List<Employee> getEmployee()
    {
        return employeeMapper.selectByExample(null);
    }

    @ResponseBody
    @RequestMapping(value = "deleteEmployeeById",method = RequestMethod.GET)
    public String deleteUserById(@RequestParam int emp_id)
    {
        if(employeeMapper.deleteByPrimaryKey(emp_id)>0)
        {
            return "succeed";
        }
        return "failed";
    }

    @ResponseBody
    @RequestMapping(value = "insertEmployee",method = RequestMethod.POST)
    public String insertEmployee(@RequestParam Employee employee)
    {
        if(employeeMapper.insert(employee)>0)
            return "succeed";
        return "failed";
    }

    @ResponseBody
    @RequestMapping(value = "updatetEmployee",method = RequestMethod.POST)
    public String updateEmployee(@RequestParam Employee employee)
    {
        if(employeeMapper.updateByPrimaryKey(employee)>0)
            return "succeed";
        return "failed";
    }



}
