package inftq;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class MaxEvenNumber {
    public static void main(String[] args) {
        String s = "Vinay5@41231";
        String numberOnly = s.replaceAll("[^0-9]", "");
        int len = numberOnly.length();
        int number = Integer.parseInt(numberOnly);
        Integer[] arr = new Integer[len];
        int i = 0;
        while (number > 0) {
            int rem = number % 10;
            arr[i++] = rem;
            number /= 10;
        }
        Arrays.sort(arr, Collections.reverseOrder());
    }
}
