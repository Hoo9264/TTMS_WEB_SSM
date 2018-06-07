package xiyou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xiyou.dao.PlayMapper;
import xiyou.pojo.Msg;
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
    public Msg getPlay(@RequestParam(value = "page",defaultValue = "1")Integer page){
        PageHelper.startPage(page,10);
        List<Play> plays  = playMapper.selectByExample(null);
        int p =plays.size()/10;
        if(plays.size()%10!=0) p++;
        PageInfo pageInfo = new PageInfo(plays,p);
       return Msg.success().add("info",pageInfo);
    }
    @RequestMapping(value = "getPlayById",method = RequestMethod.GET)
    public Msg getPlayById(@RequestParam int  playId)
    {
        return Msg.success().add("info",playService.selectByPrimaryKey(playId));
    }

    @ResponseBody
    @RequestMapping(value = "deletePlayById",method = RequestMethod.GET)
    public Msg deletePlayById(@RequestParam int play_id)
    {
        if(playMapper.deleteByPrimaryKey(play_id)>0)
        {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "insertPlay",method = RequestMethod.POST)
    public Msg insertPlay(@RequestParam Play play)
    {
        if(playMapper.insert(play)>0)
            return Msg.success();
        return Msg.fail();
    }
    @ResponseBody
    @RequestMapping(value = "updatePlay",method = RequestMethod.POST)
    public Msg updatePlay(@RequestParam Play play)
    {
        if(playMapper.updateByPrimaryKey(play)>0)
            return Msg.success();
        return Msg.fail();
    }
}
