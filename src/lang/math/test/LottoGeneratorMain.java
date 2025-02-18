package lang.math.test;

import java.util.Random;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lotto = new LottoGenerator();
        int[] num = lotto.getNum();
        System.out.print("로또 번호: ");
        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}
