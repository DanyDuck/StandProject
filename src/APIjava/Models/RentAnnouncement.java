package APIjava.Models;

public class RentAnnouncement {
    private int id;
    private int carId;
    private int renterId;
    private String location;
    private boolean insurance;
    private int insuranceTime;
    private double price;
    private boolean negotiable;

    private static final int INT_BY_DEFAULT = 0;
    private static final String STRING_BY_DEFAULT = "Non Defined";
    private static final double DOUBLE_BY_DEFAULT = 0.0;
    private static final boolean BOOLEAN_BY_DEFAULT = false;

    public RentAnnouncement() {
        this.id = INT_BY_DEFAULT;
        this.carId = INT_BY_DEFAULT;
        this.renterId = INT_BY_DEFAULT;
        this.location = STRING_BY_DEFAULT;
        this.insurance = BOOLEAN_BY_DEFAULT;
        this.insuranceTime = INT_BY_DEFAULT;
        this.price = DOUBLE_BY_DEFAULT;
        this.negotiable = BOOLEAN_BY_DEFAULT;
    }

    public RentAnnouncement(int id, int carId, int renterId, String location, boolean insurance, int insuranceTime,
            double price, boolean negotiable) {
        this.id = id;
        this.carId = carId;
        this.renterId = renterId;
        this.location = location;
        this.insurance = insurance;
        this.insuranceTime = insuranceTime;
        this.price = price;
        this.negotiable = negotiable;
    }

    public RentAnnouncement(int carId, int renterId, String location, boolean insurance, int insuranceTime,
            double price, boolean negotiable) {
        this.carId = carId;
        this.renterId = renterId;
        this.location = location;
        this.insurance = insurance;
        this.insuranceTime = insuranceTime;
        this.price = price;
        this.negotiable = negotiable;
    }

    public RentAnnouncement(RentAnnouncement announcement) {
        this.id = announcement.id;
        this.carId = announcement.carId;
        this.renterId = announcement.renterId;
        this.location = announcement.location;
        this.insurance = announcement.insurance;
        this.insuranceTime = announcement.insuranceTime;
        this.price = announcement.price;
        this.negotiable = announcement.negotiable;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarId() {
        return this.carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getRenterId() {
        return this.renterId;
    }

    public void setRenterId(int renterId) {
        this.renterId = renterId;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public boolean hasInsurance() {
        return this.insurance;
    }

    public boolean getInsurance() {
        return this.insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    public int getInsuranceTime() {
        return this.insuranceTime;
    }

    public void setInsuranceTime(int insuranceTime) {
        this.insuranceTime = insuranceTime;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNegotiable() {
        return this.negotiable;
    }

    public boolean getNegotiable() {
        return this.negotiable;
    }

    public void setNegotiable(boolean negotiable) {
        this.negotiable = negotiable;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", carId='" + getCarId() + "'" +
            ", renterId='" + getRenterId() + "'" +
            ", location='" + getLocation() + "'" +
            ", insurance='" + hasInsurance() + "'" +
            ", insuranceTime='" + getInsuranceTime() + "'" +
            ", price='" + getPrice() + "'" +
            ", negotiable='" + isNegotiable() + "'" +
            "}";
    }

}
