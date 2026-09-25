package Array;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1,2,3,-5,-7,1,2,2,7};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        int majorityKey =0;
        int majorityValue =0;

        for(int i=0; i<arr.length; i++){
            if(map.get(arr[i]) > majorityValue){
                majorityKey = arr[i];
                majorityValue = map.get(arr[i]);

            }
        }
        System.out.println(majorityKey);
    }
}
