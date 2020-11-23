package utils;

import sort.*;


import java.io.*;

public class SortingRunner {
    public static void main(String[] args) throws IOException {
        String filename = args[0];
        File file = new File(filename);
        BufferedReader in = new BufferedReader(new FileReader(file));
        int[] A = in.lines().mapToInt(i -> Integer.parseInt(i)).toArray();
        in.close();

        runSorter(A, filename, new Bucket());

    }
    static void runSorter(int[] A, String inFile, Sorter algorithm) throws IOException {

            // Make an outfile for the algorithm
            String outfilename = inFile + "_" + algorithm.algorithmName() + ".out";
            File outfile = new File(outfilename);
            BufferedWriter writer = new BufferedWriter(new PrintWriter(outfile));

            // Initialize and sort
            int[] sorted = algorithm.sort(A);

            // Write results to file
            for (int i = 0; i < algorithm.n; i++) {
                writer.write(sorted[i] + "\n");
            }
            writer.close();

    }
}
