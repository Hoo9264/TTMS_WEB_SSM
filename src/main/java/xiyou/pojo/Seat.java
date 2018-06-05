package xiyou.pojo;

public class Seat {
    private Integer seatId;

    private Integer studioId;

    private Integer seatRow;

    private Integer seatColumn;

    private Short seatStatus;

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public Integer getStudioId() {
        return studioId;
    }

    public void setStudioId(Integer studioId) {
        this.studioId = studioId;
    }

    public Integer getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(Integer seatRow) {
        this.seatRow = seatRow;
    }

    public Integer getSeatColumn() {
        return seatColumn;
    }

    public void setSeatColumn(Integer seatColumn) {
        this.seatColumn = seatColumn;
    }

    public Short getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(Short seatStatus) {
        this.seatStatus = seatStatus;
    }
}