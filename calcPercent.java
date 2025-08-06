import java.util.Scanner;

public class calcPercent {
    public static void main(String[] args) {
        double total, sub1, sub2, sub3, sub4, sub5, sum, percent;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1 : ");
        sub1 = sc.nextDouble();

        System.out.print("Enter marks of subject 2 : ");
        sub2 = sc.nextDouble();

        System.out.print("Enter marks of subject 3 : ");
        sub3 = sc.nextDouble();

        System.out.print("Enter marks of subject 4 : ");
        sub4 = sc.nextDouble();

        System.out.print("Enter marks of subject 5 : ");
        sub5 = sc.nextDouble();

        System.out.print("Enter total maximum marks of all 5 subjects : ");
        total = sc.nextDouble();

        sum = sub1 + sub2 + sub3 + sub4 + sub5;
        percent = (sum / total) * 100;

        System.out.println("The percentage is : " + percent);
    }
}