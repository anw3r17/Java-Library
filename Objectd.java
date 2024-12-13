import java.util.*;
class cal {
    void add() {
        Scanner s = new Scanner(System.in);
        System.out.println("Input two values for addition:\n");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = a + b;
        System.out.printf("The result of addition of %d & %d is: %d\n", a, b, c);
    }
    void sub() {
    Scanner s = new Scanner(System.in);
    System.out.println("Input two values for subtraction:\n");
    int d = s.nextInt();
    int e = s.nextInt();
    int f = d - e;
    System.out.printf("The result of addition of %d & %d is: %d\n", d, e, f);
    }
}
public class Objectd {
    public static void main(String arg[]){
        cal y = new cal();
        int choice;
        Scanner l = new Scanner(System.in);
        System.out.println("Input your choice:\n1.Addition\n2.Subtraction");
        choice = l.nextInt();
        switch(choice){
            case 1:
            y.add();
            break;
            case 2:
            y.sub();
            break;
            default:
            System.out.println("Invalid choice!");
        }
    }
}