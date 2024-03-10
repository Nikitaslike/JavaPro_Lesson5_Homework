//Car: id, Марка, Модель, Рік випуску, Колір, Ціна, Реєстраційний номер. Створити масив об'єктів.
package car.info.com;

import java.util.ArrayList;
import java.util.List;

public class Car {
    long id;
    int yearRelease;
    double price;
    String brand, model, colour, registrationNumber;
    public Car(long id, int yearRelease, double price, String brand, String model,
               String colour, String registrationNumber){
        this.brand = brand;
        this.yearRelease = yearRelease;
        this.price = price;
        this.model = model;
        this.colour = colour;
        this.id = id;
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYearRelease() {
        return yearRelease;
    }
    public double getPrice() {
        return price;
    }
    public String getColour() {
        return colour;
    }
    public void getId(long id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
    @Override
    public String toString() {
        return "Бренд: "+ brand +"; Рік: "+yearRelease+"; Ціна: "+price+"; " +
                "Модель: "+model+"; Колір: "+colour+"; ID:"+id+"; Реєстраційний номер: "+registrationNumber;
    }
}