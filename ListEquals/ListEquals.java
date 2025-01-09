package ListEquals;

import java.util.List;

public class ListEquals {
    public static boolean areListsEqual(List<String> list1, List<String> list2) {
        if (null == list1 && null == list2) return true;
        else if (null == list1 || null == list2) return false;
        return list1.equals(list2);
    }
}
