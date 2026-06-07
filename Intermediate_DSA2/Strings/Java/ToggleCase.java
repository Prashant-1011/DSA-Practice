// Problem Description
// You are given a character string A having length N, consisting of only lowercase and
// uppercase latin letters.
// You have to toggle case of each character of string A.
// For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.

// Problem Constraints
// 1 <= N <= 105
// A[i] ∈ ['a'-'z', 'A'-'Z']

// Input Format
// First and only argument is a character string A.

// Output Format
// Return a character string.

// Example Input
// Input 1:
//  A = "Hello" 

// Input 2:
//  A = "tHiSiSaStRiNg" 

// Example Output
// Output 1:
//  hELLO 

// Output 2:
//  ThIsIsAsTrInG 

// Example Explanation
// Explanation 1:
//  'H' changes to 'h'
//  'e' changes to 'E'
//  'l' changes to 'L'
//  'l' changes to 'L'
//  'o' changes to 'O'

// Explanation 2:
//  "tHiSiSaStRiNg" changes to "ThIsIsAsTrInG".

package Intermediate_DSA2.Strings.Java;

public class ToggleCase {
    public String toggle(String S) {
        char[] A = S.toCharArray();
        for (int i=0; i<A.length; i++) {
            A[i] ^= (1<<5);
        }
        return String.valueOf(A);
    }

    public static void main(String[] args) {
        String S = "Hello";
        ToggleCase obj = new ToggleCase();
        String result = obj.toggle(S);
        System.out.println(result);
    }
}
