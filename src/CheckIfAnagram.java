import java.util.HashMap;
public class CheckIfAnagram {
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "abb";
        if(str1.length() != str2.length()) {
            System.out.println("Not an anagram- length not same");
            return;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: str1.toLowerCase().toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
            for (char ch : str2.toLowerCase().toCharArray()) {
                if(!map.containsKey(ch)){
                    System.out.println("not an anagram! - char not present");
                    return;
                }
                map.put(ch, map.get(ch) -1);
            }
        for(char ch: map.keySet()){
            if(map.get(ch)!=0){
                System.out.println("Not an anagram - mismatch in number of key");
                return;
            }}
        System.out.println("Anagram");
    }
}