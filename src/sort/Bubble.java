package sort;

public class Bubble extends Sorter{


        public int[] sort(int[] arrayToSort) {
            A = arrayToSort;
            n = A.length;
            for (int i =0; i<=n-2; i++){
                for (int j=0; j<=n-i-2; j++){
                    if (gt(A[j],A[j+1])){
                        swap(j, j+1);
                    }
                }
            }
            return A;
        }
       public String algorithmName(){
            return "BubbleSort";
        }

}
