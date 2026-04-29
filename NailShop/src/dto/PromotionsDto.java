package dto;

import entity.Promotions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public record PromotionsDto(
        long promotionId,
        String name,
        String text,
        int discountAmount,
        LocalDate startDate,
        LocalDate endDate,
        boolean isActive

) {
    public static PromotionsDto fromEntity(Promotions promotions) {
        return new PromotionsDto(
                promotions.getPromotionId(),
                promotions.getName(),
                promotions.getText(),
                promotions.getDiscountAmount(),
                promotions.getStartDate(),
                promotions.getEndDate(),
                promotions.isActive()
        );
    }

    public static Promotions fromDto(PromotionsDto promotionsDto){
        return new Promotions(
                promotionsDto.promotionId(),
                promotionsDto.name(),
                promotionsDto.text(),
                promotionsDto.discountAmount(),
                promotionsDto.startDate(),
                promotionsDto.endDate(),
                promotionsDto.isActive()
        );
    }
}
