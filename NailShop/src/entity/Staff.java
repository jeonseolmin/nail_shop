package entity;

import java.time.LocalDate;

public class Staff {
    private long staffId;
    private String name;
    private String phoneNumber;
    private String employmentStatus;
    private LocalDate hireDate;
    private LocalDate resignDate;
    private int baseSalary;

    //생성자
    public Staff(long staffId, String name, String phoneNumber, String employmentStatus, LocalDate hireDate, LocalDate resignDate, int baseSalary) {
        this.staffId = staffId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.employmentStatus = employmentStatus;
        this.hireDate = hireDate;
        this.resignDate = resignDate;
        this.baseSalary = baseSalary;
    }

    //Getter or Setter
    public long getStaffId() {
        return staffId;
    }

    public void setStaffId(long staffId) {
        this.staffId = staffId;
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

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public LocalDate getResignDate() {
        return resignDate;
    }

    public void setResignDate(LocalDate resignDate) {
        this.resignDate = resignDate;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
}
