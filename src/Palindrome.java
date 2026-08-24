public class Palindrome
//time O(n), space - O(1)
{
    public static void main(String[] args) {
        String str = "artitria";
        int left = 0;
        int right = str.length() - 1;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                System.out.println("Not a palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("The string is a palindrome");

    }


}
