package zuo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import zuo.dao.UserDao;
import zuo.entity.User;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController{

    @Autowired
    private UserDao userDao;


    @RequestMapping("GetAllUser")
  public String GetAllUser(Model model){
      List<User> users ;
      users = userDao.queryAll();

      model.addAttribute("userlist",users);
      return "list";
  }
    @ResponseBody
    @RequestMapping("GetAllJsonUser")
    public List<User> DeleteUser(Model model){
        List<User> users ;
        users = userDao.queryAll();

        return users;
    }
}
