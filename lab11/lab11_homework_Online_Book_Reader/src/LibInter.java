public interface LibInter {
    public void CustomerReadBook(int current_reading_customer_id);
    public void CustomerReturnBook();
    public boolean isAvailable();
    public int getBookID();
    public int getCurrentReadingCustomerID();
    public String getFullInfo();
}
