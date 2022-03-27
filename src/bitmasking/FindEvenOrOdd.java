package bitmasking;

import java.util.Scanner;

public class FindEvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a  =1;
        sc.close();
        if ((n & (a)) == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
}