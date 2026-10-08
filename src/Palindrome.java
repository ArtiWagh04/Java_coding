public class Palindrome
//time O(n), space - O(1)
{
    public static void main(String[] args) {
        String str = "artitra";
        int left = 0;
        int right = str.length() - 1;

//        while(left<right){
//            if(str.charAt(left) != str.charAt(right)){
//                System.out.println("Not a palindrome");
//                return;
//            }
//            left++;
//            right--;
//        }
        //System.out.println("The string is a palindrome");
        for(int i=0, j=str.length()-1; i<str.length()/2 && j>str.length()/2; i++, j--){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("Not a palindrome");
                return;

            }

        }
        System.out.println("The string is a palindrome");
    }


}
