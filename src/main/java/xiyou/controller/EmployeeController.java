package xiyou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xiyou.dao.EmployeeMapper;
import xiyou.pojo.Employee;
import xiyou.pojo.Msg;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeMapper employeeMapper;

    @ResponseBody
    @RequestMapping(value ="getEmployeeById",method = RequestMethod.GET)
    public Msg getEmployeeById(@RequestParam int emp_id)
    {
        return Msg.success().add("pageinfo",employeeMapper.deleteByPrimaryKey(emp_id));
    }
    @ResponseBody
    @RequestMapping(value = "getEmployee",method = RequestMethod.GET)
    public Msg getEmployee(@RequestParam(value = "page",defaultValue = "1")Integer page)
    {
        PageHelper.startPage(page,10);
        List<Employee> plays  = employeeMapper.selectByExample(null);
        int p =plays.size()/10;
        if(plays.size()%10!=0) p++;
        PageInfo pageInfo = new PageInfo(plays,p);
        return Msg.success().add("pageinfo",pageInfo);

    }

    @ResponseBody
    @RequestMapping(value = "deleteEmployeeById",method = RequestMethod.GET)
    public Msg deleteUserById(@RequestParam int emp_id)
    {
        if(employeeMapper.deleteByPrimaryKey(emp_id)>0)
        {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "insertEmployee",method = RequestMethod.POST)
    public Msg insertEmployee(@RequestParam Employee employee)
    {
        if(employeeMapper.insert(employee)>0)
            return Msg.success();
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "updatetEmployee",method = RequestMethod.POST)
    public Msg updateEmployee(@RequestParam Employee employee)
    {
        if(employeeMapper.updateByPrimaryKey(employee)>0)
            return Msg.success();
        return Msg.fail();
    }
}
