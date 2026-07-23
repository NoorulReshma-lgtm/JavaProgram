import java.util.Scanner;

public class LeadersInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Leaders in the Array:");

        for (int i = 0; i < n; i++) {

            boolean isLeader = true;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] > arr[i]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
