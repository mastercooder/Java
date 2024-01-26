/* Give javacode to store 10 values in a single variable & display it. */

public class try43 {
    public static void main(String[] args) {
        String [] trys = {"Try1", "Try2", "Try3", "Try4"};
        System.out.println();
        int display = trys.length;
        for (int i = 1; i<=display; i++){
            System.out.println(trys[0]);
        }
    }
}
