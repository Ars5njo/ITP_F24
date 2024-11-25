import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output.txt"))
        {
            //The code read and write only one line from file
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            out.write(buffer, 0, buffer.length);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}