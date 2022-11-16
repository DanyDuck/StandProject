package APIjava.DataBase;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import APIjava.utils.Utils;

public class DALTest {
    public static void main(String[] args) {
        DAL dal = new DAL();

        /* INSERT USER */
        // User user = new User();
        // user.setFullname("Daniel Alexandre Ribeiro Graça");
        // user.setEmail("danielogo2011@gmail.com");
        // user.setPassword("password12");
        // user.setPhoneNumber("999999999");
        // user.setNationality("Portugal");
        // user.setDistrict("Porto");
        // user.setCity("Póvoa de Varzim");
        // user.setBirthDate("2002-10-14");
        // Date accountCreationDate = new Date(System.currentTimeMillis());
        // user.setAccountCreationDate(accountCreationDate);
        // dal.insertUser(user);

        /* UPDATE USER */
        // dal.updateUser(3, "Daniel Graça", "1201822@isep.ipp.pt", "password00", "960495838", "Portugal", "Porto", "Vila do Conde", "2002-10-14", true);

        /* GET USER LIST */
        // List<User> userList = new ArrayList<>();
        // dal.getUserList(userList);
        // System.out.println(userList.toString());

        /* GET USER BY ID */
        // System.out.println(dal.getUserById(3));

        /* DELETE USER */
        // dal.deleteUser(3);

        /* INSERT BRAND */
        // Brand brand = new Brand();
        // brand.setName("Brand1");
        // brand.setCreationDate("2022-10-10");
        // Date accessionDate = new Date(System.currentTimeMillis());
        // brand.setAccessionDate(accessionDate);
        // System.out.println(brand.toString());
        // dal.insertBrand(brand);

        /* UPDATE BRAND */
        // dal.updateBrand(1, "UpdatedBrand", "1999-1-1");

        /* GET BRAND LIST */
        // List<Brand> brandList = new ArrayList<>();
        // dal.getBrandList(brandList);
        // System.out.println(brandList.toString());

        /* GET BRAND BY ID */
        // System.out.println(dal.getBrandById(1));

        /* DELETE BRAND */
        // dal.deleteBrand(1);

        /* INSERT CAR */
        // Car car = new Car();
        // car.setBrandId(2);
        // car.setModel("Ford Puma");
        // car.setCategory("Crossover");
        // car.setColor("Grey");
        // car.setFuelType("Petrol");
        // car.setYear(2000);
        // car.setMiles(219700);
        // car.setEngineCapacity(1400);
        // car.setHorsePower(90);
        // car.setTransmition("Manual");
        // car.setDoorsNumber(3);
        // car.setCapacity(5);
        // car.setOrigin("Portugal");
        // car.setFuelConsumption(9.0);
        // car.setAcceleration(10.5);
        // car.setCarCondition("BERY GOOT BERY NAICE");
        // dal.insertCar(car);

        /* UPDATE CAR */
        // dal.updateCar(3, 2, "Ford Pantera", "CrossMato", "GAY", "Garseline", 1980, 200000, 1900, 110, "Manual", 5, 5, "Fake", 10.5, 11.5, "Battle-Scared");

        /* GET CAR LIST */
        // List<Car> carList = new ArrayList<>();
        // dal.getCarList(carList);
        // System.out.println(carList.toString());

        /* GET CAR BY ID */
        // System.out.println(dal.getCarById(3));

        /* DELETE CAR */
        // dal.deleteCar(1);

        /* Insert Car Comment */
        // CarComment comment = new CarComment();
        // comment.setComentatorId(4);
        // comment.setCarId(1);
        // comment.setComment("Car 1 comment");
        // comment.setRating(5);
        // dal.insertCarComment(comment);

        /* Update Car Comment */
        // dal.updateCarComment(1, 4, 1, "Car 1 NEW comment", 4.5);

        /* Get Car Comments List */
        // List<CarComment> commentList = new ArrayList<>();
        // dal.getCarCommentList(commentList);
        // System.out.println(commentList.toString());
        
        /* Get Car Comments By Id*/
        // System.out.println(dal.getCarCommentById(1));
        
        /* Get Car Comments By Comentator*/
        // System.out.println(dal.getCarCommentByComentatorId(4));

        /* Delete Car Comment By Id */
        // dal.deleteCarComment(1);

        /* INSERT Favorites */
        // Favorites favorite = new Favorites();
        // favorite.setUserId(4);
        // favorite.setCarId(1);
        // dal.insertFavorites(favorite);

        /* UPDATE Favorites */
        // dal.updateFavorites(1, 4, 1);

        /* GET Favorites List By userId*/
        // List<Favorites> favoritesList = new ArrayList<>();
        // dal.getFavoritesListUser(favoritesList, 4);
        // System.out.println(favoritesList.toString());

        /* GET Favorites by Id */
        // System.out.println(dal.getFavoritesById(1).toString());

        /* DELETE Favorites by Id */
        // dal.deleteFavorites(1);

        /* INSERT Insurer */
        // Insurer insurer = new Insurer();
        // insurer.setName("Insurer1");
        // insurer.setEmail("insurer1@gmail.com");
        // insurer.setPhoneNumber("252686921");
        // insurer.setAdress("Road of the Insurer1");
        // insurer.setRating(5);
        // dal.insertInsurer(insurer);

        /* UPDATE Insurer */
        // dal.updateInsurer(1, "Insurer 1 Name", "insurer1@email.com", "222222222", "Adress1", 4.5);

        /* GET Insurer List*/
        // List<Insurer> insurersList = new ArrayList<>();
        // dal.getInsurerList(insurersList);
        // System.out.println(insurersList.toString());

        /* GET Insurer By Id */
        // System.out.println(dal.getInsurerById(1).toString());

        /* DELETE Insurer By Id */
        // dal.deleteInsurer(1);

        /* INSERT Insurance */
        // Insurance insurance = new Insurance();
        // insurance.setInsurerId(2);
        // insurance.setName("Insurance 1");
        // insurance.setAdvantages("Cheap and No tax");
        // insurance.setPricePerMonth(19.99);
        // insurance.setPricePerYear(69.99);
        // dal.insertInsurance(insurance);

        /* UPDATE Insurance */
        // dal.updateInsurance(2,2, "Updated Insurance", "Cheap but WITH tax now!", 19.99, 199.99);

        /* Get Insurance List */
        // List<Insurance> insuranceList = new ArrayList<>();
        // dal.getInsuranceList(insuranceList);
        // System.out.println(insuranceList.toString());
    
        /* GET Insurance By Id */
        // System.out.println(dal.getInsuranceById(2));

        /* GET Insurance By insurerId */
        // System.out.println(dal.getInsuranceByInsurerId(2));

        /* DELETE Insurance */
        // dal.deleteInsurance(2);

        /* INSERT Insurance Deal */
        // InsuranceDeal deal = new InsuranceDeal();
        // deal.setInsuranceId(3);
        // deal.setCarId(3);
        // deal.setUserId(4);
        // dal.insertInsuranceDeal(deal);

        /* UPDATE Insurance Deal By ID */
        // dal.updateInsuranceDeal(1, 3, 2, 4);

        /* GET Insurance Deal List */
        // List<InsuranceDeal> dealList = new ArrayList<>();
        // dal.getInsuranceDealList(dealList);
        // System.out.println(dealList.toString());

        /* GET Insurance Deal By Id */
        // System.out.println(dal.getInsuranceDealById(1));

        /* GET Insurance Deal By carId */
        // System.out.println(dal.getInsuranceDealByCarId(2));

        /* GET Insurance Deal By userId */
        // List<InsuranceDeal> dealList = new ArrayList<>();
        // dal.getInsuranceDealByUserId(dealList,4);
        // System.out.println(dealList.toString());

        /* DELETE Insurance Deal */
        // dal.deleteInsuranceDeal(1);

        /* INSERT Insurer Comment */
        // InsurerComment comment = new InsurerComment();
        // comment.setComentatorId(4);
        // comment.setInsurerId(2);
        // comment.setComment("BERY GOOD BERY NICE");
        // comment.setRating(5);
        // dal.insertInsurerComment(comment);

        /* UPDATE Insurer Comment */
        // dal.updateInsurerComment(1, 4, 2, "THE BEST!", 4.5);

        /* GET Insurer Comment List */
        // List<InsurerComment> commentsList = new ArrayList<>();
        // dal.getInsurerCommentList(commentsList);
        // System.out.println(commentsList.toString());

        /* GET Insurer Comment By Id */
        // System.out.println(dal.getInsurerCommentById(1));

        /* GET Insurer Comment By insurerId */
        // List<InsurerComment> commentsList = new ArrayList<>();
        // dal.getInsurerCommentByInsurer(commentsList, 2);
        // System.out.println(commentsList.toString());

        /* GET Insurer Comment By userId */
        // List<InsurerComment> commentsList = new ArrayList<>();
        // dal.getInsurerCommentByComentator(commentsList, 4);
        // System.out.println(commentsList.toString());

        /* DELETE Insurer Comment By Id */
        // dal.deleteInsurerComment(1);

        /* INSERT Rent Announcement*/
        // RentAnnouncement announcement = new RentAnnouncement();
        // announcement.setCarId(1);
        // announcement.setRenterId(4);
        // announcement.setLocation("Póvoa de Varzim");
        // announcement.setInsurance(false);
        // announcement.setInsuranceId(3);
        // announcement.setPrice(499.99);
        // announcement.setNegotiable(false);
        // dal.insertRentAnnouncement(announcement);

        /* UPDATE Rent Announcement */
        // dal.updateRentAnnouncement(2, "Vila do Conde", false, 0, 499.99, true);
        // dal.updateRentAnnouncement(3, "Póvoa de Varzim", true, 3, 499.99, true);

        /* GET Rent Announcement List */
        // List<RentAnnouncement> announcementList = new ArrayList<>();
        // dal.getRentAnnouncementList(announcementList);
        // System.out.println(announcementList.toString());

        /* GET Rent Announcement By Id */
        // System.out.println(dal.getRentAnnouncementById(2));
        
        /* GET Rent Announcement By renterId */
        // List<RentAnnouncement> announcementList = new ArrayList<>();
        // dal.getRentAnnouncementByRenterId(announcementList, 4);
        // System.out.println(announcementList.toString());

        /* DELETE Rent Announcement */
        // dal.deleteRentAnnouncement(2);

        /* INSERT Rent Deal */
        // RentDeal deal = new RentDeal();
        // deal.setClientId(4);
        // deal.setAnnouncementId(3);
        // deal.setPrice(dal.getRentAnnouncementById(3).getPrice());
        // deal.setDone(true);
        // dal.insertRentDeal(deal);

        /* UPDATE Rent Deal */
        // dal.updateRentDeal(1, 4, 3, 999.99, false);

        /* GET Rent Deal List */
        // List<RentDeal> dealList = new ArrayList<>();
        // dal.getRentDealList(dealList);
        // System.out.println(dealList.toString());

        /* GET Rent Deal By Id */
        // System.out.println(dal.getRentDealById(1));

        /* GET Rent Deal By announcementId */
        // List<RentDeal> dealList = new ArrayList<>();
        // dal.getRentDealByAnnouncementId(dealList, 3);
        // System.out.println(dealList.toString());

        /* GET Rent Deal By clientId*/
        // List<RentDeal> dealList = new ArrayList<>();
        // dal.getRentDealByClientId(dealList, 4);
        // System.out.println(dealList.toString());

        /* DELETE Rent Deal By Id */
        // dal.deleteRentDeal(1);

        /* INSERT SALE ANNOUNCEMENT */
        // SaleAnnouncement announcement = new SaleAnnouncement();
        // announcement.setCarId(1);
        // announcement.setSellerId(4);
        // announcement.setLocation("Póvoa de Varzim");
        // announcement.setWarranty(false);
        // announcement.setSecondkey(true);
        // announcement.setPrice(290000);
        // announcement.setNegotiable(true);
        // dal.insertSaleAnnouncement(announcement);

        /* UPDATE Sale Announcement */
        // dal.updateSaleAnnouncement(1, "Vila do Conde", true, 2, false, 300000, false);

        /* GET Sale Announcement List */
        // List<SaleAnnouncement> announcementList = new ArrayList<>();
        // dal.getSaleAnnouncementList(announcementList);
        // System.out.println(announcementList.toString());

        /* GET Sale Announcement By Id */
        // System.out.println(dal.getSaleAnnouncementById(1));

        /* GET Sale Announcement By sellerId */
        // List<SaleAnnouncement> announcementList = new ArrayList<>();
        // dal.getSaleAnnouncementBySellerId(announcementList, 4);
        // System.out.println(announcementList.toString());

        /* DELETE Sale Announcement By Id */
        // dal.deleteSaleAnnouncement(1);

        /* INSERT Sale Deal */
        // SaleDeal deal = new SaleDeal();
        // deal.setBuyerId(4);
        // deal.setAnnouncementId(1);
        // deal.setPrice(dal.getSaleAnnouncementById(1).getPrice());
        // deal.setDone(false);
        // dal.insertSaleDeal(deal);

        /* UPDATE Sale Deal */
        // dal.updateSaleDeal(1, 4, 1, 400000, true);

        /* GET Sale Deal List */
        // List<SaleDeal> dealList = new ArrayList<>();
        // dal.getSaleDealList(dealList);
        // System.out.println(dealList.toString());

        /* GET Sale Deal By Id */
        // System.out.println(dal.getSaleDealById(1));

        /* GET Sale Deal By buyerId */
        // List<SaleDeal> dealList = new ArrayList<>();
        // dal.getSaleDealByBuyerId(dealList, 4);
        // System.out.println(dealList.toString());

        /* GET Sale Deal By announcementId */
        // List<SaleDeal> dealList = new ArrayList<>();
        // dal.getSaleDealByAnnouncementId(dealList, 1);
        // System.out.println(dealList.toString());

}
}
