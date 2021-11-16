package task4;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        TaxiPark taxiPark = new TaxiPark("src/task4/carList.txt");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Сделайте выбор:\n" +
                    "1. Вывести стоимость таксопарка.\n" +
                    "2. Сортировка автомобилей по расходу топлива.\n" +
                    "3. Поиск автомобилей по заданному диапазону максимальной скорости\n" +
                    "0 Выход.\n");
            String option = scanner.next();
            if (Pattern.matches("[0-3]", option)) {

                if (option.equals("1")) {
                    System.out.println("Стоимость таксопарка составляет="
                            + taxiPark.getCostOfCars() + "$\n");
                }
                if (option.equals("2")) {
                    System.out.println("Сортировка автомобилей по расходу топлива.\n"
                            + taxiPark.getSortedFuelConsumption());
                }
                if (option.equals("3")) {
                    System.out.println("Поиск автомобилей по заданному диапазону максимальной скорости\n" +
                            taxiPark.getListMaxSpeedOfCars(scanner));
                }
                if (option.equals("0")) {
                    break;
                }
            } else {
                System.out.println("Не верный ввод!!! Сделайте правильный выбор.\n");
            }
        }
    }
}
