package xiyou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xiyou.dao.PlayMapper;
import xiyou.pojo.Play;
import xiyou.service.PlayService;

import java.util.List;
@CrossOrigin
@Controller
@RequestMapping("/play")
public class PlayController {

    @Autowired
    private PlayMapper playMapper;

    @Autowired
    private PlayService playService;

    @ResponseBody
    @RequestMapping(value = "getPlay",method = RequestMethod.GET)
    public PageInfo getPlay(@RequestParam(value = "page",defaultValue = "1")Integer page){
        PageHelper.startPage(page,10);
        List<Play> plays  = playMapper.selectByExample(null);
        int p =plays.size()/10;
        if(plays.size()%10!=0) p++;
        PageInfo pageInfo = new PageInfo(plays,p);
       return pageInfo;
    }
    @RequestMapping(value = "getPlayById",method = RequestMethod.GET)
    public Play getPlayById(@RequestParam int  playId)
    {
        return playService.selectByPrimaryKey(playId);
    }

}
