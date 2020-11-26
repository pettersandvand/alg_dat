package utils;

import Algorithms.Search.BinarySearch;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SearchRunner {
    public static void main(String[] args) throws IOException {
        String filename = args[0];
        File file = new File(filename);
        BufferedReader in = new BufferedReader(new FileReader(file));
        int[] A = in.lines().mapToInt(i -> Integer.parseInt(i)).toArray();
        in.close();

        BinarySearch b = new BinarySearch();
        System.out.println(b.search(A,102));

    }
}
