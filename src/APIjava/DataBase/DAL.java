package APIjava.DataBase;

import APIjava.utils.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import APIjava.Models.Brand;
import APIjava.Models.Car;
import APIjava.Models.CarComment;
import APIjava.Models.Favorites;
import APIjava.Models.Insurance;
import APIjava.Models.InsuranceDeal;
import APIjava.Models.Insurer;
import APIjava.Models.InsurerComment;
import APIjava.Models.RentAnnouncement;
import APIjava.Models.RentDeal;
import APIjava.Models.SaleAnnouncement;
import APIjava.Models.SaleDeal;
import APIjava.Models.User;

public class DAL {

    public static void insertBrand(Brand insertedBrand) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn
                    .prepareStatement("INSERT INTO Brand (name, creationDate,accessionDate) VALUES (?,?,?)");
            Date creationDateinDate = Utils.DateConvertedToSqlDateByString(insertedBrand.getCreationDate());
            Date accessionDate = new Date(System.currentTimeMillis());
            stmt.setString(1, insertedBrand.getName());
            stmt.setDate(2, creationDateinDate);
            stmt.setDate(3, accessionDate);
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void updateBrand(int id, String name, String creationDate) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("UPDATE Brand SET name=? , creationDate=? WHERE id=?");
            Date creationDateinDate = Utils.DateConvertedToSqlDateByString(creationDate);
            stmt.setString(1, name);
            stmt.setDate(2, creationDateinDate);
            stmt.setInt(3, id);
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteBrand(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM Brand WHERE id=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void getBrandList(List<Brand> brandList) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Brand");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                brandList.add(new Brand(rs.getInt("id"), rs.getString("name"), rs.getDate("creationDate").toString(),
                        rs.getDate("accessionDate")));
            }
            conn.close();
            return;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Brand getBrandById(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Brand WHERE id=?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            Brand brand = new Brand();
            while (rs.next()) {
                brand.setId(rs.getInt("id"));
                brand.setName(rs.getString("name"));
                brand.setCreationDate(rs.getDate("creationDate").toString());
                brand.setAccessionDate(rs.getDate("accessionDate"));
            }

            conn.close();
            return brand;
        } catch (Exception e) {
            System.out.println(e);
        }
        return new Brand();
    }

    public static void insertCar(Car car) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(
                    "INSERT INTO Car (brandId, model, category, color, fuelType, year, miles, engineCapacity, horsePower, transmition, doorsNumber, capacity, origin, fuelConsumption, acceleration, carCondition) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, car.getBrandId());
            stmt.setString(2, car.getModel());
            stmt.setString(3, car.getCategory());
            stmt.setString(4, car.getColor());
            stmt.setString(5, car.getFuelType());
            stmt.setInt(6, car.getYear());
            stmt.setInt(7, car.getMiles());
            stmt.setInt(8, car.getEngineCapacity());
            stmt.setInt(9, car.getHorsePower());
            stmt.setString(10, car.getTransmition());
            stmt.setInt(11, car.getDoorsNumber());
            stmt.setInt(12, car.getCapacity());
            stmt.setString(13, car.getOrigin());
            stmt.setDouble(14, car.getFuelConsumption());
            stmt.setDouble(15, car.getAcceleration());
            stmt.setString(16, car.getCarCondition());
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateCar(int id, int brandId, String model, String category, String color, String fuelType,
            int year, int miles, int engineCapacity, int horsePower, String transmition, int doorsNumber, int capacity,
            String origin, double fuelConsumption, double acceleration, String carCondition) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(
                    "UPDATE Car SET model=?, category=?, color=?, fuelType=?, year=?, miles=?, engineCapacity=?, horsePower=?, transmition=?, doorsNumber= ?, capacity=?, origin=?, fuelConsumption=?, acceleration=?, carCondition=? WHERE id=?");
            stmt.setString(1, model);
            stmt.setString(2, category);
            stmt.setString(3, color);
            stmt.setString(4, fuelType);
            stmt.setInt(5, year);
            stmt.setInt(6, miles);
            stmt.setInt(7, engineCapacity);
            stmt.setInt(8, horsePower);
            stmt.setString(9, transmition);
            stmt.setInt(10, doorsNumber);
            stmt.setInt(11, capacity);
            stmt.setString(12, origin);
            stmt.setDouble(13, fuelConsumption);
            stmt.setDouble(14, acceleration);
            stmt.setString(15, carCondition);
            stmt.setInt(16, id);
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteCar(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM Car WHERE id=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void getCarList(List<Car> carList) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Car");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                carList.add(new Car(rs.getInt("id"), rs.getInt("brandId"), rs.getString("model"),
                        rs.getString("category"), rs.getString("color"), rs.getString("fuelType"), rs.getInt("year"),
                        rs.getInt("miles"), rs.getInt("engineCapacity"), rs.getInt("horsePower"),
                        rs.getString("transmition"), rs.getInt("doorsNumber"), rs.getInt("capacity"),
                        rs.getString("origin"), rs.getDouble("fuelConsumption"), rs.getDouble("acceleration"),
                        rs.getString("carCondition")));
            }
            conn.close();
            return;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Car getCarById(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Car WHERE id=?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            Car car = new Car();
            while (rs.next()) {
                car.setId(rs.getInt("id"));
                car.setBrandId(rs.getInt("brandId"));
                car.setModel(rs.getString("model"));
                car.setCategory(rs.getString("category"));
                car.setColor(rs.getString("color"));
                car.setFuelType(rs.getString("fuelType"));
                car.setYear(rs.getInt("year"));
                car.setMiles(rs.getInt("miles"));
                car.setEngineCapacity(rs.getInt("engineCapacity"));
                car.setHorsePower(rs.getInt("horsePower"));
                car.setTransmition(rs.getString("transmition"));
                car.setDoorsNumber(rs.getInt("doorsNumber"));
                car.setCapacity(rs.getInt("capacity"));
                car.setOrigin(rs.getString("origin"));
                car.setFuelConsumption(rs.getDouble("fuelConsumption"));
                car.setAcceleration(rs.getDouble("acceleration"));
                car.setCarCondition(rs.getString("carCondition"));
            }

            conn.close();
            return car;
        } catch (Exception e) {
            System.out.println(e);
        }
        return new Car();
    }

    public static void insertCarComment(CarComment comment) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(
                    "INSERT INTO CarComment (comentatorId,carId,commentDate,comment,rating) VALUES (?,?,?,?,?)");
            stmt.setInt(1, comment.getComentatorId());
            stmt.setInt(2, comment.getCarId());
            Date commentDate = new Date(System.currentTimeMillis());
            stmt.setDate(3, commentDate);
            stmt.setString(4, comment.getComment());
            stmt.setDouble(5, comment.getRating());
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateCarComment(int id, int comentatorId, int carId, String comment, double rating) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(
                    "UPDATE CarComment SET comentatorId=?, carId=?,commentDate=?,comment=?,rating=? WHERE id=?");
            stmt.setInt(1, comentatorId);
            stmt.setInt(2, carId);
            Date commentDate = new Date(System.currentTimeMillis());
            stmt.setDate(3, commentDate);
            stmt.setString(4, comment);
            stmt.setDouble(5, rating);
            stmt.setInt(6, id);
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteCarComment(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM CarComment WHERE id=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void getCarCommentList(List<CarComment> carCommentsList) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM CarComment");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                carCommentsList.add(new CarComment(rs.getInt("id"), rs.getInt("comentatorId"), rs.getInt("carId"),
                        rs.getDate("commentDate"), rs.getString("comment"), rs.getDouble("rating")));
            }

            conn.close();
            return;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static CarComment getCarCommentById(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM CarComment WHERE id=?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            CarComment comment = new CarComment();
            while (rs.next()) {
                comment.setId(rs.getInt("id"));
                comment.setComentatorId(rs.getInt("comentatorId"));
                comment.setCarId(rs.getInt("carId"));
                comment.setCommentDate(rs.getDate("commentDate"));
                comment.setComment(rs.getString("comment"));
                comment.setRating(rs.getDouble("rating"));
            }

            conn.close();
            return comment;
        } catch (Exception e) {
            System.out.println(e);
        }
        return new CarComment();
    }

    public static CarComment getCarCommentByComentatorId(int comentatorId) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM CarComment WHERE comentatorId=?");
            stmt.setInt(1, comentatorId);
            ResultSet rs = stmt.executeQuery();

            CarComment comment = new CarComment();
            while (rs.next()) {
                comment.setId(rs.getInt("id"));
                comment.setComentatorId(rs.getInt("comentatorId"));
                comment.setCarId(rs.getInt("carId"));
                comment.setCommentDate(rs.getDate("commentDate"));
                comment.setComment(rs.getString("comment"));
                comment.setRating(rs.getDouble("rating"));
            }

            conn.close();
            return comment;
        } catch (Exception e) {
            System.out.println(e);
        }
        return new CarComment();
    }

    public static void insertFavorites(Favorites favorites) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Favorites (userId,carId) VALUES (?,?)");
            stmt.setInt(1, favorites.getUserId());
            stmt.setInt(2, favorites.getCarId());
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateFavorites(int id, int userId, int carId) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("UPDATE Favorites SET userId=?, carId=? WHERE id=?");
            stmt.setInt(1, userId);
            stmt.setInt(2, carId);
            stmt.setInt(3, id);
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteFavorites(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM Favorites WHERE id=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void getFavoritesListUser(List<Favorites> favoritesList, int userId) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Favorites WHERE userId=?");
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                favoritesList.add(new Favorites(rs.getInt("id"), rs.getInt("userId"), rs.getInt("carId")));
            }

            conn.close();
            return;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Favorites getFavoritesById(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Favorites WHERE id=?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            Favorites favorites = new Favorites();
            while (rs.next()) {
                favorites.setId(rs.getInt("id"));
                favorites.setUserId(rs.getInt("userId"));
                favorites.setCarId(rs.getInt("carId"));
            }

            conn.close();
            return favorites;
        } catch (Exception e) {
            System.out.println(e);
        }
        return new Favorites();
    }

    public static void insertInsurance(Insurance insurance) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(
                    "INSERT INTO Insurance (insurerId,name,advantages,pricePerMonth,pricePerYear) VALUES (?,?,?,?,?)");
            stmt.setInt(1, insurance.getInsurerId());
            stmt.setString(2, insurance.getName());
            stmt.setString(3, insurance.getAdvantages());
            stmt.setDouble(4, insurance.getPricePerMonth());
            stmt.setDouble(5, insurance.getPricePerYear());
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateInsurance(int id, int insurerId, String name, String advantages,
            double pricePerMonth, double pricePerYear) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(
                    "UPDATE Insurance SET insurerId=?, name=?, advantages=?, pricePerMonth=?, pricePerYear=? WHERE id=?");
            stmt.setInt(1, insurerId);
            stmt.setString(2, name);
            stmt.setString(3, advantages);
            stmt.setDouble(4, pricePerMonth);
            stmt.setDouble(5, pricePerYear);
            stmt.setInt(6, id);

            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteInsurance(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM Insurance WHERE id=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void getInsuranceList(List<Insurance> insuranceList) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Insurance");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                insuranceList.add(new Insurance(rs.getInt("id"), rs.getInt("insurerId"), rs.getString("name"),
                        rs.getString("advantages"), rs.getDouble("pricePerMonth"),
                        rs.getDouble("pricePerYear")));
            }

            conn.close();
            return;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void getUserInsuranceList(List<Insurance> insuranceList, int userId) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Insurance WHERE ownerId=?");
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                insuranceList.add(new Insurance(rs.getInt("id"), rs.getInt("insurerId"), rs.getString("name"),
                        rs.getString("advantages"), rs.getDouble("pricePerMonth"),
                        rs.getDouble("pricePerYear")));
            }

            conn.close();
            return;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Insurance getInsuranceById(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Insurance WHERE id=?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            Insurance insurance = new Insurance();
            while (rs.next()) {
                insurance.setId(rs.getInt("id"));
                insurance.setInsurerId(rs.getInt("insurerId"));
                insurance.setName(rs.getString("name"));
                insurance.setAdvantages(rs.getString("advantages"));
                insurance.setPricePerMonth(rs.getDouble("pricePerMonth"));
                insurance.setPricePerYear(rs.getDouble("pricePerYear"));
            }

            conn.close();
            return insurance;
        } catch (Exception e) {
            System.out.println(e);
        }
        return new Insurance();
    }

    public static Insurance getInsuranceByInsurerId(int carId) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Insurance WHERE insurerId=?");
            stmt.setInt(1, carId);
            ResultSet rs = stmt.executeQuery();

            Insurance insurance = new Insurance();
            while (rs.next()) {
                insurance.setId(rs.getInt("id"));
                insurance.setInsurerId(rs.getInt("insurerId"));
                insurance.setName(rs.getString("name"));
                insurance.setAdvantages(rs.getString("advantages"));
                insurance.setPricePerMonth(rs.getDouble("pricePerMonth"));
                insurance.setPricePerYear(rs.getDouble("pricePerYear"));
            }

            conn.close();
            return insurance;
        } catch (Exception e) {
            System.out.println(e);
        }
        return new Insurance();
    }

    public static void insertInsuranceDeal(InsuranceDeal insuranceDeal) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(
                    "INSERT INTO InsuranceDeal (insuranceId,carId,userId) VALUES (?,?,?)");
            stmt.setInt(1, insuranceDeal.getInsuranceId());
            stmt.setInt(2, insuranceDeal.getCarId());
            stmt.setInt(3, insuranceDeal.getUserId());
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateInsuranceDeal(int id, int insuranceId, int carId, int userId) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("UPDATE InsuranceDeal SET insuranceId=?, carId=?, userId=? WHERE id=?");
            stmt.setInt(1, insuranceId);
            stmt.setInt(2, carId);
            stmt.setInt(3, userId);
            stmt.setInt(4, id);
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteInsuranceDeal(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM InsuranceDeal WHERE id=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void getInsuranceDealList(List<InsuranceDeal> dealList) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM InsuranceDeal");
            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                dealList.add(new InsuranceDeal(rs.getInt("id"),rs.getInt("insuranceId"),rs.getInt("carId"),rs.getInt("userId")));
            }
            conn.close();
            return;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static InsuranceDeal getInsuranceDealById(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM InsuranceDeal WHERE id=?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            InsuranceDeal deal = new InsuranceDeal();
            while(rs.next()) {
                deal.setId(rs.getInt("id"));
                deal.setInsuranceId(rs.getInt("insuranceId"));
                deal.setCarId(rs.getInt("carId"));
                deal.setUserId(rs.getInt("userId"));
            }
            return deal;
        } catch (Exception e) {
            System.out.println(e);
        }
        return new InsuranceDeal();
    }

    public static InsuranceDeal getInsuranceDealByCarId(int carId) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM InsuranceDeal WHERE carId=?");
            stmt.setInt(1, carId);
            ResultSet rs = stmt.executeQuery();

            InsuranceDeal deal = new InsuranceDeal();
            while(rs.next()) {
                deal.setId(rs.getInt("id"));
                deal.setInsuranceId(rs.getInt("insuranceId"));
                deal.setCarId(rs.getInt("carId"));
                deal.setUserId(rs.getInt("userId"));
            }
            return deal;
        } catch (Exception e) {
            System.out.println(e);
        }
        return new InsuranceDeal();
    }

    public static void getInsuranceDealByUserId(List<InsuranceDeal> dealList,int userId) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM InsuranceDeal WHERE userId=?");
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                dealList.add(new InsuranceDeal(rs.getInt("id"),rs.getInt("insuranceId"),rs.getInt("carId"),rs.getInt("userId")));
            }
            conn.close();
            return;
        } catch (Exception e) {
            System.out.println(e);
        }
    }



    public static void insertInsurer(Insurer insurer) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn
                    .prepareStatement("INSERT INTO Insurer (name,email,phoneNumber,adress,rating) VALUES (?,?,?,?,?)");
            stmt.setString(1, insurer.getName());
            stmt.setString(2, insurer.getEmail());
            stmt.setString(3, insurer.getPhoneNumber());
            stmt.setString(4, insurer.getAdress());
            stmt.setDouble(5, insurer.getRating());

            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateInsurer(int id, String name, String email, String phoneNumber, String adress,
            double rating) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn
                    .prepareStatement("UPDATE Insurer SET name=?,email=?,phoneNumber=?,adress=?,rating=? WHERE id=?");
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, phoneNumber);
            stmt.setString(4, adress);
            stmt.setDouble(5, rating);
            stmt.setInt(6, id);

            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteInsurer(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM Insurer WHERE id=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void getInsurerList(List<Insurer> insurerList) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Insurer");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                insurerList.add(new Insurer(rs.getInt("id"), rs.getString("name"), rs.getString("email"),
                        rs.getString("phoneNumber"), rs.getString("adress"), rs.getDouble("rating")));
            }

            conn.close();
            return;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Insurer getInsurerById(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Insurer WHERE id=?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            Insurer insurer = new Insurer();
            while (rs.next()) {
                insurer.setId(rs.getInt("id"));
                insurer.setName(rs.getString("name"));
                insurer.setEmail(rs.getString("email"));
                insurer.setPhoneNumber(rs.getString("phoneNumber"));
                insurer.setAdress(rs.getString("adress"));
                insurer.setRating(rs.getDouble("rating"));
            }

            conn.close();
            return insurer;
        } catch (Exception e) {
            System.out.println(e);
        }
        return new Insurer();
    }

    public static void insertInsurerComment(InsurerComment comment) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(
                    "INSERT INTO InsurerComment (comentatorId,insurerId,commentDate,comment,rating) VALUES (?,?,?,?,?)");
            stmt.setInt(1, comment.getComentatorId());
            stmt.setInt(2, comment.getInsurerId());
            Date commentDate = new Date(System.currentTimeMillis());
            stmt.setDate(3, commentDate);
            stmt.setString(4, comment.getComment());
            stmt.setDouble(5, comment.getRating());

            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateInsurerComment(int id, int comentatorId, int insurerId, String comment,
            double rating) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(
                    "UPDATE InsurerComment SET comentatorId=?, insurerId=?, comment=?, rating=?");
            stmt.setInt(1, comentatorId);
            stmt.setInt(2, insurerId);
            stmt.setString(3, comment);
            stmt.setDouble(4, rating);

            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteInsurerComment(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM InsurerComment WHERE id=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void getInsurerCommentList(List<InsurerComment> commentList) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM InsurerComment");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                commentList.add(new InsurerComment(rs.getInt("id"), rs.getInt("comentatorId"), rs.getInt("insurerId"),
                        rs.getDate("commentDate"), rs.getString("comment"), rs.getDouble("rating")));
            }

            conn.close();
            return;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static InsurerComment getInsurerCommentById(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM InsurerComment WHERE id=?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            InsurerComment comment = new InsurerComment();
            while (rs.next()) {
                comment.setId(rs.getInt("id"));
                comment.setComentatorId(rs.getInt("comentatorId"));
                comment.setInsurerId(rs.getInt("insurerId"));
                comment.setCommentDate(rs.getDate("commentDate"));
                comment.setComment(rs.getString("comment"));
                comment.setRating(rs.getDouble("rating"));
            }

            conn.close();
            return comment;
        } catch (Exception e) {
            System.out.println(e);
        }
        return new InsurerComment();
    }

    public static void getInsurerCommentByInsurer(List<InsurerComment> commentList, int insurerId) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM InsurerComment WHERE insurerId=?");
            stmt.setInt(1, insurerId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                commentList.add(new InsurerComment(rs.getInt("id"), rs.getInt("comentatorId"), rs.getInt("insurerId"),
                        rs.getDate("commentDate"), rs.getString("comment"), rs.getDouble("rating")));
            }

            conn.close();
            return;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void getInsurerCommentByComentator(List<InsurerComment> commentList, int comentatorId) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM InsurerComment WHERE comentatorId=?");
            stmt.setInt(1, comentatorId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                commentList.add(new InsurerComment(rs.getInt("id"), rs.getInt("comentatorId"), rs.getInt("insurerId"),
                        rs.getDate("commentDate"), rs.getString("comment"), rs.getDouble("rating")));
            }

            conn.close();
            return;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void insertRentAnnouncement(RentAnnouncement announcement) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(
                    "INSERT INTO RentAnnouncement (carId,renterId,location,insurance,insuranceId,price,negotiable) VALUES (?,?,?,?,?,?,?)");
            stmt.setInt(1, announcement.getCarId());
            stmt.setInt(2, announcement.getRenterId());
            stmt.setString(3, announcement.getLocation());
            stmt.setBoolean(4, announcement.hasInsurance());
            if (announcement.hasInsurance()) {
                stmt.setInt(5, announcement.getInsuranceId());
            } else {
                stmt.setNull(5, 0);
            }
            stmt.setDouble(6, announcement.getPrice());
            stmt.setBoolean(7, announcement.isNegotiable());

            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateRentAnnouncement(int id, String location, boolean insurance,
            int insuranceId, double price, boolean negotiable) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(
                    "UPDATE RentAnnouncement SET location=?, insurance=?, insuranceId=?, price=?, negotiable=? WHERE id=?");
            stmt.setString(1, location);
            stmt.setBoolean(2, insurance);
            if (insurance) {
                stmt.setInt(3, insuranceId);
            } else {
                stmt.setNull(3, 0);
            }
            stmt.setDouble(4, price);
            stmt.setBoolean(5, negotiable);
            stmt.setInt(6, id);

            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteRentAnnouncement(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM RentAnnouncement WHERE id=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void getRentAnnouncementList(List<RentAnnouncement> announcementList) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM RentAnnouncement");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                announcementList.add(new RentAnnouncement(rs.getInt("id"), rs.getInt("carId"), rs.getInt("renterId"),
                        rs.getString("location"), rs.getBoolean("insurance"), rs.getInt("insuranceId"),
                        rs.getDouble("price"), rs.getBoolean("negotiable")));
            }

            conn.close();
            return;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static RentAnnouncement getRentAnnouncementById(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM RentAnnouncement WHERE id=?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            RentAnnouncement announcement = new RentAnnouncement();
            while (rs.next()) {
                announcement.setId(rs.getInt("id"));
                announcement.setCarId(rs.getInt("carId"));
                announcement.setRenterId(rs.getInt("renterId"));
                announcement.setLocation(rs.getString("location"));
                announcement.setInsurance(rs.getBoolean("insurance"));
                announcement.setInsuranceId(rs.getInt("insuranceId"));
                announcement.setPrice(rs.getDouble("price"));
                announcement.setNegotiable(rs.getBoolean("negotiable"));
            }
            return announcement;
        } catch (Exception e) {
            System.out.println(e);
        }
        return new RentAnnouncement();
    }

    public static void getRentAnnouncementByRenterId(List<RentAnnouncement> announcementList, int renterId) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM RentAnnouncement WHERE renterId=?");
            stmt.setInt(1, renterId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                announcementList.add(new RentAnnouncement(rs.getInt("id"), rs.getInt("carId"), rs.getInt("renterId"),
                        rs.getString("location"), rs.getBoolean("insurance"), rs.getInt("insuranceId"),
                        rs.getDouble("price"), rs.getBoolean("negotiable")));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void insertRentDeal(RentDeal deal) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn
                    .prepareStatement("INSERT INTO RentDeal (clientId, announcementId, price, done) VALUES (?,?,?,?)");
            stmt.setInt(1, deal.getClientId());
            stmt.setInt(2, deal.getAnnouncementId());
            stmt.setDouble(3, deal.getPrice());
            stmt.setBoolean(4, deal.isDone());

            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateRentDeal(int id, int clientId, int announcementId, double price, boolean done) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn
                    .prepareStatement("UPDATE RentDeal SET clientId=?, announcementId=?, price=?, done=? WHERE id=?");
            stmt.setInt(1, clientId);
            stmt.setInt(2, announcementId);
            stmt.setDouble(3, price);
            stmt.setBoolean(4, done);
            stmt.setInt(5, id);

            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteRentDeal(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM RentDeal WHERE id=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void getRentDealList(List<RentDeal> dealsList) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM RentDeal");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                dealsList.add(new RentDeal(rs.getInt("id"), rs.getInt("clientId"), rs.getInt("announcementId"),
                        rs.getDouble("price"), rs.getBoolean("done")));
            }
            conn.close();
            return;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static RentDeal getRentDealById(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM RentDeal WHERE id=?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            RentDeal deal = new RentDeal();
            while (rs.next()) {
                deal.setId(rs.getInt("id"));
                deal.setClientId(rs.getInt("clientId"));
                deal.setAnnouncementId(rs.getInt("announcementId"));
                deal.setPrice(rs.getDouble("price"));
                deal.setDone(rs.getBoolean("done"));
            }
            conn.close();
            return deal;
        } catch (Exception e) {
            System.out.println(e);
        }
        return new RentDeal();
    }

    public static void getRentDealByClientId(List<RentDeal> dealsList, int clientId) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM RentDeal WHERE clientId=?");
            stmt.setInt(1, clientId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                dealsList.add(new RentDeal(rs.getInt("id"), rs.getInt("clientId"), rs.getInt("announcementId"),
                        rs.getDouble("price"), rs.getBoolean("done")));
            }
            conn.close();
            return;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void getRentDealByAnnouncementId(List<RentDeal> dealsList, int announcementId) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM RentDeal WHERE announcementId=?");
            stmt.setInt(1, announcementId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                dealsList.add(new RentDeal(rs.getInt("id"), rs.getInt("clientId"), rs.getInt("announcementId"),
                        rs.getDouble("price"), rs.getBoolean("done")));
            }
            conn.close();
            return;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void insertSaleAnnouncement(SaleAnnouncement announcement) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(
                    "INSERT INTO SaleAnnouncement (carId,sellerId,location,warranty,warrantyTime,secondKey,price,negotiable) VALUES (?,?,?,?,?,?,?,?)");
            stmt.setInt(1, announcement.getCarId());
            stmt.setInt(2, announcement.getSellerId());
            stmt.setString(3, announcement.getLocation());
            stmt.setBoolean(4, announcement.hasWarranty());
            if (announcement.hasWarranty()) {
                stmt.setInt(5, announcement.getWarrantyTime());
            } else {
                stmt.setInt(5, 0);
            }

            stmt.setBoolean(6, announcement.getSecondkey());
            stmt.setDouble(7, announcement.getPrice());
            stmt.setBoolean(8, announcement.isNegotiable());

            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateSaleAnnouncement(int id, String location, boolean warranty,
            int warrantyTime, boolean secondKey, double price, boolean negotiable) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(
                    "UPDATE SaleAnnouncement SET location=?, warranty=?, warrantyTime=?, secondKey=?, price=?, negotiable=? WHERE id=?");
            stmt.setString(1, location);
            stmt.setBoolean(2, warranty);
            if (warranty) {
                stmt.setInt(3, warrantyTime);
            } else {
                stmt.setInt(3, 0);
            }
            stmt.setBoolean(4, secondKey);
            stmt.setDouble(5, price);
            stmt.setBoolean(6, negotiable);
            stmt.setInt(7, id);

            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteSaleAnnouncement(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM SaleAnnouncement WHERE id=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void getSaleAnnouncementList(List<SaleAnnouncement> announcementList) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM SaleAnnouncement");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                announcementList.add(new SaleAnnouncement(rs.getInt("id"), rs.getInt("carId"), rs.getInt("sellerId"),
                        rs.getString("location"), rs.getBoolean("warranty"), rs.getInt("warrantyTime"),
                        rs.getBoolean("secondKey"), rs.getDouble("price"), rs.getBoolean("negotiable")));
            }

            conn.close();
            return;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static SaleAnnouncement getSaleAnnouncementById(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM SaleAnnouncement WHERE id=?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            SaleAnnouncement announcement = new SaleAnnouncement();
            while (rs.next()) {
                announcement.setId(rs.getInt("id"));
                announcement.setCarId(rs.getInt("carId"));
                announcement.setSellerId(rs.getInt("sellerId"));
                announcement.setLocation(rs.getString("location"));
                announcement.setWarranty(rs.getBoolean("warranty"));
                announcement.setWarrantyTime(rs.getInt("warrantyTime"));
                announcement.setSecondkey(rs.getBoolean("secondKey"));
                announcement.setPrice(rs.getDouble("price"));
                announcement.setNegotiable(rs.getBoolean("negotiable"));
            }
            return announcement;
        } catch (Exception e) {
            System.out.println(e);
        }
        return new SaleAnnouncement();
    }

    public static void getSaleAnnouncementBySellerId(List<SaleAnnouncement> announcementList, int sellerId) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM SaleAnnouncement WHERE sellerId=?");
            stmt.setInt(1, sellerId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                announcementList.add(new SaleAnnouncement(rs.getInt("id"), rs.getInt("carId"), rs.getInt("sellerId"),
                        rs.getString("location"), rs.getBoolean("warranty"), rs.getInt("warrantyTime"),
                        rs.getBoolean("secondKey"), rs.getDouble("price"), rs.getBoolean("negotiable")));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void insertSaleDeal(SaleDeal deal) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn
                    .prepareStatement("INSERT INTO SaleDeal (buyerId, announcementId, price, done) VALUES (?,?,?,?)");
            stmt.setInt(1, deal.getBuyerId());
            stmt.setInt(2, deal.getAnnouncementId());
            stmt.setDouble(3, deal.getPrice());
            stmt.setBoolean(4, deal.isDone());

            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateSaleDeal(int id, int buyerId, int announcementId, double price, boolean done) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn
                    .prepareStatement("UPDATE SaleDeal SET buyerId=?, announcementId=?, price=?, done=? WHERE id=?");
            stmt.setInt(1, buyerId);
            stmt.setInt(2, announcementId);
            stmt.setDouble(3, price);
            stmt.setBoolean(4, done);
            stmt.setInt(5, id);

            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteSaleDeal(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM SaleDeal WHERE id=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void getSaleDealList(List<SaleDeal> dealsList) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM SaleDeal");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                dealsList.add(new SaleDeal(rs.getInt("id"), rs.getInt("buyerId"), rs.getInt("announcementId"),
                        rs.getDouble("price"), rs.getBoolean("done")));
            }
            conn.close();
            return;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static SaleDeal getSaleDealById(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM SaleDeal WHERE id=?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            SaleDeal deal = new SaleDeal();
            while (rs.next()) {
                deal.setId(rs.getInt("id"));
                deal.setBuyerId(rs.getInt("buyerId"));
                deal.setAnnouncementId(rs.getInt("announcementId"));
                deal.setPrice(rs.getDouble("price"));
                deal.setDone(rs.getBoolean("done"));
            }
            conn.close();
            return deal;
        } catch (Exception e) {
            System.out.println(e);
        }
        return new SaleDeal();
    }

    public static void getSaleDealByBuyerId(List<SaleDeal> dealsList, int buyerId) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM SaleDeal WHERE buyerId=?");
            stmt.setInt(1, buyerId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                dealsList.add(new SaleDeal(rs.getInt("id"), rs.getInt("buyerId"), rs.getInt("announcementId"),
                        rs.getDouble("price"), rs.getBoolean("done")));
            }
            conn.close();
            return;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void getSaleDealByAnnouncementId(List<SaleDeal> dealsList, int announcementId) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM SaleDeal WHERE announcementId=?");
            stmt.setInt(1, announcementId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                dealsList.add(new SaleDeal(rs.getInt("id"), rs.getInt("buyerId"), rs.getInt("announcementId"),
                        rs.getDouble("price"), rs.getBoolean("done")));
            }
            conn.close();
            return;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void insertUser(User user) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(
                    "INSERT INTO User (fullname, email, password, phoneNumber, nationality, district, city, birthDate,accountCreationDate, admin) VALUES (?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, user.getFullname());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.setString(4, user.getPhoneNumber());
            stmt.setString(5, user.getNationality());
            stmt.setString(6, user.getDistrict());
            stmt.setString(7, user.getCity());
            Date birthDate = Utils.DateConvertedToSqlDateByString(user.getBirthDate());
            stmt.setDate(8, birthDate);
            Date accountCreationDate = new Date(System.currentTimeMillis());
            stmt.setDate(9, accountCreationDate);
            stmt.setBoolean(10, false);

            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateUser(int id, String fullname, String email, String password, String phoneNumber,
            String nationality, String district, String city, String birthDate, boolean admin) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(
                    "UPDATE User SET fullname=?, email=?, password=?, phoneNumber=?, nationality=?, district=?, city=?, birthDate=?, admin=? WHERE id=?");
            stmt.setString(1, fullname);
            stmt.setString(2, email);
            stmt.setString(3, password);
            stmt.setString(4, phoneNumber);
            stmt.setString(5, nationality);
            stmt.setString(6, district);
            stmt.setString(7, city);
            Date birthDateInDate = Utils.DateConvertedToSqlDateByString(birthDate);
            stmt.setDate(8, birthDateInDate);
            stmt.setBoolean(9, admin);
            stmt.setInt(10, id);

            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void deleteUser(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM User WHERE id=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void getUserList(List<User> userList) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM User");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                userList.add(new User(rs.getInt("id"), rs.getString("fullname"), rs.getString("email"),
                        rs.getString("phoneNumber"), rs.getString("nationality"), rs.getString("district"),
                        rs.getString("city"), rs.getDate("birthDate").toString(), rs.getDate("accountCreationDate"),
                        rs.getBoolean("admin")));
            }

            conn.close();
            return;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static User getUserById(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM User WHERE id=?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            User user = new User();
            while (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setFullname(rs.getString("fullname"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setPhoneNumber(rs.getString("phoneNumber"));
                user.setNationality(rs.getString("nationality"));
                user.setDistrict(rs.getString("district"));
                user.setCity(rs.getString("city"));
                user.setBirthDate(rs.getDate("birthDate").toString());
                user.setAccountCreationDate(rs.getDate("accountCreationDate"));
                user.setAdmin(rs.getBoolean("admin"));
            }

            conn.close();
            return user;
        } catch (Exception e) {
            System.out.println(e);
        }
        return new User();
    }
}
