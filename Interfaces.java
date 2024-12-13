//single class Interface
interface A{
    void display();
}
interface B {
    void show();
}
class C implements A, B{
    public void display(){
        System.out.println("Display Method.");
    }
    public void show(){
        System.out.println("Show Method.");
    }
}
//Multiple classes Interface
interface Features {
    void voice();
    void msg();
}
interface AddOns {
    void videocall();
    void mms();
}
class Phone implements Features {
    public void voice(){
        System.out.println("Phone Calling..");
    }
    public void msg(){
        System.out.println("Phone Messaging..");
    }
}
class Smartphone implements Features, AddOns {
    public void voice(){
        System.out.println("Smartphone voice Calling..");
    }
    public void msg(){
        System.out.println("Smartphone messaging..");
    }
    public void videocall(){
        System.out.println("Smartphone Video Calling..");
    }
    public void mms(){
        System.out.println("Smartphone MMSing..");
    }
}
public class Interfaces {
    public static void main(String arg[]){
        System.out.println("Single class interface.");
        C c = new C();
        c.display();
        c.show();
        System.out.println("Multiple Class Intreface.");
        Phone l = new Phone();
        Smartphone e = new Smartphone();
        l.voice();
        l.msg();
        e.voice();
        e.msg();
        e.videocall();
        e.mms();
    }
}
