package entity;

public class MembershipPlans {
    private long membershipPlanId;
    private String planName;
    private String planType;
    private String paymentMethod;
    private  int paymentAmount;
    private int creditAmount;
    private boolean active;

    //생성자
    public MembershipPlans(long membershipPlanId, String planName, String planType, String paymentMethod, int paymentAmount, int creditAmount, boolean active) {
        this.membershipPlanId = membershipPlanId;
        this.planName = planName;
        this.planType = planType;
        this.paymentMethod = paymentMethod;
        this.paymentAmount = paymentAmount;
        this.creditAmount = creditAmount;
        this.active = active;
    }

    //Getter Or Setter

    public long getMembershipPlanId() {
        return membershipPlanId;
    }

    public void setMembershipPlanId(long membershipPlanId) {
        this.membershipPlanId = membershipPlanId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public int getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(int creditAmount) {
        this.creditAmount = creditAmount;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
