import java.security.PublicKey;
import java.util.*;

public class JavaBasic {

    public static int linearSearch(int number[], int key) {
        for (int i = 0; i <= number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch1(String menu[], String diss) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == diss) {
                return i;
            }
        }
        return -1;

    }

    public static int largetNum(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("smallest element of array : " + smallest);
        return largest;

    }

    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverse(int number[]) {
        int first = 0, last = number.length - 1;

        while (first < last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }
    }

    public static void printPairs(int number[]) {
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            int curr = number[i];
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + curr + "," + number[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs :: " + tp);
    }

    public static void printSubArray(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void printMaxSumSubArray(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {

                    // System.out.print(number[k] + " ");
                    // sum of subarray
                    currSum += number[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum :: " + maxSum);
    }

    public static void main(String args[]) {

        String menu[] = { "Dosa", "Idly", "Tea", "Coffee" };
        int key = 10;
        String diss = "Tea";
        int[] number = null;
        int index = linearSearch(number, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("array at index :: " + index);
        }
        int index1 = linearSearch1(menu, diss);
        if (index1 == -1) {
            System.out.println("diss not found");
        } else {
            System.out.println("diss found at index :: " + index1);
        }

        int arr[] = { 1, 3, 5, 7, 11, 10, 13, 15 };
        int key1 = 16;
        System.out.println("largest element of array : " + largetNum(arr));
        System.out.println("index for key is ::" + binarySearch(arr, key1));

        int number3[] = { 1, 3, 5, 7, 9, 10, 13, 15 };
        reverse(number3);
        for (int i = 0; i < number3.length; i++) {
            System.out.print(" " + number3[i]);
        }
        System.out.println();

        int number1[] = { 2, 4, 6, 8, 10 };
        printPairs(number1);
        printSubArray(number1);
        int number2[] = { 1, -2, 6, -1, 3 };
        printMaxSumSubArray(number2);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 0) {
            int lastDig = x % 10;
            x = x / 10;

            System.out.println("rev true" + x);
        } else {
            System.out.println("rev false " + x);
        }

    }
}
