public class Backtracking {

    public static void subset(String str, int i, String ans) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        //
        subset(str, i + 1, ans + str.charAt(i));
        subset(str, i + 1, ans);

    }

    public static void changeArr(int arr[], int i, int val) {
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];

        changeArr(arr, 0, 1);
        printArr(arr);
        String str = "abc";
        subset(str, 0, "");
    }

}
