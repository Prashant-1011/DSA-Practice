package Java;

import java.util.Arrays;

public class RotateTheArray extends ReverseTheArray {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int B = 2;
        int n = A.length;
        RotateTheArray obj = new RotateTheArray();

        //Reverse whole array
        obj.reverse(A, 0, n-1);

        //Reverse first b elements
        obj.reverse(A, 0, B-1);

        //Reverse the remaining elements
        obj.reverse(A, B, n-1);

        System.out.println("Array after rotation: " + Arrays.toString(A));
    }
}
