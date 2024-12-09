public class GCD {
    public static int gcd(int a, int b) {
        // Base case: If b is 0, a is the GCD
        if (b == 0) {
            return a;
        } else {
            // Recursively calculate GCD using the Euclidean algorithm
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        // You can replace these values with any desired input
        int num1 = 24;
        int num2 = 36;

        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}
