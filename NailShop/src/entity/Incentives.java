package entity;

public class Incentives {
        private  long incentiveId;
        private long staffId;
        private long saleId;
        private String incentiveType;
        private int incentiveAmount;
        private  String settlementMonth;

        //생성자


    public Incentives(long incentiveId, long staffId, long saleId, String incentiveType, int incentiveAmount, String settlementMonth) {
        this.incentiveId = incentiveId;
        this.staffId = staffId;
        this.saleId = saleId;
        this.incentiveType = incentiveType;
        this.incentiveAmount = incentiveAmount;
        this.settlementMonth = settlementMonth;
    }

    //Getter Or Setter
    public long getIncentiveId() {
        return incentiveId;
    }

    public void setIncentiveId(long incentiveId) {
        this.incentiveId = incentiveId;
    }

    public long getStaffId() {
        return staffId;
    }

    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }

    public long getSaleId() {
        return saleId;
    }

    public void setSaleId(long saleId) {
        this.saleId = saleId;
    }

    public String getIncentiveType() {
        return incentiveType;
    }

    public void setIncentiveType(String incentiveType) {
        this.incentiveType = incentiveType;
    }

    public int getIncentiveAmount() {
        return incentiveAmount;
    }

    public void setIncentiveAmount(int incentiveAmount) {
        this.incentiveAmount = incentiveAmount;
    }

    public String getSettlementMonth() {
        return settlementMonth;
    }

    public void setSettlementMonth(String settlementMonth) {
        this.settlementMonth = settlementMonth;
    }
}
