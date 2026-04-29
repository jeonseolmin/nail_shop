package entity;

public class Service {
    private long serviceId;
    private String serviceName;
    private int nonMemberPrice;
    private int memberPrice;
    private int durationMinutes;
    private boolean active;

    //생성자
    public Service(long serviceId, String serviceName, int nonMemberPrice, int memberPrice, int durationMinutes, boolean active) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.nonMemberPrice = nonMemberPrice;
        this.memberPrice = memberPrice;
        this.durationMinutes = durationMinutes;
        this.active = active;
    }

    //Getter or Setter

    public long getServiceId() {
        return serviceId;
    }

    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getNonMemberPrice() {
        return nonMemberPrice;
    }

    public void setNonMemberPrice(int nonMemberPrice) {
        this.nonMemberPrice = nonMemberPrice;
    }

    public int getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(int memberPrice) {
        this.memberPrice = memberPrice;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
