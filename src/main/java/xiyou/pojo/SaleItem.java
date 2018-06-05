package xiyou.pojo;

import java.math.BigDecimal;

public class SaleItem {
    private Long saleItemId;

    private Long ticketId;

    private Long saleId;

    private BigDecimal saleItemPrice;

    public Long getSaleItemId() {
        return saleItemId;
    }

    public void setSaleItemId(Long saleItemId) {
        this.saleItemId = saleItemId;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public Long getSaleId() {
        return saleId;
    }

    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    public BigDecimal getSaleItemPrice() {
        return saleItemPrice;
    }

    public void setSaleItemPrice(BigDecimal saleItemPrice) {
        this.saleItemPrice = saleItemPrice;
    }
}