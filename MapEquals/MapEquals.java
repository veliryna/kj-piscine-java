//package MapEquals;

import java.util.Map;

public class MapEquals {
    public static boolean areMapsEqual(Map<String, Integer> map1, Map<String, Integer> map2) {
        if(null == map1 && null == map2) return true;
        if(null == map1 || null == map2) return false;
        return map1.equals(map2);
    }
}
