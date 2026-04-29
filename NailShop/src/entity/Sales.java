package entity;

import java.time.LocalDateTime;

public class Sales {
    private long saleId;
    private long customerId;
    private long staffId;
    private long serviceId;
    private long promotionId;
    private int paidAmount;
    private int actualRevenue;
    private String paymentMethod;
    private LocalDateTime paidAt;
    private String memo;

    //생성자

    public Sales(long saleId, long customerId, long staffId, long serviceId, long promotionId, int paidAmount, int actualRevenue, String paymentMethod, LocalDateTime paidAt, String memo) {
        this.saleId = saleId;
        this.customerId = customerId;
        this.staffId = staffId;
        this.serviceId = serviceId;
        this.promotionId = promotionId;
        this.paidAmount = paidAmount;
        this.actualRevenue = actualRevenue;
        this.paymentMethod = paymentMethod;
        this.paidAt = paidAt;
        this.memo = memo;
    }

    //Getter or Setter

    public long getSaleId() {
        return saleId;
    }

    public void setSaleId(long saleId) {
        this.saleId = saleId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getStaffId() {
        return staffId;
    }

    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }

    public long getServiceId() {
        return serviceId;
    }

    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
    }

    public long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(long promotionId) {
        this.promotionId = promotionId;
    }

    public int getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(int paidAmount) {
        this.paidAmount = paidAmount;
    }

    public int getActualRevenue() {
        return actualRevenue;
    }

    public void setActualRevenue(int actualRevenue) {
        this.actualRevenue = actualRevenue;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public LocalDateTime getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(LocalDateTime paidAt) {
        this.paidAt = paidAt;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
