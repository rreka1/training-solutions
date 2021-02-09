package collectionslist.collectionsarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        if (lotteryType >= ballCount) {
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        }
        List<Integer> ballPool = new ArrayList<>();
        for (int i = 1; i <= ballCount; i++) {
            ballPool.add(i);
        }
        Collections.shuffle(ballPool);
        List<Integer> winningNumbers = new ArrayList<>(lotteryType);
        winningNumbers = ballPool.subList(0, lotteryType);
        Collections.sort(winningNumbers);
        return winningNumbers;
    }
}
