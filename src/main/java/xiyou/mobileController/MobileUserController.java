package xiyou.mobileController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xiyou.dao.UserMapper;
import xiyou.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/mobileUser")
public class MobileUserController {

    @Autowired
    private UserMapper userMapper;

    @ResponseBody
    @RequestMapping(value = "login")
    public User login(@RequestParam String name, @RequestParam String password, HttpServletRequest request, HttpServletResponse response)
    {
        User user = userMapper.selectByPrimaryKey(name);

        if(password.equals(user.getEmpPass()))
        {
            return user;
        }
        return user;
    }
    @ResponseBody
    @RequestMapping(value ="getUserById",method = RequestMethod.GET)
    public User getUserById(@RequestParam String emp_no)
    {
        return userMapper.selectByPrimaryKey(emp_no);
    }

    @ResponseBody
    @RequestMapping(value = "getUserByPage",method = RequestMethod.GET)
    public PageInfo getUserByPage(@RequestParam(value = "page",defaultValue = "1")Integer page){
        PageHelper.startPage(page,1);
        List<User> users  = userMapper.selectByExample(null);
        int p =users.size()/10;
        if (users.size()%10!=0) p++;
        PageInfo pageInfo = new PageInfo(users,p);
        return pageInfo;
    }
    @ResponseBody
    @RequestMapping(value = "getUser",method = RequestMethod.GET)
    public List<User> getUser(){
        return userMapper.selectByExample(null);
    }
    @ResponseBody
    @RequestMapping(value = "deleteUserById",method = RequestMethod.GET)
    public String deleteUserById(@RequestParam String emp_no)
    {
        if(userMapper.deleteByPrimaryKey(emp_no)>0)
        {
            return "succeed";
        }
        return "failed";
    }

    @ResponseBody
    @RequestMapping(value = "insertUser",method = RequestMethod.POST)
    public String insertUser(@RequestParam User user)
    {
        if(userMapper.insert(user)>0)
            return "succeed";
        return "failed";
    }

    @ResponseBody
    @RequestMapping(value = "updateUser",method = RequestMethod.POST)
    public String updatetUser(@RequestParam User user)
    {
        if(userMapper.updateByPrimaryKey(user)>0)
            return "succeed";
        return "failed";
    }

}
