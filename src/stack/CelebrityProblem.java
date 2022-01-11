package stack;

import java.io.*;
import java.util.*;

public class CelebrityProblem {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }
        findCelebrity(arr);
    }

    private static void findCelebrity(int[][] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(i);
        }
        while (stack.size() >= 2) {
            int i = stack.pop();
            int j = stack.pop();

            if (arr[i][j] == 1) {
                stack.push(j);
            } else {
                stack.push(i);
            }
        }

        // now we got potential celebrity
        int pot = stack.pop();
        for (int i = 0; i < arr.length; i++) {
            if (i != pot) {
                if (arr[i][pot] == 1 && arr[pot][i] == 0) {
                    System.out.println("none");

                }
            }
        }
        System.out.println(pot);
    }
}