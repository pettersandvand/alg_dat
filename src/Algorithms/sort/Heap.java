package Algorithms.sort;

public class Heap extends Sorter{

    /**
     * Heap Algorithms.sort algorithm. That takes all element of an exisiting array, rearange it to a max heap,
     * and put the largest element out of the heap and to the back of the array.
     */
    public int[] sort(int[] arrayToSort) {
        A = arrayToSort;
        n = A.length;
        buildMaxHeap();
        for (int i = n - 1; i >= 0; i--) {
            swap(0, i);
            bubbleDown(0,i);
        }
        return A;
    }


    /**
     * @param i the index of root element
     */
    void bubbleDown(int i, int n) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        //as long as i has a child and that child is smaller, change position.
        if (left < n && lt(A[largest], A[left])) {
            largest = left;
        }

        if (right < n && lt(A[largest], A[right])) {
            largest = right;
        }
        //if the largest is not the same as the i, they shall be swapped and then booble recuzive
        if (i != largest) {
            swap(i, largest);
            bubbleDown(largest,n);
        }
    }

    /**
     *
     */
    void buildMaxHeap() {
        for (int i = (n / 2); i >= 0; i--) {
            bubbleDown(i,n);
        }
    }

    /**
     * @return
     */
    @Override
    public String algorithmName() {
        return "Heap";
    }
}
