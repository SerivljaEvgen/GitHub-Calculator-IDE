package app;

public class Main {
    static int a = 8;
    static int b = 2;

    public static void main(String[] args) {
        System.out.println("My app for Users!");
        System.out.println("Version 1.0");
        int c = add(a, b);
        System.out.println(c);
        int d = multiply(a, b);
        System.out.println(d);
        int e = sub(a, b);
        System.out.println(e);
        double f = div(a, b);
        System.out.println(f);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }

    private static double div(int a, int b) {
        return (double) a / b;
    }
}
