public class practice2 {
    public static void main(String[] args) {
        int n = 54;
        int up = n%10;
        int tp = n/10;

        int s = (up * up * up) + (tp * tp * tp);
        System.out.println(s);
    }
}
