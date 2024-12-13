abstract class Animal {
    abstract void makesound();
}
class dog extends Animal {
    void makesound(){
        System.out.println("Dog is barking");
    }
}
class cat extends Animal {
    void makesound(){
        System.out.println("Cat is meowing");
    }
}
public class Abztract {
    public static void main(String arg[]){
        dog d = new dog();
        cat c = new cat();
        d.makesound();
        c.makesound();
        
    }
}
