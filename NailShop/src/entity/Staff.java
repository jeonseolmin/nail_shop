package entity;

import java.util.Date;

public class Staff {
    private String name;
    private String phone_number;
    private String employment_status;
    private Date hire_date;
    private Date resign_date;
    private int base_salary;

    public Staff(String name, String phone_number, String employment_status, Date hire_date, Date resign_date, int base_salary) {
        this.name = name;
        this.phone_number = phone_number;
        this.employment_status = employment_status;
        this.hire_date = hire_date;
        this.resign_date = resign_date;
        this.base_salary = base_salary;
    }

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

    public String getEmployment_status() {
        return employment_status;
    }

    public void setEmployment_status(String employment_status) {
        this.employment_status = employment_status;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public Date getResign_date() {
        return resign_date;
    }

    public void setResign_date(Date resign_date) {
        this.resign_date = resign_date;
    }

    public int getBase_salary() {
        return base_salary;
    }

    public void setBase_salary(int base_salary) {
        this.base_salary = base_salary;
    }
}
