
import java.util.Scanner;

public class SecondLargestSmallest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Find largest, second-largest, smallest and second-smallest
        for (int i = 0; i < n; i++) {

            int num = arr[i];

            // Find largest and second-largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }

            // Find smallest and second-smallest
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            }
            else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        System.out.println("\nLargest element: " + largest);
        System.out.println("Smallest element: " + smallest);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second-largest unique element does not exist.");
        } else {
            System.out.println("Second-largest unique element: " + secondLargest);
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Second-smallest unique element does not exist.");
        } else {
            System.out.println("Second-smallest unique element: " + secondSmallest);
        }

        sc.close();
    }
}
