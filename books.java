public class books {
  
    String title;
    String author;
    double price;

     
    books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
 
    void displaydetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
         
        books[] b = {
            new books("C Programming", "Ramesh Jain", 600),
            new books("Java Programming reference ", "John Doe", 450),
            new books("Python Programming", "Jane Smith", 700)
        };

        System.out.println("Books priced above 500 are:");
        for (books b1 : b) {
            if (b1.price > 500) {
                b1.displaydetails();   
            }
     }
 }
}

