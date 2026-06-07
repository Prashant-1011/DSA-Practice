//Rturn the non overlapping subarray with sum K

package Intermediate_DSA1.sub_arrays_practice.Java;

public class NonOverlappingSubarraySum {
    public int nonOverlappingSubarraySum(int[]A, int k) {
        int n = A.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += A[j];
                if (sum == k) {
                    ans++;
                    i = j;
                    break;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, -2, 3, 1, 2, 1, -3};
        NonOverlappingSubarraySum obj = new NonOverlappingSubarraySum();
        int result = obj.nonOverlappingSubarraySum(A, 3);
        System.out.println(result);
    }
}
