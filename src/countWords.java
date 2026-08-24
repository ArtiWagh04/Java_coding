public class countWords {
    public static void main(String[] args) {
        String str = " 3 count  words in a  string";

        String  arr[] = str.trim().replaceAll("\\s+", " ").split(" ");

        System.out.println("Number of words in the string: " + arr.length);


    }
}
