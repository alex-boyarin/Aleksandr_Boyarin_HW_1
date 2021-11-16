package task4;

import task4.car.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TaxiPark {
    private final List<Car> listCars;

    public TaxiPark(String fileAddress) throws IOException {
        this.listCars = getCars(fileAddress);
    }

    public double getCostOfCars() {
        return listCars.stream()
                .mapToDouble(Car::getPrice)
                .sum();
    }

    public List<Car> getSortedFuelConsumption() {
        return listCars.stream()
                .sorted(Comparator.comparing(Car::getFuelConsumption))
                .collect(Collectors.toList());
    }

    public List<Car> getListMaxSpeedOfCars(Scanner scanner) {
        System.out.print("Введите диапазон максимальной скорости\nот-");
        int speedValue1 = number(scanner);
        System.out.print("до-");
        int speedValue2 = number(scanner);
        return listCars.stream()
                .filter(car -> car.getMaxSpeed() >= speedValue1 &&
                        car.getMaxSpeed() <= speedValue2)
                .collect(Collectors.toList());
    }

    private int number(Scanner scanner) {
        String string;
        while (true) {
            string = scanner.next();
            if (Pattern.matches("\\d+", string)) {
                break;
            } else {
                System.out.println("Не верное значение!!! Введите только числа");
            }
        }
        return Integer.parseInt(string);
    }

    private List<Car> getCars(String fileAddress) throws IOException {
        List<Car> cars = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileAddress))) {
            while (bufferedReader.ready()) {
                String[] stringsLine = bufferedReader.readLine().split(";");
                String typeBody = stringsLine[0];
                String brand = stringsLine[1];
                String modelCar = stringsLine[2];
                String typeFuel = stringsLine[3];
                double fuelConsumption = Double.parseDouble(stringsLine[4]);
                int maxSpeed = Integer.parseInt(stringsLine[5]);
                double price = Double.parseDouble(stringsLine[6]);
                if (typeBody.equals("Bus")) {
                    cars.add(new Minibus(typeBody, brand, modelCar, typeFuel, fuelConsumption, maxSpeed, price));
                }
                if (typeBody.equals("Sedan")) {
                    cars.add(new Sedan(typeBody, brand, modelCar, typeFuel, fuelConsumption, maxSpeed, price));
                }
                if (typeBody.equals("Coupe")) {
                    cars.add(new Coupe(typeBody, brand, modelCar, typeFuel, fuelConsumption, maxSpeed, price));
                }
                if (typeBody.equals("Crossover")) {
                    cars.add(new Crossover(typeBody, brand, modelCar, typeFuel, fuelConsumption, maxSpeed, price));
                }
                if (typeBody.equals("Universal")) {
                    cars.add(new Universal(typeBody, brand, modelCar, typeFuel, fuelConsumption, maxSpeed, price));
                }
            }
        }
        return cars;
    }
}
