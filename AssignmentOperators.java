public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        System.out.println("\nAssignment Operators:");
        b += a;
        System.out.println("c += a: " + b);
        b -= a;
        System.out.println("c -= a: " + b);
        b *= a;
        System.out.println("c *= a: " + b);
        b /= a;
        System.out.println("c /= a: " + b);
        b %= a;
        System.out.println("c %= a: " + b);
    }
}