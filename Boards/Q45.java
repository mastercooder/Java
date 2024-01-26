/* Give Javacode to print all the factors of a given value ? */

public class Q45 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i<=10; i++){
            if (n%i==0){
                System.out.println(i);
            }
        }
    }
}
