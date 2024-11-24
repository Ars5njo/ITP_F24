public class UserManager implements UMInter{
    private String name;
    private String surname;
    private int membership_ID;
    private int years;
    private int current_reading_book_id = -1;

    UserManager(String name, String surname, int membership_ID){
        this.name = name;
        this.surname = surname;
        this.membership_ID = membership_ID;
    }

    public void membershipCreation(int years){
        this.years = years;
        System.out.println("Membership Created for " + years + " years for member with ID " + membership_ID);
    }

    public void membershipExtension(int years){
        this.years += years;
        System.out.println("Membership Extended for " + years + " years for member with ID " + membership_ID + ". Current membership " + this.years + " years");
    }

    public void readingBook(int book_id){
        this.current_reading_book_id = book_id;
    }

    public void returningBook(){
        current_reading_book_id = -1;
    }

    public int getCurrent_reading_book_id(){
        return current_reading_book_id;
    }

    public String getFullInfo(){
        return "Name: " + this.name + " Surname: " + this.surname + " Membership ID: " + this.membership_ID;
    }

    public int getID(){
        return membership_ID;
    }

    public String getFullName(){
        return name + " " + surname;
    }

    public int getMembershipYears(){
        return years;
    }
}
