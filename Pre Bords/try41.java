

/*
 * Give javacode to assume two numbers values & arithmaic operator to display the result based on the arathmic operator ?
 */

public class try41{
    public static void main(String[] args) {
        int a = 7;
        int b = 10;
        String opr = "/";

        switch (opr){
            case "+":
            System.out.println("Addition = "+(a+b));
            break;
            case "-":
            System.out.println("Subtraction = "+(a-b));
            break;
            case "*":
            System.out.println("Multiplicaion = "+(a*b));
            break;
            case "/":
            System.out.println("Division = "+(a/b));
            break;
            default:
            System.out.println("Invalid Operator");
        }
    }
}