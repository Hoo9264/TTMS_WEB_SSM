package xiyou.mobileController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xiyou.dao.StudioMapper;
import xiyou.pojo.Studio;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping(value = "/mobileStudio")
public class MobileStudioController {
    @Autowired
    private StudioMapper studioMapper;

    @RequestMapping(value = "/getStudio")
    @ResponseBody
    public List<Studio> getStudio()
    {
        return  studioMapper.selectByExample(null);
    }

    @ResponseBody
    @RequestMapping(value = "/getStudioById")
    public Studio getStudioById(@RequestParam int studio_id)
    {
        return studioMapper.selectByPrimaryKey(studio_id);
    }



}
