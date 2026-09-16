import java.util.HashMap;
import java.util.Map;

public class FrequentElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 2, 2, 4, 2, 3, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int mostFrequent = arr[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Most frequent element: " + mostFrequent);
        System.out.println("Frequency: " + maxCount);
    }
}