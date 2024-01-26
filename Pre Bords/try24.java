/* Define a java method which declare two integer variable & display the gratest? */

public class try24{
    class graterint{
        static void gratest(){
            int a = 5;
            int b = 10;

            if (a>b){
                System.out.println("First number is gratest");
            }
            else{
                System.out.println("Second numebr is gratest");
            }
        }
        public static void main(String[] args) {
            gratest();
        }
    }
}