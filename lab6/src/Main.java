import java.util.Scanner;
//task 1
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number a: ");
        int a = scanner.nextInt();
        System.out.print("Input number b: ");
        int b = scanner.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.printf("a = %d \nb = %d\n", a, b);
    }
}
*/
//task 2
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        System.out.println("The ASCII value of " + ch + " is: " + (int) ch);
    }
}
*/
//task 3
/*
public class Main {
    public static void main(String[] args) {
        char ch = 'a';
        while(ch != 'z'){
            System.out.println((int) ch - (int) 'a');
            ch++;
        }
    }
}
*/
//task 4
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        boolean flag = true;
        if(str1.length() != str2.length()){
            System.out.println("NO");
            flag = false;
        }
        if(flag){
            for(int i = 0; i < str1.length(); i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    System.out.println("NO");
                    flag = false;
                }
            }
        }
        if(flag){
            System.out.println("YES");
        }
    }
}
*/
//task 5
