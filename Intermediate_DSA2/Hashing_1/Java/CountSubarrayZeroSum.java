// Problem Description
// Given an array A of N integers.
// Find the count of the subarrays in the array which sums to zero.
// Since the answer can be very large, return the remainder on dividing the result with 109+7

// Problem Constraints
// 1 <= N <= 105
// -109 <= A[i] <= 109

// Input Format
// Single argument which is an integer array A.

// Output Format
// Return an integer.

// Example Input
// Input 1:
//  A = [1, -1, -2, 2]

// Input 2:
//  A = [-1, 2, -1]

// Example Output
// Output 1:
// 3

// Output 2:
// 1

// Example Explanation
// Explanation 1:
//  The subarrays with zero sum are [1, -1], [-2, 2] and [1, -1, -2, 2].

// Explanation 2:
//  The subarray with zero sum is [-1, 2, -1].

package Intermediate_DSA2.Hashing_1.Java;

import java.util.HashMap;

public class CountSubarrayZeroSum {
    public int subarraySumZeroCount(int[] A) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int ps = 0;
        myMap.put(0, 1);
        int ans = 0;
        for (int num : A) {
            ps += num;
            if (myMap.containsKey(ps)) {
                ans += myMap.get(ps);
                myMap.replace(ps, myMap.get(ps) + 1);
            } else {
                myMap.put(ps, 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = {-1, 2, -1};
        CountSubarrayZeroSum obj = new CountSubarrayZeroSum();
        int result = obj.subarraySumZeroCount(A);

        System.out.println("Number of subarrays with the sum zero: " + result);
    }
}
