/* Define a user defined methon to print all the factor of a given number? */

public class try27{
    class numberfactor{
        static void factor(){
            int n = 5;
            int f = 1;

            for (int i = 1; i<=n; i++){
                f = f*i;
            }
            System.out.println("The Factor of the given number = " +f);
        }
        public static void main(String[] args) {
            factor();
        }
    }
}