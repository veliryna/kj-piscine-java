public class RegexMatch {
    public static boolean containsOnlyAlpha(String s) {
        return s.matches("[a-zA-Z]+");
    }

    public static boolean startWithLetterAndEndWithNumber(String s) {
        return s.matches("^[A-Za-z].*[0-9]$");
    }

    public static boolean containsAtLeast3SuccessiveA(String s) {
        return s.matches(".*A{3,}.*");
    }
}
