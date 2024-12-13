import java.util.Scanner;
public class Greet {
    public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    String name;
    System.out.println("Enter your name:");
    name = s.nextLine();
    System.out.println("Hello " + name + ", have a good day!");
    s.close();
}
}
