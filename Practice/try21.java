import java.util.Scanner;

public class try21 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            System.out.println("Enter the score: ");
            int score1 = scanner.nextInt();

            System.out.println("Enter the score: ");
            int score2 = scanner.nextInt();

            if (score1>score2){
                System.out.println("First team win's with "+(score1-score2)+" points. ");
            }
            else if (score1<score2)
                System.out.println(" Second teamwin's with "+(score2-score1)+" pints. ");
            
            else{
                System.out.println("There is a tie");
            }
        }
        catch(Exception e){
            System.out.println("Enter correct values");
        }

    }
}
