package entity;

import java.util.Date;

public class Customer {
    private  String name;
    private String phone_number;
    private Date birth_date;
    private long staff_id;
    private String text;
    private String status;

    //getter && setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    public Date getBirth_date() {
        return birth_date;
    }
    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }
    public long getStaff_id() {
        return staff_id;
    }
    public void setStaff_id(long staff_id) {
        this.staff_id = staff_id;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    //생성자
    public Customer(String name, String phone_number, Date birth_date, long staff_id, String text, String status) {
        this.name = name;
        this.phone_number = phone_number;
        this.birth_date = birth_date;
        this.staff_id = staff_id;
        this.text = text;
        this.status = status;
    }
}
