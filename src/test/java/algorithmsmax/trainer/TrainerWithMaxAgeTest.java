package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerWithMaxAgeTest {

    @Test
    void testMaxAge() {

        MaxAgeCalculator calc = new MaxAgeCalculator();
        Trainer trainer1 = new Trainer("John", 23);
        Trainer trainer2 = new Trainer("Jack", 56);
        Trainer trainer3 = new Trainer("Jane", 35);
        Trainer trainer4 = new Trainer("John", 70);
        Trainer trainer5 = new Trainer("Jack", 22);
        Trainer trainer6 = new Trainer("Jane", 20);
        List<Trainer> trainers = Arrays.asList(trainer1, trainer2, trainer3, trainer3, trainer4, trainer5, trainer6);

        assertEquals(70, calc.trainerWithMaxAge(trainers).getAge());
    }
}
