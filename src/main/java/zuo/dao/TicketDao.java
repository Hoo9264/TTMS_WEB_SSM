package zuo.dao;

import zuo.entity.Ticket;

import java.util.List;

public interface TicketDao {
    /**
     * 查询所有Ticket;
     * @return
     */
    List<Ticket> queryAll();

    /**
     * 插入
     * @param ticket
     */
    void insert(Ticket ticket);

    /**
     * 更新
     * @param ticket
     */
    void update(Ticket ticket);

    /**
     * 通过id删除
     * @param ticket_id
     */
    void delete(int ticket_id);
}
