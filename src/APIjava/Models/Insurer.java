package APIjava.Models;

public class Insurer {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private String adress;
    private double rating;

    private static final int INT_BY_DEFAULT = 0;
    private static final String STRING_BY_DEFAULT = "Non Defined";
    private static final double DOUBLE_BY_DEFAULT = 0.0;


    public Insurer() {
        this.id = INT_BY_DEFAULT;
        this.name = STRING_BY_DEFAULT;
        this.email = STRING_BY_DEFAULT;
        this.phoneNumber = STRING_BY_DEFAULT;
        this.adress = STRING_BY_DEFAULT;
        this.rating = DOUBLE_BY_DEFAULT;
    }


    public Insurer(int id, String name, String email, String phoneNumber, String adress, double rating) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.rating = rating;
    }

    public Insurer(String name, String email, String phoneNumber, String adress, double rating) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.rating = rating;
    }

    public Insurer(Insurer insurer) {
        this.id = insurer.id;
        this.name = insurer.name;
        this.email = insurer.email;
        this.phoneNumber = insurer.phoneNumber;
        this.adress = insurer.adress;
        this.rating = insurer.rating;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            ", adress='" + getAdress() + "'" +
            ", rating='" + getRating() + "'" +
            "}";
    }

}
