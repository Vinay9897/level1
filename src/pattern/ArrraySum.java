package pattern;

import java.util.Scanner;

public class ArrraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of 1st arrya:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Please the enter the values of tthe arrat");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Please enter the size of 2st arrya:");
        int n1 = sc.nextInt();
        int[] arr2 = new int[n1];
        System.out.println("Please the enter the values of the array");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] sum = new int[n > n1 ? n : n1];
        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;
        sc.close();
        while (k >= 0) {
            int d = carry;
            if (i >= 0) {
                d += arr1[i];
            }
            if (j >= 0) {
                d += arr2[j];
            }
            carry = d / 10;
            d = d % 10;
            sum[k] = d;

            i--;
            j--;
            k--;
        }
        if (carry != 0) {
            System.out.println("carry :" + carry);
        }
        for (int val : sum) {
            System.out.println(val);
        }

    }

}