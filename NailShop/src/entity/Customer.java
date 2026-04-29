package entity;

import java.time.LocalDate;

public class Customer {
    private long customerId;
    private  String name;
    private String phoneNumber;
    private LocalDate birthDate;
    private LocalDate firstVisitDate;
    private long staffId;
    private String notes;
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
    public LocalDate getFirstVisitDate() {
        return firstVisitDate;
    }
    public void setFirstVisitDate(LocalDate firstVisitDate) {
        this.firstVisitDate = firstVisitDate;
    }
    public long getStaffId() {
        return staffId;
    }
    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    //생성자

    public Customer(long customerId, String name, String phoneNumber, LocalDate birthDate, LocalDate firstVisitDate, long staffId, String notes, String status) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.firstVisitDate = firstVisitDate;
        this.staffId = staffId;
        this.notes = notes;
        this.status = status;
    }
}
