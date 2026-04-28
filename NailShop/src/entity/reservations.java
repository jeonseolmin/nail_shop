package entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class reservations {
    private long reservation_id;
    private LocalDateTime reservation_dateTime;
    private String reservation_status;
    private String text;
    private Timestamp create_at;

    //생성자
    public reservations(long reservation_id, LocalDateTime reservation_dateTime, String reservation_status, String text, Timestamp create_at) {
        this.reservation_id = reservation_id;
        this.reservation_dateTime = reservation_dateTime;
        this.reservation_status = reservation_status;
        this.text = text;
        this.create_at = create_at;
    }

    //Getter Or Setter

    public long getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(long reservation_id) {
        this.reservation_id = reservation_id;
    }

    public LocalDateTime getReservation_dateTime() {
        return reservation_dateTime;
    }

    public void setReservation_dateTime(LocalDateTime reservation_dateTime) {
        this.reservation_dateTime = reservation_dateTime;
    }

    public String getReservation_status() {
        return reservation_status;
    }

    public void setReservation_status(String reservation_status) {
        this.reservation_status = reservation_status;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Timestamp getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Timestamp create_at) {
        this.create_at = create_at;
    }
}
