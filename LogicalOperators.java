public class LogicalOperators {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("a < b && b < c: " + (a < b && b < c));
        System.out.println("a > b || b < c: " + (a > b || b < c));
        System.out.println("!(a == b): " + !(a == b));
    }
}

