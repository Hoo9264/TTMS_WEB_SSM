package xiyou.dao;

import xiyou.pojo.Schedule;

import java.util.List;

public interface ScheduleDao {

    /**
     * 查询所有schedule;
     * @return
     */
    List<Schedule> queryAll();

    /**
     * 插入
     * @param schedule
     */
    void insert(Schedule schedule);

    /**
     * 更新
     * @param schedule
     */
    void update(Schedule schedule);

    /**
     * 通过id删除
     * @param sched_id
     */
    void delete(int sched_id);
}
