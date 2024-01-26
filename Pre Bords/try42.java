/* Give javacode to calculate first five even number and odd number using single for loop*/

public class try42 {
    public static void main(String[] args) {
        int n = 4;
        int odd = 0;
        int even = 0;

        for (int i = 1; i<=n; i++){
            if (i%2==0){
                even = even+i;
            }
            else{
               odd = odd+i;
            }
        }
        System.out.println("Even Number = "+even);
        System.out.println("Odd Number = "+odd);
    } 
}




