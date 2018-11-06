package igroup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void check_WithNumberDivisibleByThree_ReturnsFizz(int number) {
        // when
        String result = fizzBuzz.check(number);

        // then
        assertThat(result).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    void check_WithNumberDivisibleByFive_ReturnsBuzz(int number) {
        // when
        String result = fizzBuzz.check(number);

        // then
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void check_WithNumberNotDivisibleByFive_ReturnsNumber() {
        // when
        String result = fizzBuzz.check(4);

        // then
        assertThat(result).isEqualTo("4");
    }

    @Test
    void check_WithNumberDivisibleByThreeAndFive_ReturnsFizzBuzz() {
        // when
        String result = fizzBuzz.check(15);

        // then
        assertThat(result).isEqualTo("FizzBuzz");
    }
}
