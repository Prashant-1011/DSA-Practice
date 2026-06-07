// Problem Description
// You are given an array A of length N and Q queries given by the 2D array B of size Q*2.
// Each query consists of two integers B[i][0] and B[i][1].
// For every query, the task is to calculate the sum of all even indices in the
// range A[B[i][0]…B[i][1]].
// Note : Use 0-based indexing

// Problem Constraints
// 1 <= N <= 105
// 1 <= Q <= 105
// 1 <= A[i] <= 100
// 0 <= B[i][0] <= B[i][1] < N

// Input Format
// First argument A is an array of integers.
// Second argument B is a 2D array of integers.

// Output Format
// Return an array of integers.

// Example Input
// Input 1:
// A = [1, 2, 3, 4, 5]
// B = [   [0,2] 
//         [1,4]   ]

// Input 2:
// A = [2, 1, 8, 3, 9]
// B = [   [0,3] 
//         [2,4]   ]

// Example Output
// Output 1:
// [4, 8]

// Output 2:
// [10, 17]

// Example Explanation
// For Input 1:
// The subarray for the first query is [1, 2, 3] whose sum of even indices is 4.
// The subarray for the second query is [2, 3, 4, 5] whose sum of even indices is 8.

// For Input 2:
// The subarray for the first query is [2, 1, 8, 3] whose sum of even indices is 10.
// The subarray for the second query is [8, 3, 9] whose sum of even indices is 17.

package Intermediate_DSA1.Interview_questions_two.Java;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfEvenIndices {
    public ArrayList<Integer> evenPrefixSum(int[] A, int[][] B) {
        int n = A.length;
        int[] ps = new int[n];
        ps[0] = A[0];
        ArrayList<Integer> ressultList = new ArrayList<>();

        //Creating the prefix sum array
        for (int i = 1; i < n; i++) {
            ps[i] = ps[i-1] + (i % 2 == 0 ? A[i] : 0);
        }

        System.out.println(Arrays.toString(ps));

        for (int j = 0; j < B.length; j++) {
            int L = B[j][0], R = B[j][1];
            int x = ps[R];
            if (L != 0) {
                x -= ps[L-1];
            }
            ressultList.add(x);
        }

        return ressultList;
    }

    public static void main(String[] args) {
        int[] A = {2, 1, 8, 3, 9};
        int[][] B = {{0,3},{2,4}};
        SumOfEvenIndices obj = new SumOfEvenIndices();
        ArrayList<Integer> result = obj.evenPrefixSum(A, B);
        System.out.println(result);
    }
}
