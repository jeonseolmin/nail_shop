package entity;

import java.sql.Timestamp;

public class Point_histories {
    private long point_history_id;
    private int  change_amount;
    private int balance_after;
    private String change_type;
    private Timestamp created_at;

    //생성자
    public Point_histories(long point_history_id, int change_amount, int balance_after, String change_type, Timestamp created_at) {
        this.point_history_id = point_history_id;
        this.change_amount = change_amount;
        this.balance_after = balance_after;
        this.change_type = change_type;
        this.created_at = created_at;
    }

    //Getter Or Setter

    public long getPoint_history_id() {
        return point_history_id;
    }

    public void setPoint_history_id(long point_history_id) {
        this.point_history_id = point_history_id;
    }

    public int getChange_amount() {
        return change_amount;
    }

    public void setChange_amount(int change_amount) {
        this.change_amount = change_amount;
    }

    public int getBalance_after() {
        return balance_after;
    }

    public void setBalance_after(int balance_after) {
        this.balance_after = balance_after;
    }

    public String getChange_type() {
        return change_type;
    }

    public void setChange_type(String change_type) {
        this.change_type = change_type;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }
}
