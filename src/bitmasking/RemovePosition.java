package bitmasking;

import java.util.Scanner;

public class RemovePosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println("Enter the position");
        int p = sc.nextInt();
        sc.close();
        // shift the 1 i th time
        // and complement it
         p = ~(p << 1); 
        n = n & p;
        System.out.println(n);
    }
    
}
