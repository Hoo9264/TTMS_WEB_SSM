package xiyou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xiyou.dao.StudioMapper;
import xiyou.pojo.Studio;

import java.util.List;

@Controller
@RequestMapping("/studio")
public class StudioController {
    @Autowired
    private StudioMapper studioMapper;

    public PageInfo getStudio(@RequestParam(value  = "page",defaultValue = "1")Integer page)
    {
        PageHelper.startPage(page,10);
        List<Studio> studios = studioMapper.selectByExample(null);
        int p = studios.size()/10;
        if(studios.size()%10!=0) p++;
        PageInfo pageInfo = new PageInfo(studios,p);
        return pageInfo;
    }
}
