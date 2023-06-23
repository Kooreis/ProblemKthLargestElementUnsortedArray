Here is a full working console application in Java that solves the problem:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the value of K:");
        int k = scanner.nextInt();
        System.out.println("The Kth largest element is: " + findKthLargest(array, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
```

This program first asks the user to enter the size of the array and the elements of the array. Then it asks for the value of K. It then calls the `findKthLargest` method to find the Kth largest element in the array. The `findKthLargest` method sorts the array in ascending order and returns the Kth largest element.