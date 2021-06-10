package lambdastreams.baseoperations;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Numbers {

    private final List<Integer> numbers;

    public Numbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Optional<Integer> min() {
        return numbers.stream().min(Comparator.naturalOrder());
    }

    public long sum() {
        return numbers.stream().reduce(0, (a, b) -> a + b);
    }

    public boolean isAllPositive() {
        return numbers.stream().allMatch(n -> n > 0);
    }

    public Set<Integer> getDistinctElements() {
        return numbers.stream().collect(Collectors.toSet());
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
