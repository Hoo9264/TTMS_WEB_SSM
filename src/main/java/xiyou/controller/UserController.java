package xiyou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import xiyou.dao.UserDao;
import xiyou.dao.UserMapper;
import xiyou.pojo.Msg;
import xiyou.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/user")
public class UserController{
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
    public Msg getUserById(@RequestParam String emp_no)
    {
        User user = userMapper.selectByPrimaryKey(emp_no);
        return Msg.success().add("pageinfo",user);
    }

    @ResponseBody
    @RequestMapping(value = "getUser",method = RequestMethod.GET)
    public Msg getUser(@RequestParam(value = "page",defaultValue = "1")Integer page){
        PageHelper.startPage(page,1);
        List<User> users  = userMapper.selectByExample(null);
        int p =users.size()/10;
        if (users.size()%10!=0) p++;
        PageInfo pageInfo = new PageInfo(users,p);
        return Msg.success().add("pageinfo",pageInfo);
    }

    @ResponseBody
    @RequestMapping(value = "deleteUserById",method = RequestMethod.GET)
    public Msg deleteUserById(@RequestParam String emp_no)
    {
        if(userMapper.deleteByPrimaryKey(emp_no)>0)
        {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "insertUser",method = RequestMethod.POST)
    public Msg insertUser(@RequestParam User user)
    {
        if(userMapper.insert(user)>0)
            return Msg.success();
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "updateUser",method = RequestMethod.POST)
    public Msg updatetUser(@RequestParam User user)
    {
        if(userMapper.updateByPrimaryKey(user)>0)
            return Msg.success();
        return Msg.fail();
    }

}
