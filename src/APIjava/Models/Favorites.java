package APIjava.Models;

public class Favorites {
    private int id;
    private int userId;
    private int carId;

    private static final int INT_BY_DEFAULT = 0;

    public Favorites() {
        this.id = INT_BY_DEFAULT;
        this.userId = INT_BY_DEFAULT;
        this.carId = INT_BY_DEFAULT;
    }

    public Favorites(int userId, int carId) {
        this.userId = userId;
        this.carId = carId;
    }

    public Favorites(int id, int userId, int carId) {
        this.id = id;
        this.userId = userId;
        this.carId = carId;
    }


    public Favorites(Favorites favorites) {
        this.id = favorites.id;
        this.userId = favorites.userId;
        this.carId = favorites.carId;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCarId() {
        return this.carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", userId='" + getUserId() + "'" +
            ", carId='" + getCarId() + "'" +
            "}";
    }

}
