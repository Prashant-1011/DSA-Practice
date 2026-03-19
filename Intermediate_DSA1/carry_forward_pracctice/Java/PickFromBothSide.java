// Problem Description
// You are given an integer array A of size N.
// You have to perform B operations. In one operation,
// you can remove either the leftmost or the rightmost element of the array A.
// Find and return the maximum possible sum of the B elements
// that were removed after the B operations.
// NOTE: Suppose B = 3, and array A contains 10 elements, then you can:
// Remove 3 elements from front and 0 elements from the back, OR
// Remove 2 elements from front and 1 element from the back, OR
// Remove 1 element from front and 2 elements from the back, OR
// Remove 0 elements from front and 3 elements from the back.

// Problem Constraints
// 1 <= N <= 105
// 1 <= B <= N
// -103 <= A[i] <= 103

// Input Format
// First argument is an integer array A.
// Second argument is an integer B.

// Output Format
// Return an integer denoting the maximum possible sum of elements you removed.

// Example Input
// Input 1:

//  A = [5, -2, 3 , 1, 2]
//  B = 3

// Input 2:
//  A = [ 2, 3, -1, 4, 2, 1 ]
//  B = 4

// Example Output
// Output 1:
//  8

// Output 2:
//  9

// Example Explanation
// Explanation 1:
//  Remove element 5 from front and element (1, 2) from back so we get 5 + 1 + 2 = 8

// Explanation 2:
//  Remove the first element and the last 3 elements. So we get 2 + 4 + 2 + 1 = 9

package Intermediate_DSA1.carry_forward_pracctice.Java;

public class PickFromBothSide {
    public int solve2(int[] A, int B) {
        int n = A.length;
        int []suff = new int[n + 1];
        suff[n] = 0;
        suff[n - 1] = A[n - 1];
        for(int i = n - 2; i >= 0; i--){
            suff[i] = A[i] + suff[i + 1];
        }
        int pref_sum = 0;
        int ans = suff[n - B];
        for(int i = 0; i < B; i++){
            pref_sum = pref_sum + A[i];
            int suff_sum = suff[n - B + (i + 1)];
            ans = Math.max(ans, pref_sum + suff_sum);
        }
        return ans;
    }
    
    public int solve(int[] A, int B) {
        int n = A.length;
        int cur = 0;
        for(int i = 0; i < B; i++){
            cur += A[i];
        }
        int back = B - 1; 
        int ans = cur; 
        for(int j = n - 1 ; j >= n-B; j--){
            cur += A[j];
            cur -= A[back];
            back--;
            ans = Math.max(ans, cur);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {5, -2, 3 , 1, 2};
        PickFromBothSide obj = new PickFromBothSide();
        int result = obj.solve(A, 3);
        System.out.println("Maximus sum: " + result);
    }
}
