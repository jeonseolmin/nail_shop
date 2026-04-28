package dto;

import entity.Incentives;

public record IncentivesDto(
        long incentiveId,
        String incentiveType,
        int incentiveAmount,
        String settlementMonth
) {
    public static IncentivesDto fromEntity(Incentives incentives){
        return new IncentivesDto(
                incentives.getIncentiveId(),
                incentives.getIncentiveType(),
                incentives.getIncentiveAmount(),
                incentives.getSettlementMonth()
        );
    }

    public static Incentives fromDto(IncentivesDto incentivesDto){
        return new Incentives(
                incentivesDto.incentiveId(),
                incentivesDto.incentiveType(),
                incentivesDto.incentiveAmount(),
                incentivesDto.settlementMonth()
        );
    }


}
