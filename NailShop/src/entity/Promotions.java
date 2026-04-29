package entity;

import java.time.LocalDate;

public class Promotions {
    private long promotionId;
    private String name;
    private String text;
    private int discountAmount;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean active;

    //생성자

    public Promotions(long promotionId, String name, String text, int discountAmount, LocalDate startDate, LocalDate endDate, boolean active) {
        this.promotionId = promotionId;
        this.name = name;
        this.text = text;
        this.discountAmount = discountAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.active = active;
    }
    public Promotions(String name, String text, int discountAmount, LocalDate startDate, LocalDate endDate, boolean active) {
        this.promotionId = 0;
        this.name = name;
        this.text = text;
        this.discountAmount = discountAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.active = active;
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


}
