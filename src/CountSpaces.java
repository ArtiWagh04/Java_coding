public class CountSpaces {
    public static void main(String[] args) {
        String str = "   count  spaces in string ";
        int spaces = 0;
        for(char ch: str.toCharArray()){
            if(ch==' '){
                spaces++;
            }

        }
        System.out.println(spaces);



    }
}
