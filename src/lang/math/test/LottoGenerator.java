package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] num = new int[6];
    private int count;

    public int[] getNum(){
        while (count < 6) {
            int rand = random.nextInt(45) + 1;
            if (isUnique(rand)) {
                num[count] = rand;
                count++;
            }
        }
        return num;
    }

    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if (num[i] == number) {
                return false;
            }
        }
        return true;
    }
}
