package xiyou.service;

import xiyou.pojo.Schedule;

import java.util.List;

public interface ScheduleService {
    int insert(Schedule schedule);
    int update(Schedule schedule);
    int delete(int schedId);
    List<Schedule> selectAll();
    Schedule selectByPrimaryKey(int schedId);
    List<Schedule> selectByPlayId(int playId);
}
