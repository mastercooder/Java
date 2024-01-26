/* Give java code to count the factor of given number? */

public class try18 {
    public static void main(String[] args) {
        int n = 7;
        int nf = 7;

        for (int i = 1; i<=n; i++){
            if (n%i==0){
                nf = nf+1;
            }
            System.out.println("The number of Factor = " +nf);
        }
    }
}
