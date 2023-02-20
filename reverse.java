import java.util.*;

public class reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String final_string = "";
        char arr[] = input.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            final_string += arr[i];
        }
        System.out.println(final_string);
        sc.close();
    }
}
