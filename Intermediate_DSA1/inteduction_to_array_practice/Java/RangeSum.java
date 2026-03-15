package Java;

import java.util.Arrays;

public class RangeSum {
    public int[] sumForRange(int[] A, int[][] B) {
        int[] ps = new int[A.length];
        int[] resultArray = new int[B.length];
        ps[0] = A[0];
        //creating prefix sum array
        for(int i = 1; i < A.length; i++){
            ps[i] = A[i] + ps[i-1];
        }

        //Finding Sum of the query
        int placeHolder = 0;
        for(int i = 0; i < B.length; i++){
            placeHolder = ps[B[i][1]];
            if(B[i][0] > 0) {
                placeHolder -= ps[B[i][0] - 1];
            } 
            resultArray[i] = placeHolder;
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {{ 0, 3 }, {1, 2}};
        RangeSum obj = new RangeSum();
        int[] result = obj.sumForRange(A, B);
        System.out.println("Prifix sum: " + Arrays.toString(result));
    }
}
