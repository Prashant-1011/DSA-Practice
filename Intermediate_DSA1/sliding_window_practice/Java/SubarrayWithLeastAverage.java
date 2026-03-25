// Problem Description
// Given an array A of size N, find the subarray of size B with the least average.

// Problem Constraints
// 1 <= B <= N <= 105
// -105 <= A[i] <= 105

// Input Format
// First argument contains an array A of integers of size N.
// Second argument contains integer B.

// Output Format
// Return the index of the first element of the subarray of size B that has least average.
// Array indexing starts from 0.

// Example Input
// Input 1:
// A = [3, 7, 90, 20, 10, 50, 40]
// B = 3

// Input 2:
// A = [3, 7, 5, 20, -10, 0, 12]
// B = 2

// Example Output
// Output 1:
// 3
// Output 2:
// 4

// Example Explanation
// Explanation 1:
// Subarray between indexes 3 and 5
// The subarray {20, 10, 50} has the least average 
// among all subarrays of size 3.

// Explanation 2:
//  Subarray between [4, 5] has minimum average

package Intermediate_DSA1.sliding_window_practice.Java;

public class SubarrayWithLeastAverage {
    public int leastAverage(int[] A, int B) {
        int n = A.length;
        int sum = 0;

        for(int i = 0; i < B; i++) {
            sum += A[i];
        }

        int avg = sum / B;
        int ans = 0;

        int L = 1, R = B;
        while (R < n) {
            sum = sum - A[L-1] + A[R];
            if ((sum / B) < avg) {
                ans = L;
            }
            L++; R++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = {3, 7, 5, 20, -10, 0, 12};
        int B = 2;
        SubarrayWithLeastAverage obj = new SubarrayWithLeastAverage();
        int result = obj.leastAverage(A, B);
        System.out.println("least average is: " + result);
    }
}
