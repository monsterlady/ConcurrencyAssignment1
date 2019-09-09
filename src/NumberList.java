import java.util.Random;

public class NumberList {
    private Random random = new Random();
    public static int [] numberList = new int[200000];

    public NumberList() {
        for (int i = 0; i < numberList.length; i++) {
            numberList[i] = random.nextInt(numberList.length);
        }
    }

    public int[] getNumberList() {
        return numberList;
    }

}