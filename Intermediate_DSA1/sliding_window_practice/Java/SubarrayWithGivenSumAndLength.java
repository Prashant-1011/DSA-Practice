// Problem Description
// Given an array A of length N. Also given are integers B and C.
// Return 1 if there exists a subarray with length B having sum C and 0 otherwise

// Problem Constraints
// 1 <= N <= 105
// 1 <= A[i] <= 104
// 1 <= B <= N
// 1 <= C <= 109

// Input Format
// First argument A is an array of integers.
// The remaining arguments B and C are integers

// Output Format
// Return 1 if such a subarray exist and 0 otherwise

// Example Input
// Input 1:
// A = [4, 3, 2, 6, 1]
// B = 3
// C = 11

// Input 2:
// A = [4, 2, 2, 5, 1]
// B = 4
// C = 6

// Example Output
// Output 1:
// 1
// Output 2:
// 0

// Example Explanation
// Explanation 1:
// The subarray [3, 2, 6] is of length 3 and sum 11.

// Explanation 2:
// There are no such subarray.

package Intermediate_DSA1.sliding_window_practice.Java;

public class SubarrayWithGivenSumAndLength {
    public int slidingWindow(int[] A, int B, int C) {
        int n = A.length;
        int sum = 0;
        for(int i = 0; i < B; i++) {
            sum += A[i];
        }

        if (sum == C) {
            return 1;
        }
        int L = 1, R = B;
        while (R < n) {
            sum = sum - A[L-1] + A[R];
            if (sum == C) {
                return 1;
            }
            L++; R++;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] A = {4, 2, 2, 5, 1};
        int B = 4;
        int C = 6;
        SubarrayWithGivenSumAndLength obj = new SubarrayWithGivenSumAndLength();
        int result = obj.slidingWindow(A, B, C);
        System.out.println("Exist a subarray with sum C: " + result);
    }
}
