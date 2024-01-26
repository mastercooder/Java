/* Give Javacode to declare a string arrays having three names of
 * car manufacturing companies and display in number of values in a
 * cars variable
 */

public class Q49 {
    public static void main(String[] args) {
        String[] cars = {"BMW", "Lamborgini", "Mastang"};

        for (int i = 0; i<cars.length; i++){
            System.out.println(cars[i]);
        }
    }
}
