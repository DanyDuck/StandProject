package APIjava.Models;

import java.sql.Date;

public class User {
    private int id;
    private String fullname;
    private String email;
    private String password;
    private String phoneNumber;
    private String nationality;
    private String district;
    private String city;
    private String birthDate;
    private Date accountCreationDate;
    private boolean admin;

    private static final int INT_BY_DEFAULT = 0;
    private static final String STRING_BY_DEFAULT = "Non Defined";
    private static final Date DATE_BY_DEFAULT = new Date(System.currentTimeMillis());
    private static final boolean BOOLEAN_BY_DEFAULT = false;
    

    public User() {
        this.id = INT_BY_DEFAULT;
        this.fullname = STRING_BY_DEFAULT;
        this.email = STRING_BY_DEFAULT;
        this.password = STRING_BY_DEFAULT;
        this.phoneNumber = STRING_BY_DEFAULT;
        this.nationality = STRING_BY_DEFAULT;
        this.district = STRING_BY_DEFAULT;
        this.city = STRING_BY_DEFAULT;
        this.birthDate = STRING_BY_DEFAULT;
        this.accountCreationDate = DATE_BY_DEFAULT;
        this.admin = BOOLEAN_BY_DEFAULT;
    }


    public User(int id, String fullname, String email, String password, String phoneNumber, String nacionality, String district, String city, String birthDate, Date accountCreationDate, boolean admin) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.nationality = nacionality;
        this.district = district;
        this.city = city;
        this.birthDate = birthDate;
        this.accountCreationDate = accountCreationDate;
        this.admin = admin;
    }

    public User(String fullname, String email, String password, String phoneNumber, String nacionality, String district, String city, String birthDate, Date accountCreationDate, boolean admin) {
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.nationality = nacionality;
        this.district = district;
        this.city = city;
        this.birthDate = birthDate;
        this.accountCreationDate = accountCreationDate;
        this.admin = admin;
    }

    public User(int id, String fullname, String email, String phoneNumber, String nacionality, String district, String city, String birthDate, Date accountCreationDate, boolean admin) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.nationality = nacionality;
        this.district = district;
        this.city = city;
        this.birthDate = birthDate;
        this.accountCreationDate = accountCreationDate;
        this.admin = admin;
    }

    public User(User user) {
        this.id = user.id;
        this.fullname = user.fullname;
        this.email= user.email;
        this.password = user.password;
        this.phoneNumber = user.phoneNumber;
        this.nationality = user.nationality;
        this.district = user.district;
        this.city = user.city;
        this.birthDate = user.birthDate;
        this.accountCreationDate = user.accountCreationDate;
        this.admin = user.admin;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }


    public Date getAccountCreationDate() {
        return this.accountCreationDate;
    }

    public void setAccountCreationDate(Date accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public boolean isAdmin() {
        return this.admin;
    }

    public boolean getAdmin() {
        return this.admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", fullname='" + getFullname() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            ", nacionality='" + getNationality() + "'" +
            ", district='" + getDistrict() + "'" +
            ", city='" + getCity() + "'" +
            ", birthDate='" + getBirthDate() + "'" +
            ", accountCreationDate='" + getAccountCreationDate() + "'" +
            ", admin='" + isAdmin() + "'" +
            "}";
    }
}
