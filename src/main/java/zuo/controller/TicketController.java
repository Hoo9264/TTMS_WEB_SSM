package zuo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import zuo.dao.TicketDao;
import zuo.entity.Ticket;

import java.util.List;

@Controller
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketDao ticketDao;
    @ResponseBody
    @RequestMapping("GetAllJsonTicket")
    private List<Ticket>  GetAllTicket()
    {
        List<Ticket> tickets;
        tickets = ticketDao.queryAll();
        return tickets;
    }
    @ResponseBody
    @RequestMapping("GetAllTicketBySchedId/{sched_id}")
    private List<Ticket>  GetAllTicketBySchedId(@PathVariable int sched_id)
    {
        List<Ticket> tickets;
        tickets = ticketDao.queryBySchedId(sched_id);
        return tickets;
    }

    @ResponseBody
    @RequestMapping("GetTicketById/{ticket_id}")
    private Ticket  GetTicketById(@PathVariable int ticket_id)
    {
        Ticket ticket = null;

        ticket = ticketDao.queryById(ticket_id);
        return ticket;
    }

    @ResponseBody
    @RequestMapping("DeleteTicketById/{ticket_id}")
    private String  DeleteTicketById(@PathVariable int ticket_id)
    {
        ticketDao.delete(ticket_id);
        return "success";
    }

}
