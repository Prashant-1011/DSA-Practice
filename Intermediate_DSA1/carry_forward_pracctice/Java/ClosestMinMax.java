// Problem Description
// Given an array A, find the size of the smallest subarray such that it contains at least
// one occurrence of the maximum value of the array
// and at least one occurrence of the minimum value of the array.

// Problem Constraints
// 1 <= |A| <= 2000

// Input Format
// First and only argument is vector A

// Output Format
// Return the length of the smallest subarray which has at least one occurrence of
// minimum and maximum element of the array

// Example Input
// Input 1:
// A = [1, 3, 2]

// Input 2:
// A = [2, 6, 1, 6, 9]

// Example Output
// Output 1:
//  2

// Output 2:
//  3

// Example Explanation
// Explanation 1:
//  Take the 1st and 2nd elements as they are the minimum and maximum elements respectievly.

// Explanation 2:
//  Take the last 3 elements of the array.

package Intermediate_DSA1.carry_forward_pracctice.Java;

public class ClosestMinMax {
    public int minMaxSubarray(int[] A) {
        int n = A.length;
        final int inf = (int)(1e9);
        int maxIndex = -1, minIndex = -1;
        int max = -inf, min = inf;
        int ans = n;

        for(int i = 0; i < n; i++) {
            if (A[i] > max) {
                max = A[i];
            }
            if (A[i] < min) {
                min = A[i];
            }
        }
        
        if (min == max) {
            return 1;
        }

        for (int i = 0; i < n; i++) {
            if (A[i] == min) {
                if (maxIndex != -1) {
                    ans = Math.min(ans, i - maxIndex + 1);
                }
                minIndex = i;
            } else if (A[i] == max) {
                if (minIndex != -1) {
                    ans = Math.min(ans, i - minIndex + 1);
                }
                maxIndex = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 2};
        ClosestMinMax obj = new ClosestMinMax();
        int result = obj.minMaxSubarray(A);
        System.out.println("Min subarray legnth containing min and max: " + result);
    }
}
