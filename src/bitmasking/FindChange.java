package bitmasking;

import java.util.Scanner;

public class FindChange {
    // Find the no of bit to convert the a to b.
    // ex 1101 and 1000 
    // answer 2 bit 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n = sc.nextInt();
        System.out.println("Enter the second number");
        int n1 = sc.nextInt();
        sc.close();
        // Xor of first number and second number
        // store in the first number
        // we have done this because, XOR operation give the no of bit need to change  
        n = n ^ n1;
        // count the no of bit to need to change
        int count = 0;
        while(n != 0)
        {

            if( (n & 1) == 1)
            {
                count++;
            }
            n = n >> 1;
        }
        System.out.println("No of bit need to change " + count);
        
    }
    
}
