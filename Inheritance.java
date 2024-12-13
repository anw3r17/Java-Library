//single inheritance
class Animal{
    void eat(){
        System.out.println("Eating..");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("The dog is barking.");
    }
}
//multi-level inheritance
class babydog extends Dog {
    void weep(){
        System.out.println("The puppy is weeping.");
    }
}
//heirarchal inheritance
class cat extends Animal {
    void meow(){
        System.out.println("The cat is meowing and mewing.");
    }
}
public class Inheritance {
    public static void main(String arg[]){
        System.out.println("Single Inheritance:");
        Dog d = new Dog();
        d.eat();
        d.bark();
        System.out.println("Multi-Level Inheritance:");
        babydog b = new babydog();
        b.eat();
        b.bark();
        b.weep();
        System.out.println("Heirarchal Inheritance:");
        cat c = new cat();
        c.eat();
        c.meow();
    }
    
}
