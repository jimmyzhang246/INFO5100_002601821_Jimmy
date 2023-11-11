import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        testPattern("\\d", "Jimmy123", "Jimmy");
        testPattern("\\D", "Jimmy", "123");
        testPattern("\\s", "Jimmy 100", "Jimmy100");
        testPattern("\\S", "Jimmy", "   ");
        testPattern("\\w", "Jimmy_123", "!@#$");
    }

    private static void testPattern(String pattern, String positiveCase, String negativeCase) {
        System.out.println("Pattern: " + pattern);
        System.out.println("Positive case: " + positiveCase + " | " + matches(pattern, positiveCase));
        System.out.println("Negative case: " + negativeCase + " | " + matches(pattern, negativeCase));
        System.out.println("-------------------------------");
    }

    private static boolean matches(String pattern, String subject) {
        return Pattern.compile(pattern).matcher(subject).find();
    }
}
