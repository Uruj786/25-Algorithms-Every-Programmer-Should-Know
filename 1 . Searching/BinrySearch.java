import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found, return its index
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found, return -1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the sorted array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        System.out.println("Enter the sorted elements of the array:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();

        // Binary search requires a sorted array, so we'll sort it first.
        Arrays.sort(arr);

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}/* This Java code is an implementation of the binary search algorithm, which is used to search for a specific element in a sorted array efficiently. Here's a step-by-step description of the code:

1. Import Statements:
   - The code begins with import statements for the `java.util.Arrays` and `java.util.Scanner` classes. These imports are necessary for using array manipulation and user input functions.

2. BinarySearch Class:
   - The code defines a class named `BinarySearch`.

3. `binarySearch` Method:
   - This method is used to perform the binary search algorithm.
   - It takes two parameters: an integer array `arr` and an integer `target` to be searched for.
   - The method initializes two pointers, `left` and `right`, representing the range of indices to search within the array.
   - It enters a while loop that continues as long as `left` is less than or equal to `right`.
   - Inside the loop, it calculates the middle index, `mid`, to divide the search range in half.
   - It compares the element at index `mid` with the `target`:
     - If they are equal, it returns `mid`, indicating that the target element has been found at this index.
     - If the element at `mid` is less than the `target`, it updates `left` to `mid + 1`, indicating that the search should continue in the right half of the array.
     - If the element at `mid` is greater than the `target`, it updates `right` to `mid - 1`, indicating that the search should continue in the left half of the array.
   - If the while loop exits without finding the target, the method returns -1 to indicate that the element was not found in the array.

4. `main` Method:
   - The `main` method is the entry point of the program.
   - It starts by creating a `Scanner` object `sc` to read user input.
   - It prompts the user to enter the length of the sorted array and reads it into the variable `len`.
   - It creates an integer array `arr` of length `len` to store the sorted elements.
   - It then prompts the user to enter the sorted elements one by one and populates the `arr` array.
   - Next, it prompts the user to enter the element they want to search for and reads it into the variable `target`.
   - Before performing the binary search, the code sorts the `arr` array in ascending order using `Arrays.sort(arr)`.
   - It then calls the `binarySearch` method with the sorted array and the target element and stores the result in the `index` variable.
   - Finally, it checks if `index` is not equal to -1. If it's not, it prints the index at which the element was found; otherwise, it prints a message indicating that the element was not found.

5. Closing the Scanner:
   - The `main` method closes the `Scanner` object `sc` to release system resources.

Overall, this code demonstrates how to use the binary search algorithm to efficiently find an element in a sorted array after taking user input for array elements and the target element to search for. */
