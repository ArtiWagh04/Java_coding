package Array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Missing {
    public static void main(String[] args) {
        int arr[] = {1,2,5,7,9,8,10};
        // Implementation for finding missing elements
        HashSet<Integer> set = new HashSet<>();

        for(int i: arr){
            set.add(i);
        }

        for(int i=1; i<=10; i++){
            if(!set.contains(i)){
                System.out.println("Missing number: " + i);
            }
        }

    }
}

