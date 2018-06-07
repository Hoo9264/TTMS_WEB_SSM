package xiyou.mobileController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xiyou.dao.ScheduleMapper;
import xiyou.pojo.Schedule;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/mobileSchedule")
public class MobileScheduleController {

    @Autowired
    private ScheduleMapper scheduleMapper;


    @ResponseBody
    @RequestMapping(value ="getScheduleById",method = RequestMethod.GET)
    public Schedule getScheduleById(@RequestParam int sched_id)
    {
        return scheduleMapper.selectByPrimaryKey(sched_id);
    }
    @ResponseBody
    @RequestMapping(value = "getSchedule",method = RequestMethod.GET)
    public List<Schedule> getSchedule()
    {
        return scheduleMapper.selectByExample(null);
    }

    @ResponseBody
    @RequestMapping(value = "deleteScheduleById",method = RequestMethod.GET)
    public String deleteScheduleById(@RequestParam int schedule_id)
    {
        if(scheduleMapper.deleteByPrimaryKey(schedule_id)>0)
        {
            return "succeed";
        }
        return "failed";
    }

    @ResponseBody
    @RequestMapping(value = "insertSchedule",method = RequestMethod.POST)
    public String insertSchedule(@RequestParam Schedule schedule)
    {
        if(scheduleMapper.insert(schedule)>0)
            return "succeed";
        return "failed";
    }

    @ResponseBody
    @RequestMapping(value = "updateSchedule",method = RequestMethod.POST)
    public String updateSchedule(@RequestParam Schedule schedule)
    {
        if(scheduleMapper.updateByPrimaryKey(schedule)>0)
            return "succeed";
        return "failed";
    }

}
