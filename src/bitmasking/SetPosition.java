package bitmasking;

import java.util.Scanner;

public class SetPosition {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the position");
        int position = sc.nextInt();
        sc.close();
        n = ((1 << position) | n);
        System.out.println(n);

    }

}
