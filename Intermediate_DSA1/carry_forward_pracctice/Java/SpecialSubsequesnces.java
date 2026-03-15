// Problem Description
// You have given a string A having Uppercase English letters.
// You have to find how many times subsequence "AG" is there in the given string.
// NOTE: Return the answer modulo 109 + 7 as the answer can be very large.

// Problem Constraints
// 1 <= length(A) <= 105
// Input Format
// First and only argument is a string A.
// Output Format
// Return an integer denoting the answer.

// Example Input
// Input 1:
//  A = "ABCGAG"

// Input 2:
//  A = "GAB"

// Example Output
// Output 1:
//  3

// Output 2:
//  0

// Example Explanation
// Explanation 1:
//  Subsequence "AG" is 3 times in given string 

// Explanation 2:
//  There is no subsequence "AG" in the given string.

package Intermediate_DSA1.carry_forward_pracctice.Java;

public class SpecialSubsequesnces {
    public int solve(String S) {
        int countOfG = 0;
        int ans = 0;
        int M = (int)1e9 + 7;
        for(int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == 'G') {
                countOfG++;
            }
            if (S.charAt(i) == 'A') {
                ans = (ans + countOfG) % M;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String S = "ABCGAG";
        SpecialSubsequesnces obj = new SpecialSubsequesnces();
        int result = obj.solve(S);
        System.out.println("Number of AG pairs: " + result);
    }
}
