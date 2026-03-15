package Java;

import java.util.Arrays;

public class ReverseTheArray {
    public int[] reverse(int[] A, int B, int C) {
        int i = B;
        int j = C;
        while (i < j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int B = 0;
        int C = A.length - 1;
        ReverseTheArray obj = new ReverseTheArray();
        int[] result = obj.reverse(A, B, C);
        System.out.println("Reversed Array: " + Arrays.toString(result));
        //Reversing in given range
        B = 2;
        C = 3;
        result = obj.reverse(A, B, C);
        System.out.println("Reverse range array: " + Arrays.toString(result));
    }
}
