import java.util.*;

public class DThrow {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access Denied - You Are Under 18 Years!!");
        } else {
            System.out.println("Access Granded - You Are Old Enough");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age : ");
        checkAge(sc.nextInt());
        sc.close();
    }
}
