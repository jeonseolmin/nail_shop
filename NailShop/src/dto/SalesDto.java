package dto;

import entity.Sales;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public record SalesDto(
        long saleId,
        long customerId,
        long staffId,
        long serviceId,
        long promotionId,
        int paidAmount,
        int actualRevenue,
        String paymentMethod,
        LocalDateTime paidAt,
        String memo
        ) {
    public  static SalesDto fromEntity(Sales sales){
        return  new SalesDto(
                sales.getSaleId(),
                sales.getCustomerId(),
                sales.getStaffId(),
                sales.getServiceId(),
                sales.getPromotionId(),
                sales.getPaidAmount(),
                sales.getActualRevenue(),
                sales.getPaymentMethod(),
                sales.getPaidAt(),
                sales.getMemo()
        );
    }

    public static Sales fromDto(SalesDto sales){
        return  new Sales(
                sales.saleId(),
                sales.customerId(),
                sales.staffId(),
                sales.serviceId(),
                sales.promotionId(),
                sales.paidAmount(),
                sales.actualRevenue(),
                sales.paymentMethod(),
                sales.paidAt(),
                sales.memo()
        );
    }
}
