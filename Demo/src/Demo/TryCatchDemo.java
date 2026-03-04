package Demo;
public class TryCatchDemo {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error");
        }

        System.out.println("Hello World");
    }
}
