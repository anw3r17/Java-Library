import java.util.Scanner;
public class StudentPercentage {
    @SuppressWarnings("resource")
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        String name;
        System.out.println("Enter the name of the Student:");
        name = s.nextLine();
        System.out.println("Enter the marks obtained in Subject 1");
        float s1 = s.nextFloat();
        System.out.println("Enter the marks obtained in Subject 2");
        float s2 = s.nextFloat();
        System.out.println("Enter the marks obtained in Subject 3");
        float s3 = s.nextFloat();
        System.out.println("Enter the marks obtained in Subject 4");
        float s4 = s.nextFloat();
        System.out.println("Enter the marks obtained in Subject 5");
        float s5 = s.nextFloat();
        double percentage = ((s1 + s2 + s3 + s4 + s5)/ 500.0) * 100;
        System.out.println("The Percentage obtained by " + name + " is:");
        System.out.println(percentage);
        

        
        


    }
}
