/* Sure, here's a question on if-else-if ladder in Java:

Write a Java program that takes an integer as input and outputs the corresponding letter grade based on the following grading scale:

90-100: A
80-89: B
70-79: C
60-69: D
below 60: F
The program should display an error message if the input integer is negative or greater than 100. */

import java.net.PasswordAuthentication;
import java.util.Scanner;

import javax.swing.text.DefaultStyledDocument.ElementSpec;
public class try20 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter any integer value");
            int a = scanner.nextInt();

            if(a>=90 && a<=100){
                System.out.println("A");
            }
            else if (a>=80 && a<=89){
                System.out.println("B");
            }
            else if(a>=70 && a<=79){
                System.out.println("C");
            }
            else if(a>=60 && a<=69){
                System.out.println("D");
            }
            else if(a>=101 || a<=-1){
                System.out.println("Earror");
            }
            else{
                System.out.println("F");
            }
        }
        catch(Exception e){
            System.out.println("");
        }


        
    }
}
