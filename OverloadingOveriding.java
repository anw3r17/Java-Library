//overloading
class overloading {
    public int sum(){
        int a = 10;
        int b = 10;
        int c = a + b;
        return c;
    }
    public int sum(int x, int y){
        return x + y;
    }
    public int sum(int x, int y, int z){
        return x + y + z;
    }
}
///overiding
class A {
    void show(){
        System.out.println("Show method in class A");
    }
}
class B extends A {
    void show(){
        System.out.println("Show method in Class B");
    }
}
public class OverloadingOveriding {
    public static void main(String arg[]) {
        overloading s = new overloading();
        System.out.println("Method Overloading with no parameters:" + s.sum());
        System.out.println("Method Overloading with 2 parameters: " + s.sum(10, 20));
        System.out.println("Method Overloading with 3 parameters: " + s.sum(90, 10, 11));
        A a = new A();
        a.show();
        B b = new B();
        b.show();
    }
}
