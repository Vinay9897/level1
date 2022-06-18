package amazon;

public class MedianOfSortedArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 12, 14, 23, 35 };
        int[] arr2 = { 2, 13, 17, 30, 45 };
        int count = 0;
        int fIndex = 0;
        int sIndex = 0;
        int flag = 0;
        int len = arr1.length + arr2.length;
        if (len % 2 == 0) {
            flag = 1;
            fIndex = (len - 1) / 2;
            sIndex = len / 2;
        } else {
            sIndex = len / 2;
        }
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (flag == 1 && count == fIndex)
                    fIndex = arr1[i];
                if (flag == 1 && count == sIndex) {
                    sIndex = arr1[i];
                    break;
                }
                if (flag == 0 && count == sIndex) {
                    sIndex = arr1[i];
                    break;
                }
                count++;
                i++;
            } else {
                if (flag == 1 && count == fIndex)
                    fIndex = arr2[j];
                if (flag == 1 && count == sIndex) {
                    sIndex = arr2[j];
                    break;
                }
                if (flag == 0 && count == sIndex) {
                    sIndex = arr2[j];
                    break;
                }
                j++;
                count++;
            }
        }
        while (j < arr2.length) {
            if (flag == 1 && count == fIndex)
                fIndex = arr2[j];
            if (flag == 1 && count == sIndex) {
                sIndex = arr2[j];
                break;
            }
            if (flag == 0 && count == sIndex) {
                sIndex = arr2[j];
                break;
            }
            count++;
            j++;
        }
        while (i < arr1.length) {
            if (flag == 1 && count == fIndex)
                fIndex = arr1[i];
            if (flag == 1 && count == sIndex) {
                sIndex = arr1[i];
                break;
            }
            if (flag == 0 && count == sIndex) {
                sIndex = arr1[i];
                break;
            }
            count++;
            i++;
        }
        if (flag == 1)
            System.out.println("Median : " + (fIndex + sIndex) / 2);
        else
            System.out.println("Median : " + sIndex);
    }

}
