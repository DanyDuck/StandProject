package APIjava.Models;

public class RentDeal {
    private int id;
    private int clientId;
    private int announcementId;
    private double price;
    private boolean done;

    private static final int INT_BY_DEFAULT = 0;
    private static final double DOUBLE_BY_DEFAULT = 0.0;
    private static final boolean BOOLEAN_BY_DEFAULT = false;

    public RentDeal() {
        this.id = INT_BY_DEFAULT;
        this.clientId = INT_BY_DEFAULT;
        this.announcementId = INT_BY_DEFAULT;
        this.price = DOUBLE_BY_DEFAULT;
        this.done = BOOLEAN_BY_DEFAULT;
    }


    public RentDeal(int id, int clientId, int announcementId, double price, boolean done) {
        this.id = id;
        this.clientId = clientId;
        this.announcementId = announcementId;
        this.price = price;
        this.done = done;
    }

    public RentDeal(int clientId, int announcementId, double price, boolean done) {
        this.clientId = clientId;
        this.announcementId = announcementId;
        this.price = price;
        this.done = done;
    }


    public RentDeal(RentDeal deals) {
        this.id = deals.id;
        this.clientId = deals.clientId;
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

    public int getClientId() {
        return this.clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
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
            ", clientId='" + getClientId() + "'" +
            ", announcementId='" + getAnnouncementId() + "'" +
            ", price='" + getPrice() + "'" +
            ", done='" + isDone() + "'" +
            "}";
    }

}
