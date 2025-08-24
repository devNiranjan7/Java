public class Recursion2 {
    // Sum of n natural numbers using parametrised way
    static void SumN(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        SumN(i - 1, sum + i);
    }

    // Sum of n natural numbers using functional recursion
    static int SumNum(int n) {
        if (n == 0) return 0;
        return n + SumNum(n - 1);
    }

    // Factorial of a number using recursion
    static int Factorial(int n) {
        if (n == 0) return 1;
        return n * Factorial(n - 1);
    }
    public static void main(String[] args) {
        // SumN(4,0);
        // System.out.println(SumNum(5));
        // System.out.println(Factorial(0));
    }
}