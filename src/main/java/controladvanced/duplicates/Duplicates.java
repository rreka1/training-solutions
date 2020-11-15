package controladvanced.duplicates;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {

    public List<Integer> find(List<Integer> numbers) {
        List<Integer> numbersCopy = new ArrayList<>();
        List<Integer> duplicates = new ArrayList<>();
        numbersCopy.addAll(numbers);
        for(Integer number : numbersCopy) {
            if(numbersCopy.contains(number)) {
                duplicates.add(number);
            }
        }
        return duplicates;
    }
}
