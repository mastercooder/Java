/* Give Javacode to calculte first Five even number and odd number 
 * using single for loop ?  
 */

public class Q37 {
    public static void main(String[] args) {
        int evennumber = 0;
        int oddnumber = 0;

        for (int i = 1; i<=10; i++){
            if (i%2==0){
                evennumber = evennumber+i;
            }
            else{
                oddnumber = oddnumber+i;
            }
        }
        System.out.println("Sum of First five even number are "+evennumber);
        System.out.println("Sum of First Five odd number are "+oddnumber);
    }
}
