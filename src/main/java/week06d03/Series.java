package week06d03;

import java.util.List;

public class Series {

    /*public SeriesType calculateSeriesType(List<Integer> numbers) {
        checkSize(numbers);
        SeriesType type = numbers.get(0) < numbers.get(1) ? SeriesType.INC : SeriesType.DEC;
        for (int i = 2; i < numbers.size(); i++) {
            if ((numbers.get(i - 1) < numbers.get(i) && type == SeriesType.DEC) ||
                    (numbers.get(i - 1) > numbers.get(i) && type == SeriesType.INC)) {
                return SeriesType.RAND;
            }
        }
        return type;
    }*/

    public SeriesType calculateSeriesType(List<Integer> numbers) {
        checkSize(numbers);
        SeriesType type = isInc(numbers, 1) ? SeriesType.INC : SeriesType.DEC;
        for (int i = 2; i < numbers.size(); i++) {
            if (isRandom(numbers, i, type)) {
                return SeriesType.RAND;
            }
        }
        return type;
    }

    private boolean isRandom(List<Integer> numbers, int index, SeriesType type) {
        return (isInc(numbers, index) && type == SeriesType.DEC) ||
                (!isInc(numbers, index) && type == SeriesType.INC);
    }

    private boolean isInc(List<Integer> numbers, int index) {
        return numbers.get(index - 1) < numbers.get(index);
    }

    private void checkSize(List<Integer> numbers) {
        if (numbers == null || numbers.size() < 2) {
            throw new IllegalArgumentException("Size can not be lower than 2!");
        }
    }
}
