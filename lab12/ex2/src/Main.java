import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("/Users/arsen/InnopolisBS/ITP/labs/lab12/ex2/.idea/input.txt");
            FileOutputStream out = new FileOutputStream("/Users/arsen/InnopolisBS/ITP/labs/lab12/ex2/.idea/output.txt"))
        {
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            out.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}