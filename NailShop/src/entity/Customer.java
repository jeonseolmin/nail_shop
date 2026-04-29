package entity;

import java.time.LocalDate;
import java.util.Date;

public class Customer {
    private long customerId;
    private  String name;
    private String phoneNumber;
    private LocalDate birthDate;
    private long staffId;
    private String text;
    private String status;

    //getter && setter
    public long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public long getStaffId() {
        return staffId;
    }
    public void setStaffId(long staffId) {
        this.staffId = staffId;
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
    public Customer(long customerId, String name, String phoneNumber, LocalDate birthDate, long staffId, String text, String status) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.staffId = staffId;
        this.text = text;
        this.status = status;
    }
    public Customer(String name, String phoneNumber, LocalDate birthDate, long staffId, String text, String status) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.staffId = staffId;
        this.text = text;
        this.status = status;
    }
}
