/* Give a method by the name display even which displays teh first five
 * even numbers ?
 */


public class Q53 {
    static class Javaapplicaion{
        static void displayeven(){
            int n = 5;

            if (n%2==0){
                System.out.println(n+" is a even number");
            }
            else{
                System.out.println(n+" is a odd number");
            }
        }
        public static void main(String[] args) {
            displayeven();
        }
    }
}
