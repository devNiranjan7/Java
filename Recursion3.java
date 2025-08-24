import java.util.*;
public class Recursion3 {
    // Method 1 to reverse array
    static void RevNumArr1(int i,int n,int arr[]){
        if(i>=n){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[n];
        arr[n]=temp;
        RevNumArr1(i+1,n-1,arr);
    }

    // Method 2 to reverse array
    static void RevNumArr2(int i,int n,int arr[]){
        if(i>=n/2){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        RevNumArr2(i+1,n,arr);
    }

    // To check if a string is palindrome or not
    static boolean StrP(int i,char s[]){
        if(i>=s.length/2)return true;
        if(s[i]!=s[s.length-i-1])return false;
        return StrP(i+1,s);
    }
    public static void main(String[] args){
        int arr[]={1,3,8,2,7};
        String s="madam";
        // RevNumArr1(0,arr.length-1,arr);
        // System.out.println(Arrays.toString(arr));

        // RevNumArr2(0,arr.length,arr);
        // System.out.println(Arrays.toString(arr));

        // System.out.println(StrP(0,s.toCharArray()));
   }
}