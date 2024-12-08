import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        System.out.println(8);
        System.out.println(90 - 1);
        System.out.println(10 * 2);
        System.out.println(30 / 6);
        System.out.println(9 + 10); //it is a mathematical equation
        System.out.println("10+40");//is text


        String name = "India";
        int population = 13265200;
        float populationDensity = 393.0f;
        double GDP = 2.454;
        char currency = 'R';
        boolean isSecular = true;
//implicite conversion
        int radius = 400;
        double newRadius = radius;
        System.out.println(newRadius);

        //explicite conviersion
        double diameter = 3.78;
        int newDiameter = (int) diameter;
        System.out.println(newDiameter);

        String country;
        char curncy;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter country name:");
        country = scanner.next();//print only a string till  it reaches space
        country = scanner.nextLine();//for print whole statement we use nextLine method
        System.out.println("Your country name is " + country);

        System.out.print("enter currency:");
        curncy = scanner.next().charAt(0);
        System.out.println("currency name:" + curncy);

//arithmatic
        int result = 3 + 1 - 7 * 5 % 3 / 2;
        int result1 = 3 * 10 - 2 % 5 / 2;
        int result2 = 3 * (10 - 2) % 5 / 2;
        System.out.println(result + "result");
        System.out.println(result1 + "result1");
        System.out.println(result2 + "result2");
//relational
        int x = 3;
        int y = 4;
        int z = 4;

//     //greater than equal to
        boolean r1 = x > y; //false
        boolean r2 = y >= x; //true

//        //less than equal
        boolean r3 = x < y; //true
        boolean r4 = y <= x;//false
        //is equal to
        boolean r5 = y == z;//true
        boolean r6 = x != z;//true

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        //assignment operator

        int income = 30000;
        int bonus = 10000;

        income = income + bonus;
        income += bonus;
        System.out.println(income);
        int x3 = 10;
        int y3 = 2;
        x3 *= y3;
        x3 /= y3;
        x3 %= y3;
        System.out.println(x3);
        //increment amd decrement
        int age = 10;
        int newAge = age++;
        newAge = age;
        age = age + 1;
        System.out.println(age);
        System.out.println(newAge);

        int n = 8;
        System.out.println(n++ - ++n + --n);//8 - 10 + 9=7
//logical oprator !,&&,||
        System.out.println(true);
        System.out.println(!true);
        System.out.println(true && false);
        System.out.println(true || false);

        //if else
        boolean isGreen = true;
        String msg;
        if (isGreen) {
            msg = "You are allowed to move";
        } else {
            msg = "Please stop!";
        }
        System.out.println(msg);
//        //ternary
        String msg2 = isGreen ? "You are allowed to move" : "Please stop!";
        System.out.println(msg2);
        int g = 0;
        char g1 = '9';
        System.out.println(g + g1);

        //while loop
        //factorial of 5
        int num = 5;
        long factorail = 1;
        while (num > 0) {
            factorail = factorail * num;
            num--;
            // System.out.println("factorail is::"+factorail);
        }
        System.out.println("factorail is::" + factorail);

        //do while

        Scanner scanner1 = new Scanner(System.in);
        double num1 = 0;
        double sum = 0;
        do {
            System.out.println("Enter the number::");
            num1 = scanner1.nextDouble();
            sum += num1;
        } while (num1 != 0);
        System.out.println("Sum of number:" + sum);

        //array
        //index 0 is index of 20 1 ->19 2->48
        int[] arr = {20, 19, 48};
        arr[2] = 50;// update element of array
        System.out.println(arr[2]);
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

            //sum of array
            int[] arr1 = {20, 19, 48};
            int sum1 = 0;
            for (int k = 0; k < arr1.length; k++) {
                sum1 += arr[k];
                System.out.println(arr[k]);
            }
            System.out.println("Sum of array :" + sum1);
            //second way to declare an array
            float[] arr2 = new float[3];
            arr2[0] = 33.5f;
            arr2[1] = 32.2f;
            arr2[2] = 11.2f;
            float sum12 = 0;
            for (int l = 0; l < arr2.length; l++) {
                System.out.println(arr2[l]);
            }

            //for each loop
            for (float num2 : arr2) {
                sum12 += num2;
                System.out.println(num2);
            }
            System.out.println("sum of float: " + sum12);

            /* FOR EACH Loop Practice */

// Define a double array and use For Each loop to find the sum of all the numbers stored in the array.
            double[] arr3 = {5.4, 44.1, 12.0};
            double sum2 = 0;

            for (double num2 : arr3) {
                sum2 += num2;
            }
            System.out.println("Sum of array:" + sum2);
            //   2D array
            int[] arr11 = {1, 3, 5};
            int[] arr12 = {2, 5, 8};//remove these lines whenwe write in one
            int[] arr13 = {3, 9, 10};
//int [][] my2Darr={arr11,arr12,arr13};

            int[][] my2Darr = {{1, 3, 5}, {2, 5, 8}, {3, 9, 10}};
            int sum3 = 0;
            System.out.println(my2Darr[2][2]);
            for (int row = 0; row < my2Darr.length; row++) {

                for (int col = 0; col < my2Darr[row].length; col++) {
                    sum = sum + my2Darr[row][col];
                    System.out.print(my2Darr[row][col] + " ");

                }
                System.out.println();
            }
            System.out.println("Sum is :" + sum3);

            String str = "you are geek";
            System.out.println(str.charAt(8));

            //sum of two number
            int sum4 = sumOfNum(23, 12);
            System.out.println("Sum of nmbers :" + sum4);
        }
        int x2 = 5;
        if (x2 != 0) {
            int y2 = x2 + 1;
        }
        System.out.println(x2);
        try {
            int x1 = 0 + 24;
            int y1 = 48 / x;
            System.out.println(y1);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("propgra");
            String a2 = "Hello";
            a2 = a2 + "my na";
            a2 = a2.concat("t");
            System.out.println(a2);
            int[] arr4;
            arr4 = new int[]{21, 50, 10};
            System.out.println(arr4[1]);

        }
    }

    private static int sumOfNum(int c, int d) {
        int sum6 = c + d;
        return sum6;
    }

}



