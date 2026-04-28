package dto;

import entity.PointHistories;

import java.sql.Timestamp;

public record PointHistoriesDto(
        long pointHistoryId,
        int changeAmount,
        int balanceAfter,
        String changeType,
        Timestamp createdAt
) {

    public static PointHistoriesDto fromEntity(PointHistories pointHistories) {
        return new PointHistoriesDto(
                pointHistories.getPointHistoryId(),
                pointHistories.getChangeAmount(),
                pointHistories.getBalanceAfter(),
                pointHistories.getChangeType(),
                pointHistories.getCreatedAt()
        );
    }

    public static PointHistories fromDto(PointHistoriesDto pointHistoriesDto) {
        return new PointHistories(
                pointHistoriesDto.pointHistoryId(),
                pointHistoriesDto.changeAmount(),
                pointHistoriesDto.balanceAfter(),
                pointHistoriesDto.changeType(),
                pointHistoriesDto.createdAt()
        );
    }
}
