/* Give javacode to check if the number is prime or not ? */

public class try19 {
    public static void main(String[] args) {
        int n = 4;
        int nf = 0;

        for (int i = 1; i<=n; i++){
            if (n%i==0){
                nf = nf+1;
            }
        }
        if (nf==2){
            System.out.println("It is a Prime Number");
        }
        else{
            System.out.println("It is not a Prime number");
        }
    }
}
