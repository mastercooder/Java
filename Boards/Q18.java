/* Give Javacode to assume two values in two diffrent variable and a
 * variable to store a operater +,-,/,* ? Display the result based on
 * the operator assumed by the user using if...else if ladder ?
 */
public class Q18 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        char opr = '+';

        if (opr=='+'){
            System.out.println("Addition "+ (a+b));
        }
        else if (opr=='-'){
            System.out.println("Subtraction "+ (a-b));
        }
        else if (opr=='*'){
            System.out.println("Multiplicaion "+ (a*b));
        }
        else if (opr=='/'){
            System.out.println("Divivon "+ (a/b));
        }
        else{
            System.out.println("Invalid Operator");
        }


    }
}
