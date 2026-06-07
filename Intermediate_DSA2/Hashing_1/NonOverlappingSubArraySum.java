package Intermediate_DSA2.Hashing_1;

import java.util.HashSet;
import java.util.Set;

import Intermediate_DSA1.sub_arrays_practice.Java.NonOverlappingSubarraySum;

public class NonOverlappingSubArraySum {
    public int nonOverlappingSubarraySum(int[] nums, int k) {
        Set<Integer> prefixSums = new HashSet<>();
        prefixSums.add(0);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            if (prefixSums.contains(prefixSum - k)) {
                count++;

                // Reset for non-overlapping condition
                prefixSums.clear();
                prefixSums.add(0);
                prefixSum = 0;
            } else {
                prefixSums.add(prefixSum);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, -2, 3, 1, 2, 1, -3};
        NonOverlappingSubarraySum obj = new NonOverlappingSubarraySum();
        int result = obj.nonOverlappingSubarraySum(A, 3);
        System.out.println(result);
    }
}
