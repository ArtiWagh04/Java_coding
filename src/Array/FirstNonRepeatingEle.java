package Array;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingEle {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 2, 3 };
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
        }

        System.out.println("First non-repeating element is: ");

    for(Map.Entry<Integer, Integer> entry: map.entrySet()   ){
        if(entry.getValue() == 1){
            System.out.println(entry.getKey());
            break;
        }
    }
    }

}
