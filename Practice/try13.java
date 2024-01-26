public class try13 {
    public static void main(String[] args) {
        int num = 123; // Replace 123 with the three-digit number you want to calculate the sum of
        int t = (num / 100);
        int n = ((num % 100) / 10);
        int s = (num % 10);

        System.out.println(t);
        System.out.println(n);
        System.out.println(s);


        int sum = (t+n+s);

        System.out.println("---------------------------------");
        System.out.println("The sum of the digits is " + sum);

    }
}
