package Array;

public class EvenNOdds {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        for(int num: arr){
            if(num%2 == 0){
                System.out.println("Even:" + num);
            }
            else{
                System.out.println("Odd:" + num);
            }
        }

    }
}
