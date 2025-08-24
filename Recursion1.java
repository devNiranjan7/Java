public class Recursion1 {

    // Printing Name using Recursion
    static void Name(int count) {
        if (count == 0) {
            return;
        }
        System.out.println("Dev");
        Name(count - 1);
    }

    // Printing linearly from 1 to n
    static void Num1toN(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.print(i + " ");
        Num1toN(i + 1, n);
    }

    // Printing linearly from n to 1
    static void NumNto1(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.print(n + " ");
        NumNto1(i, n - 1);
    }

    // Printing linearly from 1 to n (but by Backtrack)
    static void Num1toNBt(int i) {
        if (i < 1) {
            return;
        }
        Num1toNBt(i - 1);
        System.out.print(i + " ");
    }

    // Printing linearly from n to 1 (but by Backtrack)
    static void NumNto1Bt(int i, int n) {
        if (i > n) {
            return;
        }
        NumNto1Bt(i + 1, n);
        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        // Name(5); 
        // Num1toN(1,6);
        // NumNto1(1,7);
        // Num1toNBt(3);
        // NumNto1Bt(1,4);
    }
}