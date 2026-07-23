import java.util.Scanner;

public class RearrangePositiveNegative {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int index = 0;

        // Store positive numbers first
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                result[index] = arr[i];
                index++;
            }
        }

        // Store negative numbers next
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                result[index] = arr[i];
                index++;
            }
        }

        System.out.println("Rearranged Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
