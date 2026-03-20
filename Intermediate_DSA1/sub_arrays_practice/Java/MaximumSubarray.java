// Problem Description
// You are given an integer array C of size A. Now you need to find a subarray (contiguous elements)
// so that the sum of contiguous elements is maximum.
// But the sum must not exceed B.

// Problem Constraints
// 1 <= A <= 103
// 1 <= B <= 109
// 1 <= C[i] <= 106

// Input Format
// The first argument is the integer A.
// The second argument is the integer B.
// The third argument is the integer array C.

// Output Format
// Return a single integer which denotes the maximum sum.

// Example Input
// Input 1:
// A = 5
// B = 12
// C = [2, 1, 3, 4, 5]

// Input 2:
// A = 3
// B = 1
// C = [2, 2, 2]

// Example Output
// Output 1:
// 12

// Output 2:
// 0

// Example Explanation
// Explanation 1:
// We can select {3,4,5} which sums up to 12 which is the maximum possible sum.

// Explanation 2:
// All elements are greater than B, which means we cannot select any subarray.
// Hence, the answer is 0.

package Intermediate_DSA1.sub_arrays_practice.Java;

public class MaximumSubarray {
    public int maxSum(int A, int B, int[] C) {
        int ans = Integer.MIN_VALUE;
        for(int L = 0; L < A; L++) {
            int sum = 0;
            for(int R = L; R < A; R++) {
                sum += C[R];
                if (sum <= B) {
                    ans = Math.max(ans, sum);
                } else {
                    break;
                }
            }
        }
        
        return 0;
    }

    public static void main(String[] args) {
        int[] C = {2, 1, 3, 4, 5};
        int A = 5;
        int B = 12;
        MaximumSubarray obj = new MaximumSubarray();
        int result = obj.maxSum(A, B, C);
        System.out.println(result);
    }
}
