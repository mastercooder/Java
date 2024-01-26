import java.util.Scanner;
public class scannerfunction {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            System.out.println("Your name is "+name+" and age is "+age);
        }
        catch(Exception e){
            String name = "Tejesh";
            int age = 18;
            System.out.println("Your name is "+name+" and age is "+age);
        }

    }
}
