package entity;

import java.util.Date;

public class Promotions {
    private long promotionId;
    private String name;
    private String text;
    private int discountAmount;
    private Date startDate;
    private  Date endDate;
    private boolean isActive;

    //생성자

    public Promotions(long promotionId, String name, String text, int discountAmount, Date startDate, Date endDate, boolean isActive) {
        this.promotionId = promotionId;
        this.name = name;
        this.text = text;
        this.discountAmount = discountAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isActive = isActive;
    }
    public Promotions(String name, String text, int discountAmount, Date startDate, Date endDate, boolean isActive) {
        this.promotionId = 0;
        this.name = name;
        this.text = text;
        this.discountAmount = discountAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isActive = isActive;
    }

    // Getter Or Setter
    public long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(long promotionId) {
        this.promotionId = promotionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        this.isActive = active;
    }


}
