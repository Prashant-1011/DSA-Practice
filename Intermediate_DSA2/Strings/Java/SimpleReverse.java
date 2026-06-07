// Problem Description
// Given a string A, you are asked to reverse the string and return the reversed string.

// Problem Constraints
// 1 <= |A| <= 105
// String A consist only of lowercase characters.

// Input Format
// First and only argument is a string A.

// Output Format
// Return a string denoting the reversed string.

// Example Input
// Input 1:
//  A = "scaler"

// Input 2:
//  A = "academy"

// Example Output
// Output 1:
//  "relacs"

// Output 2:
//  "ymedaca"

// Example Explanation
// Explanation 1:
//  Reverse the given string.

package Intermediate_DSA2.Strings.Java;

public class SimpleReverse {
    public String reverse(String S) {
        char[] charArr = S.toCharArray();

        int i = 0, j = charArr.length-1;
        while  (i < j) {
            char temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;
            i++;
            j--;
        }

        return String.valueOf(charArr);
    }

    public static void main(String[] args) {
         String S = "scaler";
         SimpleReverse obj = new SimpleReverse();
         String result = obj.reverse(S);
         System.out.println(result);
    }
}
