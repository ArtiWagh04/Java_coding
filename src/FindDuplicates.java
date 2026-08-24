import java.util.HashMap;

public class FindDuplicates {
    public static void main(String[] args) {

        String str = " finding duplicate chars in string";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch: str.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0) + 1);
        }

        for(char ch: map.keySet()){
            int count = map.get(ch);
            if(count >1){
                System.out.println("Duplicate character: " + ch + " Count: " + count);
            }
        }



    }
}
