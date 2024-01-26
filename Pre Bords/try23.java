/* Give javacode to store 5 roll numbers and the names using Arreys and dispaly in proper formate */

public class try23{
    public static void main(String[] args) {
        String [] roll = {"1", "2", "3", "4", "5"};
        String [] name = {"Student 1","Student 2","Student 3","Student 4","Student 5",};

        for (int i = 0; i<=name.length; i++){
            System.out.print("Roll No: " +roll[i]);
            System.out.println("  Name = " +name[i]);
        }
    }
}