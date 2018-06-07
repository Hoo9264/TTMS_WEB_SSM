package xiyou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xiyou.dao.ScheduleMapper;
import xiyou.pojo.Msg;
import xiyou.pojo.Schedule;

import java.util.List;
@CrossOrigin
@Controller
@RequestMapping("/schedule")
public class ScheduleController {
    @Autowired
    private ScheduleMapper scheduleMapper;

    @ResponseBody
    @RequestMapping(value = "getSchedule",method = RequestMethod.GET)
    public Msg getSchedule(@RequestParam(value = "page",defaultValue = "1")Integer page){
        PageHelper.startPage(page,1);
        List<Schedule> schedules  = scheduleMapper.selectByExample(null);
        int p =schedules.size()/10;
        if (schedules.size()%10!=0) p++;
        PageInfo pageInfo = new PageInfo(schedules,p);
        return Msg.success().add("info",pageInfo);
    }

    @ResponseBody
    @RequestMapping(value = "getScheduleByPlayId",method = RequestMethod.GET)
    public Msg getScheduleByPlayId(@RequestParam(value = "page",defaultValue = "1")Integer page,@RequestParam int play_id){
        PageHelper.startPage(page,1);
        List<Schedule> schedules  = scheduleMapper.selectByPlayId(play_id);
        int p =schedules.size()/10;
        if (schedules.size()%10!=0) p++;
        PageInfo pageInfo = new PageInfo(schedules,p);
        return Msg.success().add("info",pageInfo);
    }

    @ResponseBody
    @RequestMapping(value ="getScheduleById",method = RequestMethod.GET)
    public Msg getScheduleById(@RequestParam int sched_id)
    {
        return Msg.success().add("info",scheduleMapper.selectByPrimaryKey(sched_id));
    }

    @ResponseBody
    @RequestMapping(value = "deleteScheduleById",method = RequestMethod.GET)
    public Msg deleteScheduleById(@RequestParam int sched_id)
    {
        if(scheduleMapper.deleteByPrimaryKey(sched_id)>0)
        {
            return Msg.success();
        }
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "insertSchedule",method = RequestMethod.POST)
    public Msg insertSchedule(@RequestParam Schedule schedule)
    {
        if(scheduleMapper.insert(schedule)>0)
            return Msg.success();
        return Msg.fail();
    }

    @ResponseBody
    @RequestMapping(value = "updateSchedule",method = RequestMethod.POST)
    public Msg updateSchedule(@RequestParam Schedule schedule)
    {
        if(scheduleMapper.updateByPrimaryKey(schedule)>0)
            return Msg.success();
        return Msg.fail();
    }



}
