import java.util.Random;

public class DiceLogic {
    public static void main(String[] args) {

        Random myRandom = new Random();
        int finalRandom = 1 + myRandom.nextInt(6);
        System.out.println(finalRandom);

    }
}
