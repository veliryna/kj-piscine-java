package Wedding;

import java.util.*;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        Map<String, String> couples = new HashMap<String, String>();
        int minsize = Math.min(first.size(), second.size());
        List<String> f = new ArrayList<>(first);
        List<String> s = new ArrayList<>(second);
        for (int i = 0; i < minsize; i++) {
            couples.put(f.get(i), s.get(i));
        }
        return couples;
    }
}
