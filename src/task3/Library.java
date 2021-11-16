package task3;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Library {
    private List<Book> bookList;
    private final Book[] books = {
            new Book("Эффективная Java", "Джошуа Блох", 2010, 650, 180, "Твердый"),
            new Book("Clean Code", "Robert C. Martin", 2016, 720, 175, "Мягкий"),
            new Book("Java. Библиотека профессионала", "Кей С. Хорстманн", 2014, 670, 140, "Мягкий"),
            new Book("Head First. Паттерны проектирования", "Эрик Фримен, Элизабет Робсон", 2018, 810, 205, "Твердый"),
            new Book("Spring в действии", "Крейг Уоллс", 2013, 730, 170, "Мягкий"),
            new Book("Test Driven", "Lasse Koskela", 2012, 620, 115, "Мягкий"),
            new Book("Изучаем Java", "Кэти Сиерра, Берт Бейтс", 2019, 0, 0, "Твердый"),
            new Book("Алгоритмы на Java", "Роберт Седжвик, Кевин Уэйн", 0, 0, 0, "Твердый"),
            new Book("Head First Object-Oriented Analysis and Design", "Brett D. McLaughlin", 2017, 700, 150, "Твердый"),
            new Book("Java. Полное руководство", "Герберт Шилдт", 2015, 1500, 200, "Мягкий"),
    };

    public Book[] getBooks() {
        return books;
    }

    public List<Book> getListOfAuthorBooks(String author) {
        bookList = Arrays.stream(books)
                .filter(book -> book.getAuthor().toLowerCase().contains(author.toLowerCase()))
                .collect(Collectors.toList());
        return bookList.isEmpty() ? null : bookList;
    }

    public List<Book> getListOfTitleBooks(String bookTitle) {
        bookList = Arrays.stream(books)
                .filter(book -> book.getTitle().toLowerCase().contains(bookTitle.toLowerCase()))
                .collect(Collectors.toList());
        return bookList.isEmpty() ? null : bookList;
    }

    public List<Book> getListOfYearPublicationBooks(String fromYearPublication, String toYearPublication) {
        if (isNumber(fromYearPublication, toYearPublication)) {
            bookList = Arrays.stream(books)
                    .filter(book -> book.getYearOfPublishing() >= Integer.parseInt(fromYearPublication) &&
                            book.getYearOfPublishing() <= Integer.parseInt(toYearPublication))
                    .collect(Collectors.toList());
            return bookList.isEmpty() ? null : bookList;
        } else {
            System.out.println("Не корректный ввод даты, попробуйте еще раз.\n" +
                    "Дата должна содержать только год в числовом виде.");
            return null;
        }
    }

    private boolean isNumber(String fromYearPublication, String toYearPublication) {
        return Pattern.matches("\\d+", fromYearPublication) &&
                Pattern.matches("\\d+", toYearPublication);
    }

    @Override
    public String toString() {
        return "Books " + books;
    }
}
