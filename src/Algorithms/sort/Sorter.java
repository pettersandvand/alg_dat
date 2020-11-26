package Algorithms.sort;


public abstract class Sorter {
    public int n;

    // The array which is to be sorted
    int A[];

    // Counters for comparisons and swaps
    int comparisons = 0;
    int swaps = 0;



    // For the students to implement in an appropriate subclass
    public abstract int[] sort(int[] arrayToSort);

    // Necessary for output
    public abstract String algorithmName();

    // A swapping method that counts
    void swap(int i, int j) {
        swaps++;
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    // Comparisons that count
    boolean lt(int a, int b) { //less than
        comparisons++;
        return a < b;
    }

    boolean leq(int a, int b) { //less than or equal
        comparisons++;
        return a <= b;
    }

    boolean gt(int a, int b) { //greater than
        comparisons++;
        return a > b;
    }

    boolean geq(int a, int b) { //greater than or equal
        comparisons++;
        return a >= b;
    }

    // For Oblig3Runner

    // Sort and return the time it consumed in microseconds
    long sortTimed() {
        long t = System.nanoTime();
        sort(A);
        return (System.nanoTime() - t) / 1000;
    }

    // Run a sorting and return a description of the execution as a CSV row
    String run() {
        /*String fmt = runStringFormat();
        if (discard) {
            String res = String.format(fmt, 0, 0, 0);
            return res.replace("0", " ");
        }
        long timeus = sortTimed();
        long timems = timeus / 1000;

        if (timems > Oblig3Runner.TIME_LIMIT_MS) {
            discard = true;
            System.out.println("\nGiving up on " + algorithmName() + "\n");
        }

        String res = String.format(fmt, comparisons, swaps, timeus);
        return res;*/
        return "";
    }

}

