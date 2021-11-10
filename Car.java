package by.overone;

import java.util.Objects;

public abstract class Car {
    public String carBrand;
    public String carModel;
    public int yearIssue;
    public int registrNumber;
    public String typeVehicle;
    public String  bodyType;

    public String  getCarBrand() {
        return carBrand;
    }
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
    public String getCarModel() {
        return carModel;
    }
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
    public int getYearIssue() {
        return yearIssue;
    }
    public void setYearIssue(int yearIssue) {
        this.yearIssue = yearIssue;
    }
    public int getRegistrNumber() {
        return registrNumber;
    }
    public void setRegistrNumber(int registrNumber) {
        this.registrNumber = registrNumber;
    }
    public String getTypeVehicle() {
        return typeVehicle;
    }
    public void setTypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
    }
    public String getBodyType() {
        return bodyType;
    }
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
    public Car () {
    };
    public Car(int yearIssue, String carModel) {
        this.carModel = carModel;
        this.yearIssue = yearIssue;
    }
    public Car(int registrNumber, int yearIssue) {
        this.registrNumber = registrNumber;
        this.yearIssue = yearIssue;
    }
     public Car(String CarBrand, int registrNumber) {
        this.carBrand = CarBrand;
        this.registrNumber = registrNumber;
     }


}
