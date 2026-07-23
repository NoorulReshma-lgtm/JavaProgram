import java.util.Scanner;

public class EquilibriumIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int totalSum = 0;

        // Calculate total sum
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;
        boolean found = false;

        // Find Equilibrium Index
        for (int i = 0; i < n; i++) {

            totalSum -= arr[i];

            if (leftSum == totalSum) {
                System.out.println("Equilibrium Index = " + i);
                found = true;
                break;
            }

            leftSum += arr[i];
        }

        if (!found) {
            System.out.println("No Equilibrium Index Found.");
        }

        sc.close();
    }
}
