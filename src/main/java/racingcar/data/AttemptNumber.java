package racingcar.data;

public class AttemptNumber {
    private final int number;
    private static final String NOT_A_POSITIVE_INTEGER = "AttemptNumber should be a positive integer.";

    public AttemptNumber(int number) {
        this.number = number;
        validateAttemptNumber(number);
    }

    public static void validateAttemptNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException(NOT_A_POSITIVE_INTEGER);
        }
    }
}
