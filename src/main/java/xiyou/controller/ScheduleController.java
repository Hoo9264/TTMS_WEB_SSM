package xiyou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xiyou.dao.ScheduleMapper;
import xiyou.pojo.Schedule;

import java.util.List;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {
    @Autowired
    private ScheduleMapper scheduleMapper;

    @ResponseBody
    @RequestMapping("getSchedule")
    public PageInfo getPlay(@RequestParam(value = "page",defaultValue = "1")Integer page){
        PageHelper.startPage(page,1);
        List<Schedule> schedules  = scheduleMapper.selectByExample(null);
        int p =schedules.size()/10;
        if (schedules.size()%10!=0) p++;
        PageInfo pageInfo = new PageInfo(schedules,p);
        return pageInfo;
    }


}
