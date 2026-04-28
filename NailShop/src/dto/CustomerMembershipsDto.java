package dto;

import entity.CustomerMemberships;

import java.sql.Timestamp;

public record CustomerMembershipsDto(
        long customerMembershipId,
        int remainingBalance,
        Timestamp joinedAt,
        Timestamp expiredAt,
        String status
) {
    public static CustomerMembershipsDto fromEntity(CustomerMemberships customerMemberships) {
        return new CustomerMembershipsDto(
                customerMemberships.getCustomerMembershipId(),
                customerMemberships.getRemainingBalance(),
                customerMemberships.getJoinedAt(),
                customerMemberships.getExpiredAt(),
                customerMemberships.getStatus()
        );
    }

    public static CustomerMemberships fromDto(CustomerMembershipsDto customerMembershipsDto) {
        return new CustomerMemberships(
                customerMembershipsDto.customerMembershipId(),
                customerMembershipsDto.remainingBalance(),
                customerMembershipsDto.joinedAt(),
                customerMembershipsDto.expiredAt(),
                customerMembershipsDto.status()
        );
    }
}
