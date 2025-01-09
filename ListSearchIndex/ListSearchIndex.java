package ListSearchIndex;

import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if(null == list || list.isEmpty()) return null;
        List<Integer> indexes = ListSearchIndex.findAllIndexes(list, value);
        if(indexes.isEmpty()) return null;
        return indexes.get(indexes.size() - 1);
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if(null == list || list.isEmpty()) return null;
        List<Integer> indexes = ListSearchIndex.findAllIndexes(list, value);
        if(indexes.isEmpty()) return null;
        return indexes.get(0);
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        if(null == list || list.isEmpty()) return new ArrayList<>();
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (value.equals(list.get(i))) {
                indexList.add(i);
            }
        }
        return indexList;
    }
}
