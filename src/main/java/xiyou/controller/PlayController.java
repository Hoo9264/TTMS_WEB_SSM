package xiyou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xiyou.dao.PlayMapper;
import xiyou.pojo.Play;

import java.util.List;

@Controller
@RequestMapping("/play")
public class PlayController {

    @Autowired
    private PlayMapper playMapper;

    @ResponseBody
    @RequestMapping("getPlay")
    public PageInfo getPlay(@RequestParam(value = "page",defaultValue = "1")Integer page){
        PageHelper.startPage(page,10);
        List<Play> plays  = playMapper.selectByExample(null);
        int p =plays.size()/10;
        if(plays.size()%10!=0) p++;
        PageInfo pageInfo = new PageInfo(plays,p);
       return pageInfo;
    }
}
