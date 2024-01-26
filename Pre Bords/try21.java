/* Give javacode to store the name of four car manufacturing and display
 * each name in saprate lines?
 */

public class try21 {
    public static void main(String[] args) {
        String [] cars = {"Volvo", "BMW", "Ford", "Mountain"};

        int len = cars.length;

        for (int i = 0; i<=len; i++){
            System.out.println(cars[i]);
        }
    }
}
