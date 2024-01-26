/* Give Javacode to calculate factorial of given number using while
 * and do while loops ?
 */

public class Q40 {
    public static void main(String[] args) {


        /* 
        System.out.println("While Loop");
        System.out.println("------------");
        System.out.println();

        int n = 5;
        int f = 1;
        int i = 1;
        while(i<=n){
            f = f*i;
            i++;
        }
        System.out.println("Factorial "+f);
        */

        System.out.println("Do While Loop");
        System.out.println("------------");
        System.out.println();


        int n = 5;
        int f = 1;
        int i = 1;
        do{
            f = f*i;
            i++;
        }while(i<=n);
        System.out.println("Factorial "+f);
        
    }
}
