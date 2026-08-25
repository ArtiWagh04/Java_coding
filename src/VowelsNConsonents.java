public class VowelsNConsonents {
    public static void main(String[] args) {
        String str = " 1find number";

        int vowels = 0;
        int consonents = 0;

        String lStr = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = lStr.charAt(i);
    if(ch >= 'a' && ch<= 'z') {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vowels++;
        } else {
            consonents++;
        }

    }
        }
        System.out.println(vowels + " " + consonents);
    }
}
