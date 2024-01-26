import javax.sound.sampled.SourceDataLine;
import java.util.Scanner;

/* Define a user defined method to print all the factors of a given number */

public class Q54 {
    static class Javaapplicaion{
        static void factors(){
            
            int n = 6;

            int nf = 0;

            for (int i= 1; i<=n; i++){
                if (n%i==0){
                    nf = nf+1;
                }    
            }
            System.out.println("The number of factor are "+nf);
        }
        
        public static void main(String[] args) {
            
            
            factors();

        }
    }
}
