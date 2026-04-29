package dto;

import entity.CustomerMemberships;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public record CustomerMembershipsDto(
        long customerMembershipId,
        long customerId,
        long membershipPlanId,
        int remainingBalance,
        LocalDateTime joinedAt,
        LocalDateTime expiredAt,
        String status
) {
    public static CustomerMembershipsDto fromEntity(CustomerMemberships customerMemberships) {
        return new CustomerMembershipsDto(
                customerMemberships.getCustomerMembershipId(),
                customerMemberships.getCustomerId(),
                customerMemberships.getMembershipPlanId(),
                customerMemberships.getRemainingBalance(),
                customerMemberships.getJoinedAt(),
                customerMemberships.getExpiredAt(),
                customerMemberships.getStatus()
        );
    }

    public static CustomerMemberships fromDto(CustomerMembershipsDto customerMembershipsDto) {
        return new CustomerMemberships(
                customerMembershipsDto.customerMembershipId(),
                customerMembershipsDto.customerId(),
                customerMembershipsDto.customerMembershipId(),
                customerMembershipsDto.remainingBalance(),
                customerMembershipsDto.joinedAt(),
                customerMembershipsDto.expiredAt(),
                customerMembershipsDto.status()
        );
    }
}
