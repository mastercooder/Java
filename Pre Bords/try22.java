/* Give javacode to store 10 values in a single variable & display it. */

public class try22 {
    public static void main(String[] args) {
        String [] values = {"Value0", "Value1", "Value2", "Value3", "Value4", "Value5", "Value6", "Value7","Value8", "Value9", "Value10"};

        System.out.println();
        int display = values.length;
        for(int i = 0; i<=display; i++){
            System.out.println(values[i]);
        }
        System.out.println();
    }
}
