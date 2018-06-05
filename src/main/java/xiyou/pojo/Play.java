package xiyou.pojo;

import java.math.BigDecimal;

public class Play {
    private Integer playId;

    private String playType;

    private String playLang;

    private String playName;

    private String playIntroduction;

    private String playImage;

    private Integer playLength;

    private BigDecimal playTicketPrice;

    private Short playStatus;

    public Integer getPlayId() {
        return playId;
    }

    public void setPlayId(Integer playId) {
        this.playId = playId;
    }

    public String getPlayType() {
        return playType;
    }

    public void setPlayType(String playType) {
        this.playType = playType == null ? null : playType.trim();
    }

    public String getPlayLang() {
        return playLang;
    }

    public void setPlayLang(String playLang) {
        this.playLang = playLang == null ? null : playLang.trim();
    }

    public String getPlayName() {
        return playName;
    }

    public void setPlayName(String playName) {
        this.playName = playName == null ? null : playName.trim();
    }

    public String getPlayIntroduction() {
        return playIntroduction;
    }

    public void setPlayIntroduction(String playIntroduction) {
        this.playIntroduction = playIntroduction == null ? null : playIntroduction.trim();
    }

    public String getPlayImage() {
        return playImage;
    }

    public void setPlayImage(String playImage) {
        this.playImage = playImage == null ? null : playImage.trim();
    }

    public Integer getPlayLength() {
        return playLength;
    }

    public void setPlayLength(Integer playLength) {
        this.playLength = playLength;
    }

    public BigDecimal getPlayTicketPrice() {
        return playTicketPrice;
    }

    public void setPlayTicketPrice(BigDecimal playTicketPrice) {
        this.playTicketPrice = playTicketPrice;
    }

    public Short getPlayStatus() {
        return playStatus;
    }

    public void setPlayStatus(Short playStatus) {
        this.playStatus = playStatus;
    }
}