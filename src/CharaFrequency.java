import java.util.HashMap;

public class CharaFrequency {

    public static void main(String[] args) {

        String str = "Character frequency count";

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.toLowerCase().charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);
    }



}
