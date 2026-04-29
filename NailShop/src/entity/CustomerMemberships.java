package entity;

import java.time.LocalDateTime;

public class CustomerMemberships {
    private long customerMembershipId;
    private  int remainingBalance;
    private LocalDateTime joinedAt;
    private LocalDateTime expiredAt;
    private String status;

    //생성자
    public CustomerMemberships(long customerMembershipId, int remainingBalance, LocalDateTime joinedAt, LocalDateTime expiredAt, String status) {
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

    public LocalDateTime getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(LocalDateTime joinedAt) {
        this.joinedAt = joinedAt;
    }

    public LocalDateTime getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(LocalDateTime expiredAt) {
        this.expiredAt = expiredAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
