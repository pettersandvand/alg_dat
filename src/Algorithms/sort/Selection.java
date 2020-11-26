package Algorithms.sort;

public class Selection extends Sorter {
    @Override
    public int[] sort(int[] arrayToSort) {
        A = arrayToSort;
        n = arrayToSort.length;
        for (int i = 0; i < n-1; i++){
            int k = i;
            for (int j = i+1; j < n-1; j++){
                if (lt(A[j], A[k])){
                    k = j;
                }
            }
            if (i != k){
                swap(i, k);
            }
        }
        return A;
    }

    @Override
    public String algorithmName() {
        return "Selection";
    }
}
