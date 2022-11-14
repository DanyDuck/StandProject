package APIjava.Models;

public class SaleAnnouncement {
    private int id;
    private int carId;
    private int sellerId;
    private String location;
    private boolean warranty;
    private int warrantyTime;
    private boolean secondKey;
    private double price;
    private boolean negotiable;

    private static final int INT_BY_DEFAULT = 0;
    private static final String STRING_BY_DEFAULT = "Non defined";
    private static final boolean BOOLEAN_BY_DEFAULT = false;
    private static final double DOUBLE_BY_DEFAULT = 0.0;

    public SaleAnnouncement() {
        this.id = INT_BY_DEFAULT;
        this.carId = INT_BY_DEFAULT;
        this.sellerId = INT_BY_DEFAULT;
        this.location = STRING_BY_DEFAULT;
        this.warranty = BOOLEAN_BY_DEFAULT;
        this.warrantyTime = INT_BY_DEFAULT;
        this.secondKey = BOOLEAN_BY_DEFAULT;
        this.price = DOUBLE_BY_DEFAULT;
        this.negotiable = BOOLEAN_BY_DEFAULT;
    }


    public SaleAnnouncement(int id,int carId, int sellerId,String location,boolean warranty, int warrantyTime, boolean secondkey, double price, boolean negotiable) {
        this.id = id;
        this.carId = carId;
        this.sellerId = sellerId;
        this.location = location;
        this.warranty = warranty;
        this.warrantyTime = warrantyTime;
        this.secondKey = secondkey;
        this.price = price;
        this.negotiable = negotiable;
    }

    public SaleAnnouncement(int carId,int sellerId,String location, boolean warranty, int warrantyTime, boolean secondkey, double price, boolean negotiable) {
        this.carId = carId;
        this.sellerId = sellerId;
        this.location = location;
        this.warranty = warranty;
        this.warrantyTime = warrantyTime;
        this.secondKey = secondkey;
        this.price = price;
        this.negotiable = negotiable;
    }

    public SaleAnnouncement(SaleAnnouncement announcement) {
        this.id = announcement.id;
        this.carId = announcement.carId;
        this.sellerId = announcement.sellerId;
        this.location = announcement.location;
        this.warranty = announcement.warranty;
        this.warrantyTime = announcement.warrantyTime;
        this.secondKey = announcement.secondKey;
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

    public int getSellerId() {
        return this.sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean hasWarranty() {
        return this.warranty;
    }

    public boolean getWarranty() {
        return this.warranty;
    }

    public void setWarranty(boolean warranty) {
        this.warranty = warranty;
    }

    public int getWarrantyTime() {
        return this.warrantyTime;
    }

    public void setWarrantyTime(int warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

    public boolean isSecondkey() {
        return this.secondKey;
    }

    public boolean getSecondkey() {
        return this.secondKey;
    }

    public void setSecondkey(boolean secondkey) {
        this.secondKey = secondkey;
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
            ", sellerId='" + getSellerId() + "'" +
            ", location='" + getLocation() + "'" +
            ", warranty='" + hasWarranty() + "'" +
            ", warrantyTime='" + getWarrantyTime() + "'" +
            ", secondkey='" + isSecondkey() + "'" +
            ", price='" + getPrice() + "'" +
            ", negotiable='" + isNegotiable() + "'" +
            "}";
    }    

}
