// Problem Description
// Given an array of integers A and multiple values in B,
// which represents the number of times array A needs to be left rotated.
// Find the rotated array for each value and return the result in the from of a matrix
// where ith row represents the rotated array for the ith value in B.

// Problem Constraints
// 1 <= length of both arrays <= 2000 -10^9 <= A[i] <= 10^9 0 <= B[i] <= 2000

// Input Format
// The first argument given is the integer array A.
// The second argument given is the integer array B.

// Output Format
// Return the resultant matrix.

// Example Input
// Input 1:
//     A = [1, 2, 3, 4, 5]
//     B = [2, 3]

// Input 2:
//     A = [5, 17, 100, 11]
//     B = [1]

// Example Output
// Output 1:
//     [ [3, 4, 5, 1, 2]
//      [4, 5, 1, 2, 3] ]

// Output 2:
//     [ [17, 100, 11, 5] ]

// Example Explanation
// for input 1 -> B[0] = 2 which requires 2 times left rotations
// 1: [2, 3, 4, 5, 1]
// 2: [3, 4, 5, 1, 2]
// B[1] = 3 which requires 3 times left rotation
// 1: [2, 3, 4, 5, 1]
// 2: [3, 4, 5, 1, 2]
// 2: [4, 5, 1, 2, 4]

package Intermediate_DSA1.Interview_questions_one.Java;

import java.util.ArrayList;
import java.util.Arrays;

public class MultipleLeftRotation {
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
        MultipleLeftRotation obj = new MultipleLeftRotation();
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {2, 3};
        int lenA = A.length;
        int lenB = B.length;
        ArrayList<int[]> resultList = new ArrayList<>();

        //Reverse whole array
        obj.reverse(A, 0, lenA-1);
        System.out.println(lenB);
        for (int i = 0; i < lenB; i++) {
            System.out.println(i);
            int C = B[i];
            //Reverse first n-c elements
            obj.reverse(A, 0, lenA-C-1);

            //Reverse the last c elements
            obj.reverse(A, C+1, lenA-1);
            resultList.add(A);
        }

        // Convert ArrayList to 2D array for proper formatting
        int[][] result = new int[resultList.size()][];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        System.out.println("Final array: " + Arrays.deepToString(result));
    }
}
