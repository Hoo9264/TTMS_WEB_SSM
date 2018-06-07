package xiyou.mobileController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xiyou.dao.PlayMapper;
import xiyou.pojo.Play;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/mobilePlay")
public class MobilePlayController {
    @Autowired
    private PlayMapper playMapper;

    @ResponseBody
    @RequestMapping(value ="getPlayById",method = RequestMethod.GET)
    public Play getPlayById(@RequestParam int play_id)
    {
        return playMapper.selectByPrimaryKey(play_id);
    }
    @ResponseBody
    @RequestMapping(value = "getPlay",method = RequestMethod.GET)
    public List<Play> getPlay()
    {
        return playMapper.selectByExample(null);
    }

    @ResponseBody
    @RequestMapping(value = "deletePlayById",method = RequestMethod.GET)
    public String deletePlayById(@RequestParam int play_id)
    {
        if(playMapper.deleteByPrimaryKey(play_id)>0)
        {
            return "succeed";
        }
        return "failed";
    }

    @ResponseBody
    @RequestMapping(value = "insertPlay",method = RequestMethod.POST)
    public String insertPlay(@RequestParam Play play)
    {
        if(playMapper.insert(play)>0)
            return "succeed";
        return "failed";
    }

    @ResponseBody
    @RequestMapping(value = "updatePlay",method = RequestMethod.POST)
    public String updatePlay(@RequestParam Play play)
    {
        if(playMapper.updateByPrimaryKey(play)>0)
            return "succeed";
        return "failed";
    }

}
