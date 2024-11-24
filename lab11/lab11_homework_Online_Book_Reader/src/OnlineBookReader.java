import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class OnlineBookReader {

    public static void main(String[] args) {
        //Lists for customers library and customers
        List<Library> library = new ArrayList<>();
        List<UserManager> customers = new ArrayList<>();


        //Adding books to library
        library.add(new Library("Oliver Henry", "The gifts of magi", "1905", 1));
        library.add(new Library("Ray Bradbury", "1984", "1949", 2));
        library.add(new Library("Brian W. Kernighan", "The C Programming Language", "1978", 3));


        //Adding customers to database
        customers.add(new UserManager("Kto-to", "Kto-tov", 1));
        customers.add(new UserManager("Chto-to", "Chto-tov", 2));
        customers.add(new UserManager("Zachemto-to", "Zachemto-tov", 3));
        customers.add(new UserManager("Kuda-to", "Kuda-tov", 4));


        Scanner scanner = new Scanner(System.in);
        int command;


        while(true) {

            System.out.println("Choose an option: \n1. Create membership\n2. " +
                    "Extend membership \n3.Give a book to customer \n4. Get a book from customer \n5. Close panel");
            command = scanner.nextInt();

            if(command == 1){
                System.out.println("Input id of a customer and amount of years for membership creation\n");
                System.out.println("List of customers: ");
                for(int i = 0; i < customers.size(); i++){
                    System.out.println(customers.get(i).getFullInfo());
                }
                System.out.println();
                int id, years;
                System.out.print("ID: ");
                id = scanner.nextInt();
                System.out.print("Years: ");
                years = scanner.nextInt();
                int index;
                int flag_find_id = 0;
                for(index = 0; index < customers.size(); index++) {
                    if(customers.get(index).getID() == id){
                        flag_find_id = 1;
                        break;
                    }
                }
                if(flag_find_id == 0) {
                    System.out.println("Customer not found");
                }
                else {
                    customers.get(index).membershipCreation(years);
                    System.out.println("Membership was created for user " + customers.get(index).getFullName());
                }
            }

            else if(command == 2){
                System.out.println("Input id of a customer and amount of years for membership extend");
                System.out.println("List of customers: ");
                for(int i = 0; i < customers.size(); i++){
                    System.out.println(customers.get(i).getFullInfo());
                }
                System.out.println();
                int id, years;
                System.out.print("ID: ");
                id = scanner.nextInt();
                System.out.print("Years: ");
                years = scanner.nextInt();
                int index;
                int flag_find_id = 0;
                for(index = 0; index < customers.size(); index++) {
                    if(customers.get(index).getID() == id){
                        flag_find_id = 1;
                        break;
                    }
                }
                if(flag_find_id == 0) {
                    System.out.println("Customer not found");
                }
                else {
                    customers.get(index).membershipExtension(years);
                    System.out.println("Membership was extended for user " + customers.get(index).getFullName());
                }
            }

            else if(command == 3){
                System.out.println("Choose ID of a customer and ID of a book to give them\n");
                System.out.println("List of customers: ");
                for(int i = 0; i < customers.size(); i++){
                    System.out.println(customers.get(i).getFullInfo());
                }
                System.out.println();
                System.out.println("List of books: ");
                for(int i = 0; i < library.size(); i++){
                    System.out.println(library.get(i).getFullInfo());
                }
                System.out.println();
                int customer_id, book_id;
                System.out.print("ID of customer: ");
                customer_id = scanner.nextInt();
                System.out.print("ID of book: ");
                book_id = scanner.nextInt();
                int flag_find_customer_id = 0;
                int customer_index = 0;
                for(int i = 0; i < customers.size(); i++){
                    if(customers.get(i).getID() == customer_id){
                        flag_find_customer_id = 1;
                        customer_index = i;
                        break;
                    }
                }
                if(flag_find_customer_id == 0) {
                    System.out.println("Customer not found");
                }
                else {
                    int flag_find_book_id = 0;
                    int book_index = 0;
                    for(int i = 0; i < library.size(); i++){
                        if(library.get(i).getBookID() == book_id){
                            flag_find_book_id = 1;
                            book_index = i;
                            break;
                        }
                    }
                    if(flag_find_book_id == 0) {
                        System.out.println("Book not found");
                    }
                    else {
                        if(customers.get(customer_index).getCurrent_reading_book_id() != -1) {
                            System.out.println("Sorry, this customer alrady has a book to read");
                        }
                        else if(customers.get(customer_index).getMembershipYears() == 0) {
                            System.out.println("Sorry, this customer has no membership");
                        }
                        else if(!library.get(book_index).isAvailable()) {
                            System.out.println("Sorry, this book is being read by another customer, choose another one");
                        }
                        else {
                            customers.get(customer_index).readingBook(book_id);
                            library.get(book_index).CustomerReadBook(customer_id);
                            System.out.println("The customer with index " +
                                    customers.get(customer_index).getID() +
                                    " get the book with index " +
                                    library.get(book_index).getBookID());
                        }
                    }
                }
            }

            else if(command == 4){
                System.out.println("Choose ID of a customer and ID of a book to get from them\n");
                System.out.println("List of customers: ");
                for(int i = 0; i < customers.size(); i++){
                    System.out.println(customers.get(i).getFullInfo());
                }
                System.out.println();
                System.out.println("List of books: ");
                for(int i = 0; i < library.size(); i++){
                    System.out.println(library.get(i).getFullInfo());
                }
                System.out.println();
                int customer_id, book_id;
                System.out.print("ID of customer: ");
                customer_id = scanner.nextInt();
                System.out.print("ID of book: ");
                book_id = scanner.nextInt();
                int flag_find_customer_id = 0;
                int customer_index = 0;
                for(int i = 0; i < customers.size(); i++){
                    if(customers.get(i).getID() == customer_id){
                        flag_find_customer_id = 1;
                        customer_index = i;
                        break;
                    }
                }
                if(flag_find_customer_id == 0) {
                    System.out.println("Customer not found");
                }
                else {
                    int flag_find_book_id = 0;
                    int book_index = 0;
                    for(int i = 0; i < library.size(); i++){
                        if(library.get(i).getBookID() == book_id){
                            flag_find_book_id = 1;
                            book_index = i;
                            break;
                        }
                    }
                    if(flag_find_book_id == 0) {
                        System.out.println("Book not found");
                    }
                    else {
                        if(customers.get(customer_index).getCurrent_reading_book_id() == -1) {
                            System.out.println("This customer does not have a book to return");
                        }
                        else if(library.get(book_index).isAvailable()) {
                            System.out.println("Sorry, this book is already in the library");
                        }
                        else {
                            customers.get(customer_index).returningBook();
                            library.get(book_index).CustomerReturnBook();
                            System.out.println("The customer with index " +
                                    customers.get(customer_index).getID() +
                                    " return the book with index " +
                                    library.get(book_index).getBookID());
                        }
                    }
                }
            }

            else if(command == 5){
                System.out.println("Closing panel");
                break;
            }

            else {
                System.out.println("Command not found, choose another option");
            }
        }
    }
}