package fizzbuzz;

import static org.hamcrest.Matchers.is;

import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testOne() {
        final int n = 1;
        final String value = "1";
        assertNIsConvertedTo(n, value);
    }

    @Test
    public void testTwo() {
        assertNIsConvertedTo(2, "2");
    }

    @Test
    public void testThree() {
        assertNIsConvertedTo(3, "Fizz");
    }

    @Test
    public void testFive() {
        assertNIsConvertedTo(5, "Buzz");
    }

    @Test
    public void testSix() {
        assertNIsConvertedTo(6, "Fizz");
    }

    @Test
    public void testFifteen() {
        assertNIsConvertedTo(15, "FizzBuzz");
    }

    private void assertNIsConvertedTo(final int n, final String value) {
        String result = FizzBuzz.buzz(n);
        assertThat(result, is(value));
    }
}
