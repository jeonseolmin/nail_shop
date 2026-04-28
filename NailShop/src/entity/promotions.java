package entity;

import java.util.Date;

public class promotions {
    private long promotion_id;
    private String name;
    private String text;
    private int discount_amount;
    private Date start_date;
    private  Date end_date;
    private boolean is_active;

    //생성자

    public promotions(long promotion_id, String name, String text, int discount_amount, Date start_date, Date end_date, boolean is_active) {
        this.promotion_id = promotion_id;
        this.name = name;
        this.text = text;
        this.discount_amount = discount_amount;
        this.start_date = start_date;
        this.end_date = end_date;
        this.is_active = is_active;
    }
    public promotions(String name, String text, int discount_amount, Date start_date, Date end_date, boolean is_active) {
        this.promotion_id = 0;
        this.name = name;
        this.text = text;
        this.discount_amount = discount_amount;
        this.start_date = start_date;
        this.end_date = end_date;
        this.is_active = is_active;
    }

    // Getter Or Setter
    public long getPromotion_id() {
        return promotion_id;
    }

    public void setPromotion_id(long promotion_id) {
        this.promotion_id = promotion_id;
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

    public int getDiscount_amount() {
        return discount_amount;
    }

    public void setDiscount_amount(int discount_amount) {
        this.discount_amount = discount_amount;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }


}
