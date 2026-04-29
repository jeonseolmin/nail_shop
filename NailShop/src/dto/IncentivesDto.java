package dto;

import entity.Incentives;

public record IncentivesDto(
        long incentiveId,
        long staffId,
        long saleId,
        String incentiveType,
        int incentiveAmount,
        String settlementMonth
) {
    public static IncentivesDto fromEntity(Incentives incentives){
        return new IncentivesDto(
                incentives.getIncentiveId(),
                incentives.getStaffId(),
                incentives.getSaleId(),
                incentives.getIncentiveType(),
                incentives.getIncentiveAmount(),
                incentives.getSettlementMonth()
        );
    }

    public static Incentives fromDto(IncentivesDto incentivesDto){
        return new Incentives(
                incentivesDto.incentiveId(),
                incentivesDto.staffId(),
                incentivesDto.saleId(),
                incentivesDto.incentiveType(),
                incentivesDto.incentiveAmount(),
                incentivesDto.settlementMonth()
        );
    }


}
