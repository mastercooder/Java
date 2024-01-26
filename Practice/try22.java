import java.util.Scanner;
public class try22{
    public static void main(String[] args) {
        System.out.println("Welcome");
        System.out.println("---------");
        System.out.println();

        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter your Name");
            String name = scanner.nextLine();

            System.out.println("Your Age");
            int age = scanner.nextInt();

            if (age>=18){
                System.out.println();
                System.out.println("You are welcome in our webside");
                System.out.println("--------------------------------");
            }
        } 
        catch (Exception e) {
        System.out.println("Plese enter you name in words");
        }
    }
}