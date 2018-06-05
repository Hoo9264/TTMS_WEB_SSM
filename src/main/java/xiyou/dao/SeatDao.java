package xiyou.dao;

import xiyou.pojo.Seat;

import java.util.List;

public interface SeatDao {
    /**
     * 查询所有seat;
     * @return
     */
    List<Seat> queryAll();

    /**
     * 插入
     * @param seat
     */
    void insert(Seat seat);

    /**
     * 更新
     * @param seat
     */
    void update(Seat seat);

    /**
     * 通过id删除
     * @param seat_id
     */
    void delete(int seat_id);
}
