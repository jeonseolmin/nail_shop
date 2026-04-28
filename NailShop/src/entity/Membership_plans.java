package entity;

public class Membership_plans {
    private long membership_plan_id;
    private String plan_name;
    private String plan_type;
    private String payment_method;
    private  int payment_amount;
    private int  credit_amount;
    private boolean is_active;

    //생성자
    public Membership_plans(long membership_plan_id, String plan_name, String plan_type, String payment_method, int payment_amount, int credit_amount, boolean is_active) {
        this.membership_plan_id = membership_plan_id;
        this.plan_name = plan_name;
        this.plan_type = plan_type;
        this.payment_method = payment_method;
        this.payment_amount = payment_amount;
        this.credit_amount = credit_amount;
        this.is_active = is_active;
    }

    //Getter Or Setter

    public long getMembership_plan_id() {
        return membership_plan_id;
    }

    public void setMembership_plan_id(long membership_plan_id) {
        this.membership_plan_id = membership_plan_id;
    }

    public String getPlan_name() {
        return plan_name;
    }

    public void setPlan_name(String plan_name) {
        this.plan_name = plan_name;
    }

    public String getPlan_type() {
        return plan_type;
    }

    public void setPlan_type(String plan_type) {
        this.plan_type = plan_type;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public int getPayment_amount() {
        return payment_amount;
    }

    public void setPayment_amount(int payment_amount) {
        this.payment_amount = payment_amount;
    }

    public int getCredit_amount() {
        return credit_amount;
    }

    public void setCredit_amount(int credit_amount) {
        this.credit_amount = credit_amount;
    }

    public boolean is_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }
}
