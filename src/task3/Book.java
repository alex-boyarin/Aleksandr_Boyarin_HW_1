package task3;

public class Book {
    private final int id;
    private final String title;
    private final String author;
    private final int yearOfPublishing;
    private final int numberOfPages;
    private final int price;
    private final String bindingType;
    private static int idCounter;

    public Book(String title, String author, int yearOfPublishing, int numberOfPages, int price, String bindingType) {
        this.id = ++idCounter;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book " +
                " id: " + id +
                ", title: " + title +
                ", author: " + author +
                ", year: " + yearOfPublishing +
                ", pages: " + numberOfPages +
                ", price: " + price +
                ", binding type: " + bindingType + "\n";
    }
}
