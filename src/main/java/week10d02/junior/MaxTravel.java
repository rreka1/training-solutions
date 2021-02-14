package week10d02.junior;

import java.util.List;

public class MaxTravel {

    public int getMaxIndex(List<Integer> numbers) {
        int[] counters = count(numbers);
        return max(counters);
    }

    private int[] count(List<Integer> numbers) {
        int[] counters = new int[30];
        for (int i : numbers) {
            counters[i]++;
        }
        return counters;
    }

    private int max(int[] counters) {
        int maxIndex = 0;
        for (int i = 0; i < counters.length; i++) {
            if (counters[maxIndex] < counters[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    /*public int getMaxIndex(List<Integer> numbers) {
        int[] counters = new int[30];
        for (int i : numbers) {
            counters[i]++;
        }
        int maxIndex = 0;
        for (int i = 0; i < counters.length; i++) {
            if (counters[maxIndex] < counters[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }*/
}
