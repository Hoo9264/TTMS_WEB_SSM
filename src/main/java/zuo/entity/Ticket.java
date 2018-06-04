package zuo.entity;

import java.util.Date;

public class Ticket {
    private int ticket_id;
    private int seat_id;
    private int sched_id;
    private double ticket_price;
    private int ticket_status; //0：待销售\r\n            1：锁定\r\n            9：卖出',
    private Date ticket_locked_time;
    public int getTicket_id() {
        return ticket_id;
    }
    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }
    public int getSeat_id() {
        return seat_id;
    }
    public void setSeat_id(int seat_id) {
        this.seat_id = seat_id;
    }
    public int getSched_id() {
        return sched_id;
    }
    public void setSched_id(int sched_id) {
        this.sched_id = sched_id;
    }
    public double getTicket_price() {
        return ticket_price;
    }
    public void setTicket_price(double ticket_price) {
        this.ticket_price = ticket_price;
    }
    public int getTicket_status() {
        return ticket_status;
    }
    public void setTicket_status(int ticket_status) {
        this.ticket_status = ticket_status;
    }
    public Date getTicket_locked_time() {
        return ticket_locked_time;
    }
    public void setTicket_locked_time(Date ticket_locked_time) {
        this.ticket_locked_time = ticket_locked_time;
    }
}
