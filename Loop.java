public class Loop {
    public static void main(String[] args) {

        System.out.print("For Loop: ");
        for (int i = 1; i <= 3; i++) {
            System.out.print(i);
            if (i < 3) {
                System.out.print(", ");
            }
        }

        System.out.print("\nWhile Loop: ");
        int j = 4;
        while (j <= 6) {
            System.out.print(j);
            if (j < 6) {
                System.out.print(", ");
            }
            j++;
        }

        System.out.print("\nDo-While Loop: ");
        int k = 7;
        do {
            System.out.print(k);
            if (k < 9) {
                System.out.print(", ");
            }
            k++;
        } while (k <= 9);
    }
}
