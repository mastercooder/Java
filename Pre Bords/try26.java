/* Define a method by the name check even odd to check if the given values is even or odd? */

public class try26{
    class evenoddchecker{
        static void checkevenodd(){
            int n = 5;

            if (n%2==0){
                System.out.println("It is an even number");
            }
            else{
                System.out.println("It is an odd number");
            }
        }
        public static void main(String[] args) {
            checkevenodd();
        }
    }
}