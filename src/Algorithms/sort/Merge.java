package Algorithms.sort;

import java.util.Arrays;

public class Merge extends Sorter {
    @Override
    public int[] sort(int[] arrayToSort) {
        A = arrayToSort;
        n = A.length;

        return mergeSort(A);
    }
    int[] mergeSort(int[] array){
        int len = array.length;
        if (len <= 1) {
            return array;
        }
        int[] a = mergeSort(Arrays.copyOfRange(array, 0, len / 2));
        int[] b = mergeSort(Arrays.copyOfRange(array, len / 2, len));

        return merge(a, b, array);
    }

    int[] merge(int[] a, int[] b, int[] A) {
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                A[i + j] = a[i];
                i++;
            } else {
                A[i + j] = b[j];
                j++;
            }
        }
        while (i < a.length) {
            A[i + j] = a[i];
            i++;
        }
        while (j < b.length) {
            A[i + j] = b[j];
            j++;
        }
        return A;
    }

    @Override
    public String algorithmName() {
        return "Merge";
    }
}
