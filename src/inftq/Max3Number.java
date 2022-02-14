package inftq;

public class Max3Number {
    public static void main(String[] args) {
        int[] arr = { 9, 3, 6, 2, 1, 8 };
        int max = -1;
        int secondMax = -1;
        int thirdMax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if (arr[i] > thirdMax && arr[i] != secondMax) {
                thirdMax = arr[i];
            }
        }
        System.out.println("Maximum : " + max + "SecondMaximum : " + secondMax + "ThirdMaximum : " + thirdMax);
    }
}
