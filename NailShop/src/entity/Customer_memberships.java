package entity;

import java.sql.Timestamp;

public class Customer_memberships {
    private long customerMembershipId;
    private  int remainingBalance;
    private Timestamp joinedAt;
    private Timestamp expiredAt;
    private String status;

    //생성자
    public Customer_memberships(long customerMembershipId, int remainingBalance, Timestamp joinedAt, Timestamp expiredAt, String status) {
        this.customerMembershipId = customerMembershipId;
        this.remainingBalance = remainingBalance;
        this.joinedAt = joinedAt;
        this.expiredAt = expiredAt;
        this.status = status;
    }

    //Getter Or Setter
    public long getCustomerMembershipId() {
        return customerMembershipId;
    }

    public void setCustomerMembershipId(long customerMembershipId) {
        this.customerMembershipId = customerMembershipId;
    }

    public int getRemainingBalance() {
        return remainingBalance;
    }

    public void setRemainingBalance(int remainingBalance) {
        this.remainingBalance = remainingBalance;
    }

    public Timestamp getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(Timestamp joinedAt) {
        this.joinedAt = joinedAt;
    }

    public Timestamp getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(Timestamp expiredAt) {
        this.expiredAt = expiredAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
