package task2;

import java.util.*;
import java.util.regex.Pattern;

public class Number {
    public static void main(String[] args) {
        List<String> listNumber = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String string;
        String regexForNumber = "\\-?\\d+";
        String regexForWhile = "stop";
        System.out.println("\nEnter please numbers.\nAfter entering write \"stop\"");
        while (true) {
            string = scanner.nextLine();
            if (Pattern.matches(regexForWhile, string)) {
                break;
            }
            if (Pattern.matches(regexForNumber, string)) {
                listNumber.add(string);
            } else {
                System.out.println("Invalid input!\nOnly numbers!");
            }
        }
        if (!listNumber.isEmpty()) {
            Optional<String> minLength = listNumber.stream().min(Comparator.comparing(String::length));
            Optional<String> maxLength = listNumber.stream().max(Comparator.comparing(String::length));
            OptionalInt minNumber = listNumber.stream().mapToInt(Integer::valueOf).min();
            OptionalInt maxNumber = listNumber.stream().mapToInt(Integer::valueOf).max();

            System.out.println("This is the shortest number: " + minLength.get() + " length: " + minLength.get().length() +
                    "\nThis is the longest number: " + maxLength.get() + " length: " + maxLength.get().length() +
                    "\nThis is the smallest number: " + minNumber.getAsInt() +
                    "\nThis is the largest number: " + maxNumber.getAsInt());
        } else {
            System.out.println("List is Empty");
        }
    }
}
