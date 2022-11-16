package APIjava.Models;

public class InsuranceDeal {
    private int id;
    private int insuranceId;
    private int carId;
    private int userId;

    private static final int INT_BY_DEFAULT = 0;


    public InsuranceDeal() {
        this.id = INT_BY_DEFAULT;
        this.insuranceId = INT_BY_DEFAULT;
        this.carId = INT_BY_DEFAULT;
        this.userId = INT_BY_DEFAULT;
    }


    public InsuranceDeal(int id, int insuranceId, int carId, int userId) {
        this.id = id;
        this.insuranceId = insuranceId;
        this.carId = carId;
        this.userId = userId;
    }

    public InsuranceDeal(int insuranceId, int carId, int userId) {
        this.insuranceId = insuranceId;
        this.carId = carId;
        this.userId = userId;
    }

    public InsuranceDeal(InsuranceDeal insuranceDeal) {
        this.id = insuranceDeal.id;
        this.insuranceId = insuranceDeal.insuranceId;
        this.carId = insuranceDeal.carId;
        this.userId = insuranceDeal.userId;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInsuranceId() {
        return this.insuranceId;
    }

    public void setInsuranceId(int insuranceId) {
        this.insuranceId = insuranceId;
    }

    public int getCarId() {
        return this.carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", insuranceId='" + getInsuranceId() + "'" +
            ", carId='" + getCarId() + "'" +
            ", userId='" + getUserId() + "'" +
            "}";
    }


}
