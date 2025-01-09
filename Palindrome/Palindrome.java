import java.util.Locale;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        if(null == s) return false;
        else{
            s = s.toLowerCase(Locale.ROOT);
            StringBuilder str = new StringBuilder(s);
            str.reverse();
            return s.equals(str.toString());
        }
    }
}
