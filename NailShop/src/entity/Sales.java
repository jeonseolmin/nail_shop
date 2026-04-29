package entity;

import java.sql.Timestamp;

public class Sales {
    private long saleId;
    private int paidAmount;
    private int actualRevenue;
    private String paymentMethod;
    private Timestamp paidAt;
    private String memo;

    //생성자
    public Sales(long saleId, int paidAmount, int actualRevenue, String paymentMethod, Timestamp paidAt, String memo) {
        this.saleId = saleId;
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

    public Timestamp getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(Timestamp paidAt) {
        this.paidAt = paidAt;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
