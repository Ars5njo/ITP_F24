import java.io.*;
public class Main {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output.txt")) {
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            String data = new String(buffer);
            String numsString[] = data.split(" ");
            int num1 = Integer.parseInt(numsString[0]);
            int num2 = Integer.parseInt(numsString[1]);
            int result  = num1 / num2;
            out.write(String.valueOf(result).getBytes());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}