package entity;

public class Incentives {
        private  long incentive_id;
        private String incentive_type;
        private int incentive_amount;
        private  String settlement_month;

        //생성자
    public Incentives(long incentive_id, String incentive_type, int incentive_amount, String settlement_month) {
        this.incentive_id = incentive_id;
        this.incentive_type = incentive_type;
        this.incentive_amount = incentive_amount;
        this.settlement_month = settlement_month;
    }

    //Getter Or Setter
    public long getIncentive_id() {
        return incentive_id;
    }

    public void setIncentive_id(long incentive_id) {
        this.incentive_id = incentive_id;
    }

    public String getIncentive_type() {
        return incentive_type;
    }

    public void setIncentive_type(String incentive_type) {
        this.incentive_type = incentive_type;
    }

    public int getIncentive_amount() {
        return incentive_amount;
    }

    public void setIncentive_amount(int incentive_amount) {
        this.incentive_amount = incentive_amount;
    }

    public String getSettlement_month() {
        return settlement_month;
    }

    public void setSettlement_month(String settlement_month) {
        this.settlement_month = settlement_month;
    }
}
