package task3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class LibraryManager {
    public static void main(String[] args) {
        Library library = new Library();
        System.out.println(Arrays.toString(library.getBooks()));
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Сделайте выбор: \n" +
                    "1. Список книг заданного автора.\n" +
                    "2. Список книг название которых содержит заданное слово (фразу)\n" +
                    "3. Список книг, выпущенных за определенный период времени (с...по).\n" +
                    "0 Выход.\n");
            String option = scanner.next();
            if (Pattern.matches("[0-3]", option)) {
                if (option.equals("1")) {
                    System.out.print("Введите автора: ");
                    String author = scanner.next();
                    System.out.println(library.getListOfAuthorBooks(author));
                }
                if (option.equals("2")) {
                    System.out.print("Введите название (фразу): ");
                    String bookTitle = scanner.next();
                    System.out.println(library.getListOfTitleBooks(bookTitle));
                }
                if (option.equals("3")) {
                    System.out.print("Введите год с- ");
                    String fromYearPublication = scanner.next();
                    System.out.print("           по- ");
                    String toYearPublication = scanner.next();
                    System.out.println(library.getListOfYearPublicationBooks(fromYearPublication, toYearPublication));
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

