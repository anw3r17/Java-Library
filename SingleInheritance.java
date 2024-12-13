import java.util.Scanner;
public class SingleInheritance {
    class Studentinfo {
        int n;
        String name;
        float s1, s2, s3, s4, s5;
        int roll;

    }
    class StudentStruct extends Studentinfo {
        Scanner s = new Scanner();
        println("Input number of Students:");
        n = s.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Enter the name of Student " + i + ":");
            name = s.nextLine();
            System.out.println("Enter the roll number of Student " + i + ":");
            roll = s.nextInt();
        }
        System.out.println(name);
        System.out.println(roll);
    }
    public static void main(String arg[]) {
        StudentStruct s = new StudentStruct();
        s.
    }
}
