/* Give java code to store 5 roll numbers and and the names using 
 * Arrays and display in proper formate ?
 */

public class Q52 {
    public static void main(String[] args) {
        String[] name = {"Student 1", "Student 2", "Student 3", "Student 4", "Student 5",};
        String[] rollno = {"Roll Number 1", "Roll Number 2", "Roll Number 3", "Roll Number 4", "Roll Number 5",};

        for(int i = 0; i<=name.length; i++){
            System.out.println("Name = "+name[i]+" "+rollno[i]);
        }
    }
}
