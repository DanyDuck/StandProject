package APIjava.Models;

public class SaleDeal {
    private int id;
    private int carId;
    private int sellerId;
    private int buyerId;
    private int announcementId;
    private double price;
    private boolean done;

    private static final int INT_BY_DEFAULT = 0;
    private static final double DOUBLE_BY_DEFAULT = 0.0;
    private static final boolean BOOLEAN_BY_DEFAULT = false;

    public SaleDeal() {
        this.id = INT_BY_DEFAULT;
        this.carId = INT_BY_DEFAULT;
        this.sellerId = INT_BY_DEFAULT;
        this.buyerId = INT_BY_DEFAULT;
        this.announcementId = INT_BY_DEFAULT;
        this.price = DOUBLE_BY_DEFAULT;
        this.done = BOOLEAN_BY_DEFAULT;
    }


    public SaleDeal(int id, int carId, int sellerId, int buyerId, int announcementId, double price, boolean done) {
        this.id = id;
        this.carId = carId;
        this.sellerId = sellerId;
        this.buyerId = buyerId;
        this.announcementId = announcementId;
        this.price = price;
        this.done = done;
    }

    public SaleDeal(int carId, int sellerId, int buyerId, int announcementId, double price, boolean done) {
        this.carId = carId;
        this.sellerId = sellerId;
        this.buyerId = buyerId;
        this.announcementId = announcementId;
        this.price = price;
        this.done = done;
    }


    public SaleDeal(SaleDeal deals) {
        this.id = deals.id;
        this.carId = deals.carId;
        this.sellerId = deals.sellerId;
        this.buyerId = deals.buyerId;
        this.announcementId = deals.announcementId;
        this.price = deals.price;
        this.done = deals.done;
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

    public int getBuyerId() {
        return this.buyerId;
    }

    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }

    public int getAnnouncementId() {
        return this.announcementId;
    }

    public void setAnnouncementId(int announcementId) {
        this.announcementId = announcementId;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDone() {
        return this.done;
    }

    public boolean getDone() {
        return this.done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", carId='" + getCarId() + "'" +
            ", sellerId='" + getSellerId() + "'" +
            ", buyerId='" + getBuyerId() + "'" +
            ", announcementId='" + getAnnouncementId() + "'" +
            ", price='" + getPrice() + "'" +
            ", done='" + isDone() + "'" +
            "}";
    }

}
