import java.util.Scanner;
public class Input {
    public static void main(String[]args) { 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = s.nextInt();
        System.out.println("Enter 2nd number:");
        int b = s.nextInt();
        int sum = a + b;
        System.out.println("The result of addition is " + sum);
        s.close();
    }
}