/*
 * Give a javacode to asume any persontage and display grade based on following createria. Use if....else if ladder ?
 */


public class try36{
    public static void main(String[] args) {
        float per = 75.5f;

        if (per >= 80 && per <= 100){
            System.out.println("Grade A");
        }
        else if (per >= 60 && per <= 79.99){
            System.out.println("Grade B");
        }
        else if (per >= 40 && per <= 59.99){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Grade D");
        }
    }
}