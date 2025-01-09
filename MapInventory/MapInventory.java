//package MapInventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapInventory {
    public static int getProductPrice(Map<String, Integer> inventory, String productId) {
        if (!inventory.containsKey(productId)) {
            return -1;
        }
        return inventory.get(productId);
    }

    public static List<String> getProductIdsByPrice(Map<String, Integer> inventory, int price) {
        List<String> res = new ArrayList<>();
        for (String productId : inventory.keySet()) {
            if (inventory.get(productId) == price) {
                res.add(productId);
            }
        }
        return res;
    }
}
