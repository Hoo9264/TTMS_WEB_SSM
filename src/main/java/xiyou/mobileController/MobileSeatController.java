package xiyou.mobileController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import xiyou.dao.SeatMapper;

@CrossOrigin
@Controller
@RequestMapping(value = "/mobileSeat")
public class MobileSeatController {

    @Autowired
    private SeatMapper seatMapper;



}
