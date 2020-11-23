package sort;

public class Insertion extends Sorter{
    public int[] sort(int[] arrayToSort) {
        A = arrayToSort;
        n = A.length;
        for (int i = 1; i < n - 1; i++) { //O(n)
            int j = i;
            while (j > 0 && gt(A[j - 1], A[j])) { //O(n) - bryter gjerne ut, spesielt rask pa nesten sorterte arrays
                swap((j-1), j);
                j = j - 1;
            }
        }
        return A;
    }

    public String algorithmName() {
        return "insertion";
    }
}
