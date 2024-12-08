public class Rectangle {
    public static void main(String[] args) {
        int length = 30;
        int breadth = 90;
        int area = length * breadth;

        System.out.println("Area of rectangle"+area);
        getPerimeter();
    }
            public static int getPerimeter() {
                int length = 30;
                int breadth = 90;
                int perimeter = 2 * (int) (length + breadth);
                System.out.println("Perimeter of rectangle"+perimeter);
                return perimeter;
            }
}
