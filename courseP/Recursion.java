public class Recursion {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printAsc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printAsc(n - 1);
        System.out.print(n + " ");
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = factorial(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static int sumOfN(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = sumOfN(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = factorial(n - 1);
        int fnm2 = factorial(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String args[]) {
        int n = 4;
        printDec(n);
        printAsc(n);
        System.out.println();
        System.out.println(factorial(n));
        System.out.println(sumOfN(n));
        System.out.println(fibonacci(n));
    }

}
