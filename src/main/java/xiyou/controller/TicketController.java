package xiyou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xiyou.pojo.Msg;
import xiyou.pojo.Ticket;
import xiyou.service.TicketService;

import java.util.List;
@CrossOrigin//跨域访问
@Controller
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @ResponseBody
    @RequestMapping("getTicket")
    private Msg getTicket(@RequestParam(value = "page",defaultValue = "1")Integer page)
    {
        return Msg.success().add("info",ticketService.selectAll());
    }

    /**
     * 通过演出id查询票
     * @param page 第几页
     * @param sched_id
     * @return
     */
    @ResponseBody
    @RequestMapping("getTicketBySchedId")
    private Msg  getTicketBySchedId(@RequestParam(value = "page",defaultValue = "1")Integer page,@RequestParam int sched_id)
    {
        return Msg.success().add("info",ticketService.selectBySchedId(sched_id));
    }

    @ResponseBody
    @RequestMapping("getTicketById")
    private Msg  getTicketById(@RequestParam long ticket_id)
    {
        return Msg.success().add("info",ticketService.selectByPrimaryKey(ticket_id));
    }

    @ResponseBody
    @RequestMapping("deleteTicketById")
    private Msg  deleteTicketById(@RequestParam long ticket_id)
    {
        if (ticketService.delete(ticket_id)>0)
        return Msg.success();
        return Msg.fail();
    }

    @RequestMapping(value = "insertTicket",method = RequestMethod.POST)
    private Msg insertTicket(@RequestBody Ticket ticket)
    {
        if(ticketService.insert(ticket)>0)
        {
            return Msg.success();
        }
        return Msg.fail();
    }

    /**
     * Post方法请求跟新ticket
     * 请求时Ajax字符串必须拼接成‘{user:"aa",pass:"pppp"}'的形式
     * @param ticket
     * @return
     */
    @RequestMapping(value = "updateTicket",method = RequestMethod.POST)
    private Msg updateTicket(@RequestBody  Ticket ticket)
    {
        if(ticketService.update(ticket)>0)
        {
            return Msg.success();
        }
        return Msg.fail();
    }



}
