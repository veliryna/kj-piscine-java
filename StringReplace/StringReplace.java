public class StringReplace {
    public static <T> String replace(String s, T target, T replacement) {
        String t = String.valueOf(target);
        String r = String.valueOf(replacement);
        return s.replaceAll(t, r);
    }
}
