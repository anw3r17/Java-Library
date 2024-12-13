import java.io.*;
class Test {
    void m() throws IOException {
        throw new IOException("Device error");
    }
    void display(){
        try {
            m();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}
public class Throwz {
    public static void main(String arg[]){
        Test t = new Test();
        t.display();
    }
}
