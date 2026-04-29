package entity;

import java.time.LocalDateTime;

public class CustomerMemberships {
    private long customerMembershipId;
    private long customerId;
    private long membershipPlanId;
    private int remainingBalance;
    private LocalDateTime joinedAt;
    private LocalDateTime expiredAt;
    private String status;

    //생성자
    public CustomerMemberships(long customerMembershipId, long customerId, long membershipPlanId, int remainingBalance, LocalDateTime joinedAt, LocalDateTime expiredAt, String status) {
        this.customerMembershipId = customerMembershipId;
        this.customerId = customerId;
        this.membershipPlanId = membershipPlanId;
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

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getMembershipPlanId() {
        return membershipPlanId;
    }

    public void setMembershipPlanId(long membershipPlanId) {
        this.membershipPlanId = membershipPlanId;
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
