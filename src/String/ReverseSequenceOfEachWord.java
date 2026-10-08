package String;

public class ReverseSequenceOfEachWord {
    public static void main(String[] args) {
        String str = "Hello World from Java";
        String arr[] = str.split(" ");

        StringBuilder reverse = new StringBuilder();
        for(int i=arr.length-1; i>=0; i--){
            reverse.append(arr[i]);
            reverse.append(" ");

        }
        System.out.println(reverse.toString().trim());
    }
}
