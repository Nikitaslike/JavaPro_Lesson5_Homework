package car.info.com;

import java.util.ArrayList;
import java.util.List;

public class ListOfCars {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(2464678, 2024, 58000, "Porsche", "Cayenne", "чорний", "XLAXAXA90"));
        cars.add(new Car(3747429, 2021, 41500, "Toyota", "Camry", "білий", "XB9317OL"));
        cars.add(new Car(4843849, 2020, 99999.9, "Porsche",
                "Cayenne", "зелений", "VN9999HK"));

        String targetBrand = "Porsche";
        System.out.println("Cars of brand " + targetBrand + ":");
        for (Car car : cars) {
            if (car.getBrand().equals(targetBrand)) {
                System.out.println(car.getModel() + " (" + car.getYearRelease() + ")");
            }
        }

        int n = 1 + (int) (Math.random() * 3);
        String targetModel = "Cayenne";
        System.out.println("\nCars of model " + targetModel + " older than " + n + " years:");
        for (Car car : cars) {
            if (car.getModel().equals(targetModel) && (2024 - car.getYearRelease()) > n) {
                System.out.println(car.getBrand() + " " + car.getModel() + " (" + car.getYearRelease() + ")");
            }
        }

        int targetYear = 2024;
        double minPrice = 41500 + (int) (Math.random() * 100000);
        System.out.println("\nCars of year " + targetYear + " with price greater than $" + minPrice + ":");
        for (Car car : cars) {
            if (car.getYearRelease() == targetYear && car.getPrice() > minPrice) {
                System.out.println(car.getBrand() + " " + car.getModel() + " (" + car.getRegistrationNumber() + ")");
            }
        }
    }
}