public class ManualSqrtExample {

    // Custom method to find square root (integer part only)
    static int findSqrt(int number) {
        int i = 0;
        while (i * i <= number) {
            i++;
        }
        return i - 1;
    }

    public static void main(String[] args) {
        int a = 9;
        int b = 7;

        // Step 1: Add a and b
        int sum = a + b;

        // Step 2: Find square root of (a + b)
        int result = findSqrt(sum);

        // Step 3: Print result
        System.out.println("Square root of (a + b) = " + result);
    }
}
