package Algorithms.Search;

public class BinarySearch {
    public boolean search(int[] a, int x){
        int low = 0;
        int high = a.length;
        while (low <= high){
            int i =(int)Math.floor((low+high)/2);
            if (a[i] == x){
                return true;
            }else if (a[i]<x){
                low = i+1;
            }else if(a[i]>x){
                high = i-1;
            }
        }
        return false;
    }
}
