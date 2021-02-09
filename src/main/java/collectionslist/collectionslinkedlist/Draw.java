package collectionslist.collectionslinkedlist;

import java.util.*;

public class Draw {

    public Set<Integer> drawNumbers(int drawCount, int maxNumber) {
        if (drawCount >= maxNumber) {
            throw new IllegalArgumentException("drawCount must be less then " + maxNumber + "!");
        }
        List<Integer> numbers = new LinkedList<>();
        for (int i = 1; i <= maxNumber; i++) {
           numbers.add(i);
        }
        Collections.shuffle(numbers);
        return new TreeSet<>(numbers);
    }
}
