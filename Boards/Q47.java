/* Give Javacode to check if the number is Prime or not ? */

import java.util.Scanner;
public class Q47 {
    public static void main(String[] args) {

        int nf = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int n = scanner.nextInt();

            for (int i = 1; i<=n; i++){
                if (n%i==0){
                    nf = nf+1;
                }
            }
            if (nf==2){
                System.out.println(n+" is a prime number");
            }
            else{
                System.out.println(n+" is not a prime number");
            }
        }
        
    }
}
