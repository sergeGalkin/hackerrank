package interview_preparation_kit.warm_up;

import java.util.*;

public class SalesByMatch {

        // Complete the sockMerchant function below.
        static int sockMerchant(int n, int[] ar) {
            int amount = 0;
            Set<Integer> pairs = new HashSet<>();

            for (int j : ar) {
                if (pairs.contains(j)) {
                    amount++;
                    pairs.remove(j);
                } else {
                    pairs.add(j);
                }
            }
            return amount;
        }
}
