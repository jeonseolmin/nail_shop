package entity;

import java.sql.Timestamp;

public class Sales {
    private long saleId;
    private int paidAmount;
    private int actual_revenue;
    private String paymentMethod;
    private Timestamp paidAt;
    private String memo;

    //생성자
    public Sales(long saleId, int paidAmount, int actual_revenue, String paymentMethod, Timestamp paidAt, String memo) {
        this.saleId = saleId;
        this.paidAmount = paidAmount;
        this.actual_revenue = actual_revenue;
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

    public int getActual_revenue() {
        return actual_revenue;
    }

    public void setActual_revenue(int actual_revenue) {
        this.actual_revenue = actual_revenue;
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
