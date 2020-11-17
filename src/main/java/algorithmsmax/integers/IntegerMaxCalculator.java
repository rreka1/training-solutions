package algorithmsmax.integers;

import java.util.List;

public class IntegerMaxCalculator {

    public int max(List<Integer> integers) {
        int max = Integer.MIN_VALUE;
        for(Integer integer : integers) {
            if(integer > max) {
                max = integer;
            }
        }
        return max;
    }
}
