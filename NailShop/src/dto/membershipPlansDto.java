package dto;

import entity.MembershipPlans;

public record membershipPlansDto(
        long membershipPlanId,
        String planName,
        String planType,
        String paymentMethod,
        int paymentAmount,
        int creditAmount,
        boolean isActive
) {
    public  static membershipPlansDto fromEntity(MembershipPlans membershipPlans){
        return new membershipPlansDto(
                membershipPlans.getMembershipPlanId(),
                membershipPlans.getPlanName(),
                membershipPlans.getPlanType(),
                membershipPlans.getPaymentMethod(),
                membershipPlans.getPaymentAmount(),
                membershipPlans.getCreditAmount(),
                membershipPlans.isActive()
        );
    }

    public static MembershipPlans fromDto(membershipPlansDto membershipPlansDto){
        return new MembershipPlans(
                membershipPlansDto.membershipPlanId(),
                membershipPlansDto.planName(),
                membershipPlansDto.planType(),
                membershipPlansDto.paymentMethod(),
                membershipPlansDto.paymentAmount(),
                membershipPlansDto.creditAmount(),
                membershipPlansDto.isActive()
        ) ;
    }

}
