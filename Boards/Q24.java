/* Give Javacode to assume two number values & arithmic oprator to
 * display the result based on the arathmic operator ? (use Switch)
 */

public class Q24 {
    public static void main(String[] args) {
        int a = 20; 
        int b = 10;
        char opr = '+';

        switch(opr){
            case '+':
            System.out.println("Addition "+ (a+b));    
            break;
            case '-':
            System.out.println("Subtraction "+(a-b));
            break;
            case '*':
            System.out.println("Multiplaicaion "+(a*b));
            break;
            case '/':
            System.out.println("Division "+(a/b));
            break;
            default:
            System.out.println(opr+" incalid Arathmatic Oprator");
        }
    }
}
