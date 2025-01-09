//package WeddingComplex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeddingComplex {
    public static Map<String, String> createBestCouple(Map<String, List<String>> first, Map<String, List<String>> second) {
        Map<String, String> couples = new HashMap<>();
        Map<String, Integer> preferences = new HashMap<>();
        for (String name : second.keySet()) {
            preferences.put(name, 0);
        }
        List<String> freeMen = new ArrayList<>(first.keySet());
        while (!freeMen.isEmpty()) {
            String man = freeMen.get(0);
            List<String> manPreferences = first.get(man);
            Integer index = preferences.getOrDefault(man, 0);
            String woman = manPreferences.get(index);
            preferences.put(man, index + 1);
            if (!couples.containsKey(woman)) {
                couples.put(woman, man);
                freeMen.remove(0);
            } else {
                String currentPartner = couples.get(woman);
                List<String> womanPreferences = second.get(woman);
                if (womanPreferences.indexOf(man) < womanPreferences.indexOf(currentPartner)) {
                    couples.put(woman, man);
                    freeMen.remove(0);
                    freeMen.add(currentPartner);
                }
            }
        }

        Map<String, String> result = new HashMap<>();
        for (Map.Entry<String, String> entry : couples.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }
        return result;
    }



}
