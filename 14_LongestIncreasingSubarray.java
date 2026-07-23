import java.util.Scanner;

public class LongestIncreasingSubarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxLength = 1;
        int currentLength = 1;
        int startIndex = 0;
        int endIndex = 0;
        int tempStart = 0;

        for (int i = 1; i < n; i++) {

            if (arr[i] > arr[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
                tempStart = i;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                startIndex = tempStart;
                endIndex = i;
            }
        }

        System.out.println("Length of Longest Increasing Subarray = " + maxLength);

        System.out.print("Longest Increasing Subarray: ");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
