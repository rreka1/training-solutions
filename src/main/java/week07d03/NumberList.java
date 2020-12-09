package week07d03;

import java.util.List;

public class NumberList {

    public static boolean isIncreasing(List<Integer> numbers) {
        checkSize(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) > numbers.get(i)) {
                return false;
            }
        }
        return true;
    }

    private static void checkSize(List<Integer> numbers) {
        if (numbers == null || numbers.size() < 2) {
            throw new IllegalArgumentException("Size can not be lower than 2!");
        }
    }
}
