package APIjava.Models;


public class Car {
    private int id;
    private int brandId;
    private String model;
    private String category;
    private String color;
    private String fuelType;
    private int year;
    private int miles;
    private int engineCapacity;
    private int horsePower;
    private String transmition;
    private int doorsNumber;
    private int capacity;
    private String origin;
    private double fuelConsumption;
    private double acceleration;
    private String carCondition;

    private static final int INT_BY_DEFAULT = 0;
    private static final String STRING_BY_DEFAULT = "Non Defined";
    private static final double DOUBLE_BY_DEFAULT = 0.0;

    public Car() {
        this.id = INT_BY_DEFAULT;
        this.brandId = INT_BY_DEFAULT;
        this.model = STRING_BY_DEFAULT;
        this.category = STRING_BY_DEFAULT;
        this.color = STRING_BY_DEFAULT;
        this.fuelType = STRING_BY_DEFAULT;
        this.year = INT_BY_DEFAULT;
        this.miles = INT_BY_DEFAULT;
        this.engineCapacity = INT_BY_DEFAULT;
        this.horsePower = INT_BY_DEFAULT;
        this.transmition = STRING_BY_DEFAULT;
        this.doorsNumber = INT_BY_DEFAULT;
        this.capacity = INT_BY_DEFAULT;
        this.origin = STRING_BY_DEFAULT;
        this.fuelConsumption = DOUBLE_BY_DEFAULT;
        this.acceleration = DOUBLE_BY_DEFAULT;
        this.carCondition = STRING_BY_DEFAULT;
    }

    public Car(int id, int brandId, String model, String category, String color, String fuelType, int year, int miles,
            int engineCapacity, int horsePower, String transmition, int doorsNumber, int capacity, String origin,
            double fuelConsumption, double acceleration, String carCondition) {
        
        this.id = id;
        this.brandId = brandId;
        this.model = model;
        this.category = category;
        this.color = color;
        this.fuelType = fuelType;
        this.year = year;
        this.miles = miles;
        this.engineCapacity = engineCapacity;
        this.horsePower = horsePower;
        this.transmition = transmition;
        this.doorsNumber = doorsNumber;
        this.capacity = capacity;
        this.origin = origin;
        this.fuelConsumption = fuelConsumption;
        this.acceleration = acceleration;
        this.carCondition = carCondition;
    }


    public Car(int brandId, String model, String category, String color, String fuelType, int year, int miles, int engineCapacity, int horsePower, String transmition, int doorsNumber, int capacity, String origin, double fuelConsumption, double acceleration, String carCondition) {
        this.brandId = brandId;
        this.model = model;
        this.category = category;
        this.color = color;
        this.fuelType = fuelType;
        this.year = year;
        this.miles = miles;
        this.engineCapacity = engineCapacity;
        this.horsePower = horsePower;
        this.transmition = transmition;
        this.doorsNumber = doorsNumber;
        this.capacity = capacity;
        this.origin = origin;
        this.fuelConsumption = fuelConsumption;
        this.acceleration = acceleration;
        this.carCondition = carCondition;
    }

    public Car(Car car) {
        this.id = car.id;
        this.brandId = car.brandId;
        this.model = car.model;
        this.category = car.category;
        this.color = car.color;
        this.fuelType = car.fuelType;
        this.year = car.year;
        this.miles = car.miles;
        this.engineCapacity = car.engineCapacity;
        this.horsePower = car.horsePower;
        this.transmition = car.transmition;
        this.doorsNumber = car.doorsNumber;
        this.capacity = car.capacity;
        this.origin = car.origin;
        this.fuelConsumption = car.fuelConsumption;
        this.acceleration = car.acceleration;
        this.carCondition = car.carCondition;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBrandId() {
        return this.brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMiles() {
        return this.miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getEngineCapacity() {
        return this.engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getTransmition() {
        return this.transmition;
    }

    public void setTransmition(String transmition) {
        this.transmition = transmition;
    }

    public int getDoorsNumber() {
        return this.doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getAcceleration() {
        return this.acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public String getCarCondition() {
        return this.carCondition;
    }

    public void setCarCondition(String carCondition) {
        this.carCondition = carCondition;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", brandId='" + getBrandId() + "'" +
            ", model='" + getModel() + "'" +
            ", category='" + getCategory() + "'" +
            ", color='" + getColor() + "'" +
            ", fuelType='" + getFuelType() + "'" +
            ", year='" + getYear() + "'" +
            ", miles='" + getMiles() + "'" +
            ", engineCapacity='" + getEngineCapacity() + "'" +
            ", horsePower='" + getHorsePower() + "'" +
            ", transmition='" + getTransmition() + "'" +
            ", doorsNumber='" + getDoorsNumber() + "'" +
            ", capacity='" + getCapacity() + "'" +
            ", origin='" + getOrigin() + "'" +
            ", fuelConsumption='" + getFuelConsumption() + "'" +
            ", acceleration='" + getAcceleration() + "'" +
            ", carCondition='" + getCarCondition() + "'" +
            "}";
    }

}