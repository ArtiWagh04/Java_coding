//import java.net.StandardSocketOptions;
//space and time - O(n)
public class ReverseWordInString {

    public static void main(String args[]){
        String str = "arti ashish gaikwad";

        StringBuilder reverse = new StringBuilder();
        String arr[] = str.split(" ");

        for(String word: arr){

            for(int j=word.length()-1; j>=0; j--){
                reverse.append(word.charAt(j));
            }
            reverse.append(" ");
        }
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reverse);

    }

}
