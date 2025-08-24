import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // HASHING for integers
        int n;
        System.out.print("Enter size of array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // // precompute using basic hashing
        // int hash[] = new int[13];
        // for (int i = 0; i < 13; i++) {
        //     hash[i] = 0;
        // }
        // for (int i = 0; i < n; i++) {
        //     hash[arr[i]] += 1;
        // }

        // System.out.print("Enter number of query: ");
        // int q = sc.nextInt();
        // while (q != 0) {
        //     System.out.print("Enter number you want counting of: ");
        //     int number = sc.nextInt();
        //     // fetch
        //     System.out.println(hash[number]);
        //     q--;
        // }

        // precompute using HashMap
        Map < Integer, Integer > mpp = new HashMap < > ();
        for (int i = 0; i < n; i++) {
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        }

        System.out.print("Enter number of query: ");
        int q = sc.nextInt();
        while (q != 0) {
            System.out.print("Enter number you want counting of: ");
            int number = sc.nextInt();
            // fetch
            System.out.println(mpp.getOrDefault(number, 0));
            q--;
        }

        // HASHING for characters
        // System.out.print("Enter a lowercase string: ");
        // String s = sc.next();
        // char arr[] = s.toCharArray();

        // // precompute
        // int hash[] = new int[26];
        // for (int i = 0; i < 26; i++) {
        //     hash[i] = 0;
        // }
        // for (int i = 0; i < s.length(); i++) {
        //     hash[arr[i] - 'a'] += 1;
        // }

        // System.out.print("Enter number of query: ");
        // int q = sc.nextInt();
        // while (q != 0) {
        //     System.out.print("Enter character you want counting of: ");
        //     char ch = sc.next().charAt(0);
        //     // fetch
        //     System.out.println(hash[ch - 'a']);
        //     q--;
        // }
    }
}