// Problem Description
// You are given two lowercase strings A and B each of length N.
// Return 1 if they are anagrams to each other and 0 if not.
// Note : Two strings A and B are called anagrams to each other if A can be formed
// after rearranging the letters of B.

// Problem Constraints
// 1 <= N <= 105
// A and B are lowercase strings

// Input Format
// Both arguments A and B are a string.

// Output Format
// Return 1 if they are anagrams and 0 if not

// Example Input
// Input 1:
// A = "cat"
// B = "bat"

// Input 2:
// A = "secure"
// B = "rescue"

// Example Output
// Output 1:
// 0

// Output 2:
// 1

// Example Explanation
// For Input 1:
// The words cannot be rearranged to form the same word. So, they are not anagrams.

// For Input 2:
// They are an anagram.

package Intermediate_DSA2.Strings.Java;

public class CheckAnagrams {
    public int solve(String A, String B) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        if (A.length() != B.length()) {
            return 0;
        }

        for(int i = 0 ; i < A.length() ; i++){
            freq1[A.charAt(i) - 'a']++;
            freq2[B.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(freq1[i] != freq2[i]){
                return 0;
            }
        }
        return 1;
    }

    public int solve2(String A, String B) {
        int len = A.length();
        int ans = 0;
        
        if(len != B.length()) {
            return 0;
        }

        for(int i = 0; i < len; i++) {
            ans += (A.charAt(i) - 'a');
            ans -= (B.charAt(i) - 'a');
        }

        if(ans == 0) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        String A = "secure";
        String B = "rescue";

        CheckAnagrams obj = new CheckAnagrams();
        int result = obj.solve(A, B);
        System.out.println(result);
    }
}
