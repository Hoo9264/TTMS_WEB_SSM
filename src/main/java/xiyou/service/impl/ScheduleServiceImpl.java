package xiyou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xiyou.dao.ScheduleMapper;
import xiyou.pojo.Schedule;
import xiyou.service.ScheduleService;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService{

    @Autowired
    private ScheduleMapper scheduleMapper;

    @Override
    public int insert(Schedule schedule) {
        return scheduleMapper.insert(schedule);
    }

    @Override
    public int update(Schedule schedule) {
        return scheduleMapper.updateByPrimaryKey(schedule);
    }

    @Override
    public int delete(int schedId) {
        return scheduleMapper.deleteByPrimaryKey(schedId);
    }

    @Override
    public List<Schedule> selectAll() {
        return scheduleMapper.selectByExample(null);
    }

    @Override
    public Schedule selectByPrimaryKey(int schedId) {
        return scheduleMapper.selectByPrimaryKey(schedId);
    }

    @Override
    public List<Schedule> selectByPlayId(int playId) {
        return scheduleMapper.selectByPlayId(playId);
    }
}
