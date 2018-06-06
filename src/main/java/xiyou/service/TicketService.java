package xiyou.service;

import xiyou.pojo.Ticket;

import java.util.List;

public interface TicketService {

    int insert(Ticket ticket);
    int update(Ticket ticket);
    int delete(long ticketId);
    List<Ticket> selectAll();
    List<Ticket> selectBySchedId(int schedId);
    Ticket selectByPrimaryKey(long ticketId);



}
