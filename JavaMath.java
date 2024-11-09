public class JavaMath{
    public static void main(String[] args) {

        System.out.println("Maximum between 2 and 5 is " +Math.max(2, 5));
        System.out.println("Minimum between 2 and 5 is " +Math.min(2, 5));
        System.out.println("Square root of  between 2 is " +String.format("%.2f", Math.sqrt(2)));
        System.out.println("Absolute value of -5.5 is " +Math.abs(-5.5));
        System.out.println("Random value between 0 to 100 is " +(int)(Math.random() * 101));
    }
}
