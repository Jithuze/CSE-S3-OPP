import java.util.*;

public class TokenDemo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Line Of Numbers : ");
        String input = s.next();
        StringTokenizer st = new StringTokenizer(input, "@");
        int sum = 0;
        while (st.hasMoreTokens()) {
            int n = 0;
            n = Integer.parseInt(st.nextToken());
            System.out.println("Number is : " + n);
            sum += n;
        }
        System.out.println("Sum Of The Numbers Is : " + sum);
        s.close();
    }
}
