public interface UMInter {
    public void membershipCreation(int years);
    public void membershipExtension(int years);
    public void readingBook(int book_id);
    public void returningBook();
    public int getCurrent_reading_book_id();
    public String getFullInfo();
    public int getID();
    public String getFullName();
    public int getMembershipYears();
}
