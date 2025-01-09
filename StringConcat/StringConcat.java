public class StringConcat {
    public static String concat(String s1, String s2) {
        if(null == s1) return s2;
        else if(null == s2) return s1;
        else return s1 + s2;
    }
}
