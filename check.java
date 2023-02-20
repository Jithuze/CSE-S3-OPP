import java.util.*;

public class check {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int key;
        int sum = 0;
        int flag = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Element To Search : ");
        key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element Found");
                flag = 1;
                if (key % 2 == 0) {
                    for (int j = 0; j < arr.length; j++) {
                        sum += arr[j];
                    }
                    System.out.println("Sum of array is : " + sum);
                }
                break;
            } else {
                flag = 0;
            }

        }
        if (flag == 0)
            System.out.println("Element Not Found");
        sc.close();
    }
}
