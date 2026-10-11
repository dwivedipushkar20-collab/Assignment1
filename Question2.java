package Assingment1;
import java.util.*;

public class Question2 {
	

	    static void display(int[] arr, int n) {
	        System.out.print("Array: ");

	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }

	        System.out.println();
	    }

	    static int insert(int[] arr, int n, int position, int value) {

	        if (position < 0 || position > n) {
	            System.out.println("Invalid position.");
	            return n;
	        }

	        for (int i = n; i > position; i--) {
	            arr[i] = arr[i - 1];
	        }

	        arr[position] = value;

	        return n + 1;
	    }

	    static int delete(int[] arr, int n, int position) {

	        if (position < 0 || position >= n) {
	            System.out.println("Invalid position.");
	            return n;
	        }

	        for (int i = position; i < n - 1; i++) {
	            arr[i] = arr[i + 1];
	        }

	        return n - 1;
	    }

	    static int linearSearch(int[] arr, int n, int key) {

	        for (int i = 0; i < n; i++) {
	            if (arr[i] == key) {
	                return i;
	            }
	        }

	        return -1;
	    }

	    static int binarySearch(int[] arr, int n, int key) {

	        int low = 0;
	        int high = n - 1;

	        while (low <= high) {

	            int mid = (low + high) / 2;

	            if (arr[mid] == key) {
	                return mid;
	            } else if (arr[mid] < key) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return -1;
	    }

	    static int maximum(int[] arr, int n) {

	        int max = arr[0];

	        for (int i = 1; i < n; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        return max;
	    }

	    static void countEvenOdd(int[] arr, int n) {

	        int even = 0;
	        int odd = 0;

	        for (int i = 0; i < n; i++) {

	            if (arr[i] % 2 == 0) {
	                even++;
	            } else {
	                odd++;
	            }
	        }

	        System.out.println("Even numbers = " + even);
	        System.out.println("Odd numbers = " + odd);
	    }

	    static void insertionSort(int[] arr, int n) {

	        for (int i = 1; i < n; i++) {

	            int key = arr[i];
	            int j = i - 1;

	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j--;
	            }

	            arr[j + 1] = key;
	        }
	    }


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {

            System.out.println("\n----- MENU -----");
            System.out.println("1. Display");
            System.out.println("2. Insert");
            System.out.println("3. Delete");
            System.out.println("4. Linear Search");
            System.out.println("5. Binary Search");
            System.out.println("6. Maximum");
            System.out.println("7. Count Even and Odd");
            System.out.println("8. Insertion Sort");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    display(arr, n);
                    break;

                case 2:
                    System.out.print("Enter position (0 to " + n + "): ");
                    int pos = sc.nextInt();

                    System.out.print("Enter value: ");
                    int value = sc.nextInt();

                    n = insert(arr, n, pos, value);
                    display(arr, n);
                    break;

                case 3:
                    System.out.print("Enter position to delete: ");
                    int delPos = sc.nextInt();

                    n = delete(arr, n, delPos);
                    display(arr, n);
                    break;

                case 4:
                    System.out.print("Enter value to search: ");
                    int key = sc.nextInt();

                    int result = linearSearch(arr, n, key);

                    if (result == -1)
                        System.out.println("Element not found.");
                    else
                        System.out.println("Element found at index " + result);

                    break;

                case 5:
                    System.out.println("Note: Binary Search requires a sorted array.");

                    System.out.print("Enter value to search: ");
                    key = sc.nextInt();

                    result = binarySearch(arr, n, key);

                    if (result == -1)
                        System.out.println("Element not found.");
                    else
                        System.out.println("Element found at index " + result);

                    break;

                case 6:
                    if (n > 0)
                        System.out.println("Maximum = " + maximum(arr, n));
                    break;

                case 7:
                    countEvenOdd(arr, n);
                    break;

                case 8:
                    insertionSort(arr, n);
                    System.out.println("Array sorted successfully.");
                    display(arr, n);
                    break;

                case 9:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 9);

        sc.close();
    }
		
		// TODO Auto-generated method stub

	}


