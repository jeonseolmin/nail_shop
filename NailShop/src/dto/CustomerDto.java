package dto;

import java.util.Date;

public record CustomerDto(
        long customer_id,
        String name,
        String phone_number,
        Date birth_date,
        String text,
        String status
) {

}
