package entity;

import java.sql.Timestamp;

public class Customer_memberships {
    private long customer_membership_id;
    private  int remaining_balance;
    private Timestamp joined_at;
    private Timestamp expired_at;
    private String status;

    //생성자
    public Customer_memberships(long customer_membership_id, int remaining_balance, Timestamp joined_at, Timestamp expired_at, String status) {
        this.customer_membership_id = customer_membership_id;
        this.remaining_balance = remaining_balance;
        this.joined_at = joined_at;
        this.expired_at = expired_at;
        this.status = status;
    }

    //Getter Or Setter
    public long getCustomer_membership_id() {
        return customer_membership_id;
    }

    public void setCustomer_membership_id(long customer_membership_id) {
        this.customer_membership_id = customer_membership_id;
    }

    public int getRemaining_balance() {
        return remaining_balance;
    }

    public void setRemaining_balance(int remaining_balance) {
        this.remaining_balance = remaining_balance;
    }

    public Timestamp getJoined_at() {
        return joined_at;
    }

    public void setJoined_at(Timestamp joined_at) {
        this.joined_at = joined_at;
    }

    public Timestamp getExpired_at() {
        return expired_at;
    }

    public void setExpired_at(Timestamp expired_at) {
        this.expired_at = expired_at;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
