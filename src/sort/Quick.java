package sort;

public class Quick extends Sorter {

    public int[] sort(int[] arrayToSort) {
        A = arrayToSort;
        n = A.length;
        qs(0, n - 1);
        return A;
    }

    /** qs recursive proc that takes
     *   @param low, @param high
     *    according to list-indexes
     *    and sorts index-decided sublists
     */
    private void qs(int low, int high) {
        if (low >= high) {
            return;
        }
        int p = partition(low, high);
        qs(low, p-1);
        qs(p+1, high);
    }

    /** choosePivot decides and
     *   @return index for pivot-element
     */

    private int choosePivot(int low, int high) {
        int pivotindex = (low + high)/2; //middle index
        return pivotindex;
    }

    /** partition chooses pivot, sorts list by comparing every
     *   element in list to pivot
     *   @return left, index of pivot element
     */
    private int partition(int low, int high) {
        int p = choosePivot(low, high);
        swap(p, high);

        int pivot = A[high];
        int left = low; //index
        int right = high - 1; //index before pivot-element

        //while not reached pivotindex
        while (left <= right) {
            //if still not reached pivot-index, continue comparing
            while (left <= right && leq(A[left], pivot)) {
                left++;
            }
            //if still not reached first elem of list, continue comparing
            while (right >= left && geq(A[right], pivot)) {
                right--;
            }
            //comparison
            if (left < right) {
                swap(left, right);
            }
        }
        //put pivot in correct, sorted place.
        swap(left, high);
        return left;
    }


   public String algorithmName() {
        return "quick";
    }
}
