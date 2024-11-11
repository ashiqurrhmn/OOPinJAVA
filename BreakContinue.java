public class BreakContinue {
    public static void main(String[] args) {
        for(int i = 1; i<=6; i++){
            if(i == 3){
                System.out.println("Break at " +i);
                break;
            }
            System.out.println("i = "+ i);
        }
        for(int j = 1; j<=6; j++){
            if(j == 3){
                System.out.println("Continue at "+j);
                continue;
            }
            System.out.println("j = "+j);
        }
    }
}