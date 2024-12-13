//single try block
class Test {
    void display(){
        try {
            int a = 15/0;
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
//array index out of bounds exception
class Test1 {
    void display1() {
    try {
        int a[] = new int[5];
        a[6] = 51;
    }
    catch(Exception e) {
        System.out.println(e);
    }
}
}
//multiple catch blocks using single try block
class Test3 {
    void display3(){
        try {
            int a = 5, b = 5, c;
            c = a / b;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
    }
}

public class ExceptionHandling {
    public static void main(String arg[]){
        Test t = new Test();
        Test1 y = new Test1();
        Test3 u = new Test3();
        t.display();
        System.out.println("Exception handeled.");
        y.display1();
        System.out.println("Exception handeled.");
        u.display3();
        System.out.println("Exception handeled.");
    }    
}
