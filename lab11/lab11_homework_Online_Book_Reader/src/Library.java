public class Library implements LibInter{
    private String author;
    private String title;
    private String year;
    private int book_id;
    private int current_reading_customer_id = -1;
    private boolean available = true;

    Library(String author, String title, String year, int book_id) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.book_id = book_id;
    }

    public void CustomerReadBook(int current_reading_customer_id) {
        this.current_reading_customer_id = current_reading_customer_id;
        available = false;
    }

    public void CustomerReturnBook() {
        this.current_reading_customer_id = -1;
        available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getBookID() {
        return book_id;
    }

    public int getCurrentReadingCustomerID() {
        return current_reading_customer_id;
    }

    public String getFullInfo() {
        if (available) {
            return "Author: " + author + " Title: " + title + " Year: " + year + " Book ID: " + book_id + " Available: Yes";
        }
        else {
            return "Author: " + author + " Title: " + title + " Year: " + year + " Book ID: " + book_id + " Available: No";
        }
    }
}
