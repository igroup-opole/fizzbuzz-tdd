package igroup;

class FizzBuzz {
    String check(int number) {
        String result = "";

        if (isDividedByNumber(number, 3)) {
            result += "Fizz";
        }

        if (isDividedByNumber(number, 5)) {
            result += "Buzz";
        }

        return result.isEmpty() ? String.valueOf(number) : result;
    }

    private boolean isDividedByNumber(int number, int divider) {
        return number % divider == 0;
    }
}
