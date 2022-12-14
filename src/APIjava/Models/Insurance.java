package APIjava.Models;

public class Insurance {
    private int id;
    private int insurerId;
    private String name;
    private String advantages;
    private double pricePerMonth;
    private double pricePerYear;

    private static final int INT_BY_DEFAULT = 0;
    private static final String STRING_BY_DEFAULT = "Non Defined";
    private static final double DOUBLE_BY_DEFAULT = 0.0;

    public Insurance() {
        this.id = INT_BY_DEFAULT;
        this.insurerId = INT_BY_DEFAULT;
        this.name = STRING_BY_DEFAULT;
        this.advantages = STRING_BY_DEFAULT;
        this.pricePerMonth = DOUBLE_BY_DEFAULT;
        this.pricePerYear = DOUBLE_BY_DEFAULT;
    }


    public Insurance(int id, int insurerId, String name, String advantages, double pricePerMonth, double pricePerYear) {
        this.id = id;
        this.insurerId = insurerId;
        this.name = name;
        this.advantages = advantages;
        this.pricePerMonth = pricePerMonth;
        this.pricePerYear = pricePerYear;
    }

    public Insurance(int insurerId, String name, String advantages, double pricePerMonth, double pricePerYear) {
        this.insurerId = insurerId;
        this.name = name;
        this.advantages = advantages;
        this.pricePerMonth = pricePerMonth;
        this.pricePerYear = pricePerYear;
    }

    public Insurance(Insurance insurance) {
        this.id = insurance.id;
        this.insurerId = insurance.insurerId;
        this.name = insurance.name;
        this.advantages = insurance.advantages;
        this.pricePerMonth = insurance.pricePerMonth;
        this.pricePerYear = insurance.pricePerYear;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInsurerId() {
        return this.insurerId;
    }

    public void setInsurerId(int insurerId) {
        this.insurerId = insurerId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdvantages() {
        return this.advantages;
    }

    public void setAdvantages(String advantages) {
        this.advantages = advantages;
    }

    public double getPricePerMonth() {
        return this.pricePerMonth;
    }

    public void setPricePerMonth(double pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    public double getPricePerYear() {
        return this.pricePerYear;
    }

    public void setPricePerYear(double pricePerYear) {
        this.pricePerYear = pricePerYear;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", insurerId='" + getInsurerId() + "'" +
            ", name='" + getName() + "'" +
            ", advantages='" + getAdvantages() + "'" +
            ", pricePerMonth='" + getPricePerMonth() + "'" +
            ", pricePerYear='" + getPricePerYear() + "'" +
            "}";
    }

}
