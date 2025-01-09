import java.util.Arrays;
import java.util.Comparator;

public class SortArgs {
    public static void sort(String[] args) {
        StringBuilder res = new StringBuilder();
        Arrays.sort(args, Comparator.comparing(Integer::valueOf));
        for(String a : args){
            res.append(a).append(" ");
        }
        if(res.length() > 1) res = new StringBuilder(res.substring(0, res.length() - 1));
        res.append("\n");
        System.out.print(res);
    }
}
