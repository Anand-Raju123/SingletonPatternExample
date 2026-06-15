package Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Logger obj = Logger.getInstance();
        Logger obj1 = Logger.getInstance();

        System.out.println(obj);
        System.out.println(obj1);
    }
}
