import java.util.Scanner;
public class try14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter taxable income: ");
        double income = scanner.nextDouble();

        double tax = 0;

        if (income <= 200000) {
            tax = 0;
        } 
        else if (income <= 500000) {
            tax = (income - 200000) * 0.1;
        } 
        else {
            tax = 30000 + (income - 500000) * 0.2;
        }

        System.out.println("Income tax: " + tax);
    }
}


