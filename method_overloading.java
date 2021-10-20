package classroom;

public class method_overloading {
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethodInt(5, 5);
        double myNum2 = plusMethodDouble(5.9, 3.44);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
