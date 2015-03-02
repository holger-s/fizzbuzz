package fizzbuzz;

public class FizzBuzz {
    public static String buzz(final int n) {
        final boolean isDivisibleByThree = n % 3 == 0;
        final boolean isDivisibleByFive = n % 5 == 0;

        StringBuilder s = new StringBuilder();
        if (isDivisibleByThree) {
            s.append("Fizz");
        }

        if (isDivisibleByFive) {
            s.append("Buzz");
        }

        return s.length() == 0 ? String.valueOf(n) : s.toString();
    }
}
