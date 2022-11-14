package APIjava.Models;

import java.sql.Date;

public class Brand {
    private int id;
    private String name;
    private String creationDate;
    private Date accessionDate;

    private static final int INT_BY_DEFAULT = 0;
    private static final String STRING_BY_DEFAULT = "Non Defined";
    private static final Date DATE_BY_DEFAULT = new Date(System.currentTimeMillis());

    public Brand() {
        this.id = INT_BY_DEFAULT;
        this.name = STRING_BY_DEFAULT;
        this.creationDate = STRING_BY_DEFAULT;
        this.accessionDate = DATE_BY_DEFAULT;
    }

    public Brand(int id, String name, String creationDate, Date accessionDate) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
        this.accessionDate = accessionDate;
    }

    public Brand(String name, String creationDate, Date accessionDate) {
        this.name = name;
        this.creationDate = creationDate;
        this.accessionDate = accessionDate;
    }

    public Brand(Brand brand) {
        this.id = brand.id;
        this.name = brand.name;
        this.creationDate = brand.creationDate;
        this.accessionDate = brand.accessionDate;
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

    public String getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Date getAccessionDate() {
        return this.accessionDate;
    }

    public void setAccessionDate(Date accessionDate) {
        this.accessionDate = accessionDate;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", creationDate='" + getCreationDate() + "'" +
                ", accessionDate='" + getAccessionDate() + "'" +
                "}";
    }

}
