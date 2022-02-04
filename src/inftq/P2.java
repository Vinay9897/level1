package inftq;

import java.util.ArrayList;
import java.util.Arrays;

public class P2 {
    public static void main(String[] args) {

        String s = "93012630";
        ArrayList<Integer> st = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {

                st.add(Integer.parseInt(s.substring(i, j)));
            }
        }
        for (int num : st) {

            for (int j = 0; j < num; j++) {
                if (j * (j + 1) == num) {
                    arr.add(num);
                    break;
                }
            }
        }
        int[] ar = new int[arr.size()];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = arr.get(i);
        }
        Arrays.sort(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

    }

}
