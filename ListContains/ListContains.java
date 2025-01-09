package ListContains;

import java.util.List;

public class ListContains {
    public static boolean containsValue(List<Integer> list, Integer value) {
        if (list.isEmpty()) return false;
        return list.contains(value);
    }
}
