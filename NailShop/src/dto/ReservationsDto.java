package dto;

import entity.Reservations;
import java.time.LocalDateTime;

public record ReservationsDto(
        long reservationId,
        LocalDateTime reservationDateTime,
        String reservationStatus,
        String text,
        LocalDateTime createAt
) {
    public static ReservationsDto fromEntity(Reservations reservations){
        return new ReservationsDto(
                reservations.getReservationId(),
                reservations.getReservationDateTime(),
                reservations.getReservationStatus(),
                reservations.getText(),
                reservations.getCreateAt()
        );
    }
    public static Reservations fromDto(ReservationsDto reservationsDto){
        return  new Reservations(
                reservationsDto.reservationId(),
                reservationsDto.reservationDateTime(),
                reservationsDto.reservationStatus(),
                reservationsDto.text(),
                reservationsDto.createAt()
        );
    }
}
