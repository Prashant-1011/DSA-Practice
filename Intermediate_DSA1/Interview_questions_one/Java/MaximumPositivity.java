// Problem Description
// Given an array of integers A, of size N.
// Return the maximum size subarray of A having only non-negative elements.
// If there are more than one such subarray, return the one having the smallest starting index in A.
// NOTE: It is guaranteed that an answer always exists.

// Problem Constraints
// 1 <= N <= 105
// -109 <= A[i] <= 109

// Input Format
// The first and only argument given is the integer array A.

// Output Format
// Return maximum size subarray of A having only non-negative elements.
// If there are more than one such subarrays, return the one having earliest starting index in A.

// Example Input
// Input 1:
//  A = [5, 6, -1, 7, 8, 6]
// Input 2:
//  A = [1, 2, 3, 4, 5, 6]

// Example Output
// Output 1:
//  [5, 6]
// Output 2:
//  [1, 2, 3, 4, 5, 6]

// Example Explanation
// Explanation 1:
//  There are two subarrays of size 2 having only non-negative elements.
//  1. [5, 6]  starting point  = 0
//  2. [7, 8]  starting point  = 3
//  As starting point of 1 is smaller, return [5, 6]

// Explanation 2:
//  There is only one subarray of size 6 having only non-negative elements:
//  [1, 2, 3, 4, 5, 6]

package Intermediate_DSA1.Interview_questions_one.Java;

import java.util.ArrayList;

public class MaximumPositivity {
    public ArrayList<Integer> positivity(int[] A) {
        int n = A.length;
        ArrayList<Integer> ansSubarray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> midList = new ArrayList<>();
            for (int j = i; j < n; j++) {
                if (A[j] > 0) {
                    midList.add(A[j]);
                } else {
                    break;
                }
            }
            if (midList.size() > ansSubarray.size()) {
                ansSubarray = midList;
            }

            if (midList.size() == n) {
                return ansSubarray;
            }
        }

        return ansSubarray;
    }

    public int[] solve(int[] A) {
        int size = 0, left = 0, right = 0;
        for (int l = -1, r = 0; r < A.length; r++) {
            if (A[r] >= 0) {
                if (size < r - l) {
                size = r - l;
                left = l;
                right = r;
                }
            } else {
                l = r;
            }
        }
        int ans[] = new int[size];
        for (int i = left + 1; i <= right; i++) ans[i - left - 1] = A[i];
        return ans;
    }

    public ArrayList<Integer> solve2(int[] A) {
        int i = 0, j = 0, start = 0, end = 0;
        int n = A.length;
        ArrayList<Integer> resultList = new ArrayList<>();
        while (i < n && j < n) {
            if (A[j] >= 0) {
                j++;
            } else {
                if (j-i > end-start+1) {
                    start = i;
                    end = j-1;
                }
                i = j+1;
                j++;
            }
        }
        
        if (start == 0 && end == 0) {
            start = i; end = j;
        }
        
        for (int k = start; k < end; k++) {
            resultList.add(A[k]);
        }

        return resultList;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6};
        MaximumPositivity obj = new MaximumPositivity();
        ArrayList<Integer> result = obj.solve2(A);
        System.out.println("Longest subarray: " + result);
    }
}
