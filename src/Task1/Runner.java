package Task1;

import java.util.Scanner;

import static Task1.DayOfTheWeek.*;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7\n" +
                "Для выхода нажмите 0");
        while (true) {
            int numberOfTheDay = scanner.nextInt();
            if (numberOfTheDay == 0) {
                break;
            }
            switch (numberOfTheDay) {
                case 1 -> System.out.println(MONDAY);
                case 2 -> System.out.println(TUESDAY);
                case 3 -> System.out.println(WEDNESDAY);
                case 4 -> System.out.println(THURSDAY);
                case 5 -> System.out.println(FRIDAY);
                case 6 -> System.out.println(SATURDAY);
                case 7 -> System.out.println(SUNDAY);
                default -> System.out.println("Не верный ввод!!!\n" +
                        "Число должно быть от 1 до 7");
            }
        }
    }
}
