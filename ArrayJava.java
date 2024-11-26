public class ArrayJava {
    public static void main(String[] args) {

        int[] oneDArray = {10, 20, 30, 40, 50};
        System.out.println("1D Array:");
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");
        }
        System.out.println("\n");

        int[][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("2D Array:");
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
