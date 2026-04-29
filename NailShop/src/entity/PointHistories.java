package entity;

import java.time.LocalDateTime;

public class PointHistories {
    private long pointHistoryId;
    private int changeAmount;
    private int balanceAfter;
    private String changeType;
    private LocalDateTime createdAt;

    //생성자
    public PointHistories(long pointHistoryId, int changeAmount, int balanceAfter, String changeType, LocalDateTime createdAt) {
        this.pointHistoryId = pointHistoryId;
        this.changeAmount = changeAmount;
        this.balanceAfter = balanceAfter;
        this.changeType = changeType;
        this.createdAt = createdAt;
    }

    //Getter Or Setter

    public long getPointHistoryId() {
        return pointHistoryId;
    }

    public void setPointHistoryId(long pointHistoryId) {
        this.pointHistoryId = pointHistoryId;
    }

    public int getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(int changeAmount) {
        this.changeAmount = changeAmount;
    }

    public int getBalanceAfter() {
        return balanceAfter;
    }

    public void setBalanceAfter(int balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
