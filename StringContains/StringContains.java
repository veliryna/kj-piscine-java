public class StringContains {
    public static boolean isStringContainedIn(String subString, String s) {
        if(null == subString || null == s) return false;
        else{
            return s.contains(subString);
        }
    }
}
