package xiyou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xiyou.dao.TicketMapper;
import xiyou.pojo.Ticket;
import xiyou.service.TicketService;

import java.util.List;
@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketMapper ticketMapper;

    @Override
    public int insert(Ticket ticket) {
        return ticketMapper.insertSelective(ticket);
    }

    @Override
    public int update(Ticket ticket) {
        return ticketMapper.updateByPrimaryKey(ticket);
    }

    @Override
    public int delete(long ticketId) {
        return ticketMapper.deleteByPrimaryKey(ticketId);
    }

    @Override
    public List<Ticket> selectAll() {
        return ticketMapper.selectByExample(null);
    }

    @Override
    public List<Ticket> selectBySchedId(int schedId) {
        return ticketMapper.selectBySchedId(schedId);
    }

    @Override
    public Ticket selectByPrimaryKey(long ticketId) {
        return ticketMapper.selectByPrimaryKey(ticketId);
    }
}
