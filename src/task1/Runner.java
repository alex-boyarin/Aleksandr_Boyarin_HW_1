package task1;

import java.util.Scanner;
import java.util.regex.Pattern;

import static task1.DayOfTheWeek.*;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7\n" +
                "Для выхода нажмите 0");
        while (true) {
            String numberOfTheDay = scanner.next();
            if (numberOfTheDay.equals("0")) {
                break;
            }
            if (Pattern.matches("[1-7]", numberOfTheDay)) {
                switch (Integer.parseInt(numberOfTheDay)) {
                    case 1 -> System.out.println(MONDAY);
                    case 2 -> System.out.println(TUESDAY);
                    case 3 -> System.out.println(WEDNESDAY);
                    case 4 -> System.out.println(THURSDAY);
                    case 5 -> System.out.println(FRIDAY);
                    case 6 -> System.out.println(SATURDAY);
                    case 7 -> System.out.println(SUNDAY);
                }
            } else {
                System.out.println("Не верный ввод!!!\n" +
                        "Число должно быть от 1 до 7");
            }
        }
    }
}
