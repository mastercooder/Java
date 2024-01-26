/* Give javacode to assume two number value & display arithmatic opetator to display teh result based on the arathmatic operator */

public class try4 {
    public static void main(String[] args) {
        int a = 20; 
        int b = 20;
        char opr = '+';

        switch (opr){
            case '+':
                System.out.println("Addition = " + (a+b));
                break;

            case '-':
                System.out.println("Subtraction = " + (a-b));
                break;

            case '*':
                System.out.println("Multiplication = " + (a*b));
                break;

            case '/':
                System.out.println("Division = " + (a/b));
                break;

                default:
                System.out.println("Incorect operator ");
        }
    }
}
