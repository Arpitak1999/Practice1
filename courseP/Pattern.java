public class Pattern {
    public static void main(String[] args) {

        /*
         * below tringle is
         * 1
         * 12
         * 123
         * 1234
         * 12345
         * 123456
         * 1234567
         */
        // for (int i = 1; i <= 7; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // square
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // System.out.print("*");
        // }
        // System.err.println();
        // }
        // tringle
        /*
        *****
        ****
        ***
        **
        *
        */
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5 - i + 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // triangle up
        /*
        *
        **
        ***
        ****
        *****
         */
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // up triangle with increasing count
        /*
         * 1
         * 23
         * 456
         * 78910
         * 1112131415
         */
        // int n = 1;
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.err.print(n++);
        // }
        // System.out.println();
        // }

        // down triangle with increaing count
        /*
         * 1 2 3 4 5
         * 6 7 8 9
         * 10 11 12
         * 13 14
         * 15
         */
        // int n = 1;
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5 - i + 1; j++) {
        // System.out.print(" " + n++);
        // }
        // System.out.println();
        // }
        // triangle
        /*
         * 12345
         * 1234
         * 123
         * 12
         * 1
         */
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5 - i + 1; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
                if (i == j) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
