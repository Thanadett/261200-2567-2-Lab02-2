public class Book {

    String title;
    String author;
    double price;
    double discount;


    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public void updatePrice(double newPrice) {
        if (newPrice < 0) {
            System.out.println("\nPrice negative.\n");
        } else {
            price = newPrice;
        }
    }

    public void applyDiscount(double discountPercent) {
        if (discountPercent > 0 && discountPercent < 100){
            double sumDiscount = (price * discountPercent) / 100;
            price -= sumDiscount;
            System.out.println("\nApplying a " + discountPercent + "%\n");
            System.out.println("New Price: " + price);
        }
        else {
            System.out.println("\nError : Discount percentage must be greater than 0.00 and less than 100.\n");
        }
    }
}