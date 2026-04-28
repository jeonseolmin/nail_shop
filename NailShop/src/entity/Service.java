package entity;

public class Service {
    private long service_id;
    private String service_name;
    private int non_member_price;
    private int member_price;
    private int duration_minutes;
    private boolean is_active;

    //생성자
    public Service(long service_id, String service_name, int non_member_price, int member_price, int duration_minutes, boolean is_active) {
        this.service_id = service_id;
        this.service_name = service_name;
        this.non_member_price = non_member_price;
        this.member_price = member_price;
        this.duration_minutes = duration_minutes;
        this.is_active = is_active;
    }

    //Getter or Setter

    public long getService_id() {
        return service_id;
    }

    public void setService_id(long service_id) {
        this.service_id = service_id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public int getNon_member_price() {
        return non_member_price;
    }

    public void setNon_member_price(int non_member_price) {
        this.non_member_price = non_member_price;
    }

    public int getMember_price() {
        return member_price;
    }

    public void setMember_price(int member_price) {
        this.member_price = member_price;
    }

    public int getDuration_minutes() {
        return duration_minutes;
    }

    public void setDuration_minutes(int duration_minutes) {
        this.duration_minutes = duration_minutes;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }
}
