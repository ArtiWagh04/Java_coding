public class LengthOfString {
//space and time - O(n)
    public static void main(String[] args) {
        String str = "length counting";
        char arr[] = str.toCharArray();
        int length = 0;
        for(char ch: arr){
            length++;
        }
        System.out.println(length);
    }
}
