package sort;

import java.util.ArrayList;
import java.util.List;

public class Bucket extends Sorter {
    @Override
    public int[] sort(int[] arrayToSort) {
        n = arrayToSort.length;
        int numBuckets = arrayToSort.length;
        int max = 0;
        ArrayList<Integer>[] bucket = new ArrayList[numBuckets];

        //find max element
        for (int element : arrayToSort) {
            max = Integer.max(max, element);
        }

        // creating bucets
        for(int i = 0; i < numBuckets; i++){
            bucket[i] = new ArrayList<>();
        }

        // put elements in bucket
        for ( int i = 0; i < arrayToSort.length; i++){
            bucket[((numBuckets-1)*arrayToSort[i])/max].add(arrayToSort[i]);
        }

        int arrIndex = 0;
        for (ArrayList bucke: bucket) {
            for (Object num : bucke){
                arrayToSort[arrIndex] = (int) num;
                arrIndex++;
            }
        }


        return arrayToSort;
    }
    public int[] bucketSort(int[] arrayToSort, int[] types){
        n = arrayToSort.length;
        int numBuckets = types.length;
        int max = 0;
        ArrayList<Integer>[] bucket = new ArrayList[numBuckets];

        //find max element
        for (int element : arrayToSort) {
            max = Integer.max(max, element);
        }

        // creating bucets
        for(int i = 0; i < numBuckets; i++){
            bucket[i] = new ArrayList<>();
        }

        // put elements in bucket
        for ( int i = 0; i < arrayToSort.length; i++){
            for (int j = 0; j < types.length; j++) {
                if (types[j] == arrayToSort[i]){
                    bucket[j].add(arrayToSort[i]);
                    break;
                }
            }
        }

        int arrIndex = 0;
        for (ArrayList bucke: bucket) {
            for (Object num : bucke){
                arrayToSort[arrIndex] = (int) num;
                arrIndex++;
            }
        }


        return arrayToSort;
    }

    @Override
    public String algorithmName() {
        return "Bucket";
    }
}
