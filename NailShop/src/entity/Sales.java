package entity;

import java.sql.Timestamp;

public class Sales {
    private long sale_id;
    private int paid_amount;
    private int actual_revenue;
    private String payment_method;
    private Timestamp paid_at;
    private String memo;

    //생성자
    public Sales(long sale_id, int paid_amount, int actual_revenue, String payment_method, Timestamp paid_at, String memo) {
        this.sale_id = sale_id;
        this.paid_amount = paid_amount;
        this.actual_revenue = actual_revenue;
        this.payment_method = payment_method;
        this.paid_at = paid_at;
        this.memo = memo;
    }
    //Getter or Setter

    public long getSale_id() {
        return sale_id;
    }

    public void setSale_id(long sale_id) {
        this.sale_id = sale_id;
    }

    public int getPaid_amount() {
        return paid_amount;
    }

    public void setPaid_amount(int paid_amount) {
        this.paid_amount = paid_amount;
    }

    public int getActual_revenue() {
        return actual_revenue;
    }

    public void setActual_revenue(int actual_revenue) {
        this.actual_revenue = actual_revenue;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public Timestamp getPaid_at() {
        return paid_at;
    }

    public void setPaid_at(Timestamp paid_at) {
        this.paid_at = paid_at;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
