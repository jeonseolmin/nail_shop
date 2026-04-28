package entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class reservations {
    private long reservationId;
    private LocalDateTime reservationDateTime;
    private String reservationStatus;
    private String text;
    private Timestamp createAt;

    //생성자
    public reservations(long reservationId, LocalDateTime reservationDateTime, String reservationStatus, String text, Timestamp createAt) {
        this.reservationId = reservationId;
        this.reservationDateTime = reservationDateTime;
        this.reservationStatus = reservationStatus;
        this.text = text;
        this.createAt = createAt;
    }

    //Getter Or Setter

    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    public LocalDateTime getReservationDateTime() {
        return reservationDateTime;
    }

    public void setReservationDateTime(LocalDateTime reservationDateTime) {
        this.reservationDateTime = reservationDateTime;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }
}
