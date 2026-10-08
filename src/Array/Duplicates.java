package Array;

import java.util.HashMap;

public class Duplicates {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,5,6,4,5,8,90,-1,-2,-2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println("Duplicate elements are : ");
        for(int i: map.keySet()) {
            if (map.get(i) > 1) {
                System.out.println(i + " : " + map.get(i));
            }
        }

    }
}
