package leetcode;

import java.util.HashMap;

public class MajorityElements {

    public static void main(String[] args) {

        // Approach 1 using frequency array
        // int[] arr = { 2, 3, 4, 5, 2, 2, 2 };
        int[] arr = { 2, 3, 4, 5, 5, 5, 5, 5, 5, 2 };
        // int[] arr = { 7, 7, 2, 7 };
        // int[] freq = new int[10];
        // for (int i = 0; i < arr.length; i++) {
        // freq[arr[i]]++;
        // }
        // int max = 0;
        // int vlaue = 0;
        // for (int j = 0; j < freq.length; j++) {
        // if (max < freq[j]) {
        // vlaue = j;
        // max = freq[j];
        // }
        // // System.out.println(freq[j]);
        // }
        // System.out.println(vlaue);

        // Approach- 2 Using HashMap
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
            if (hm.get(arr[i]) > arr.length / 2) {
                System.out.println(arr[i]);
            }
        }
    }
}
