//package KeepTheChange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        List<Integer> result = new ArrayList<>();
        List<Integer> sorted = new ArrayList<>(coins);
        Collections.sort(sorted, Collections.reverseOrder());
        for (int coin : sorted) {
            while (amount >= coin) {
                amount -= coin;
                result.add(coin);
            }
        }
        return result;
    }
}
