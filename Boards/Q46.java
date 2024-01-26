/* Give javacode to count the factor of given number */

import java.util.Scanner;
public class Q46 {
   public static void main(String[] args) {
        System.out.println("This is a Program to show the number of factor of given number");
        System.out.println("---------------------------------------------------------------");

        int nf = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the no ");
            double n = scanner.nextDouble();

      for (int i = 1; i<=n; i++){
               if (n%i==0){
                   nf = nf+1;
               }
      }
        }
        System.out.println("The number of factor are "+nf);
   } 
}
