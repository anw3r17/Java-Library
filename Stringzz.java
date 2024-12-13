import java.util.StringTokenizer;
public class Stringzz {
    public static void main(String arg[]){
        //implement strings
        String s1 = new String("billu bhoi");
        String s2 = "Biryani";
        char ch[] = {'M', 'A', 'M', 'L', 'A'};
        String s3 = new String(ch);
        String s4 = "    jAvA, pRoGrAmMiNg!       ";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        //str methodzz
        System.out.printf("The lenght of %s is: %d\n", s1, s1.length());
        System.out.printf("The index of 'u' in %s is: %d\n", s1, s1.indexOf("u"));
        System.out.printf("Uppercase of %s is: %s\n", s2, s2.toUpperCase());
        System.out.printf("Lowercase of %s is: %s\n", s2, s2.toLowerCase());
        System.out.printf("The combined string of %s & %s is: %s\n", s2, s3, s2.concat(s3));
        System.out.printf("The first character of %s is: %s\n", s3, s3.charAt(0));
        System.out.printf("The trim string of %s is: %s\n", s4, s4.trim());
        System.out.printf("The comparision string result of %s & %s is: %d\n", s1, s2, s1.compareTo(s3));
        //str tokenizer
        StringTokenizer s5 = new StringTokenizer("Biryani bole to Hyderabad sunama chaklete");
        System.out.println("String Tokenizer:");
        while(s5.hasMoreTokens()){
            System.out.println(s5.nextToken());
        }

    }
}

