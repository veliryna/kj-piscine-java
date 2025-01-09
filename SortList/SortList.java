//package SortList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        if(null == list) return null;
        if(list.isEmpty()) return list;
        List<Integer> modifiableList = new ArrayList<>(list);
        modifiableList.sort(new IntComparator());
        return modifiableList;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        if(null == list) return null;
        if(list.isEmpty()) return list;
        List<Integer> modifiableList = new ArrayList<>(list);
        modifiableList.sort(new IntComparatorReverse());
        return modifiableList;
    }
}

class IntComparatorReverse implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 < o2 ? 1 : -1;
    }
}

class IntComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 < o2 ? -1 : 1;
    }
}