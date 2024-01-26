/* Give javacode to print all the factor of a given value? */

public class try17 {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 1; i<=n; i++){
            if (n%i==0){
                System.out.println(i);
            }
        }
    }
}
