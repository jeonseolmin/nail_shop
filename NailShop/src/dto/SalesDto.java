package dto;

import entity.Sales;

import java.sql.Timestamp;

public record SalesDto(
        long saleId,
        int paidAmount,
        int actualRevenue,
        String paymentMethod,
        Timestamp paidAt,
        String memo
        ) {
    public  static SalesDto fromEntity(Sales sales){
        return  new SalesDto(
                sales.getSaleId(),
                sales.getPaidAmount(),
                sales.getActualRevenue(),
                sales.getPaymentMethod(),
                sales.getPaidAt(),
                sales.getMemo()
        );
    }
}
