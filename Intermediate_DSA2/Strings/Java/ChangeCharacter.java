// Problem Description
// You are given a string A of size N consisting of lowercase alphabets.
// You can change at most B characters in the given string to any other
// lowercase alphabet such that the number of distinct characters in the string is minimized.
// Find the minimum number of distinct characters in the resulting string.

// Problem Constraints
// 1 <= N <= 100000
// 0 <= B <= N

// Input Format
// The first argument is a string A.
// The second argument is an integer B.

// Output Format
// Return an integer denoting the minimum number of distinct characters in the string.

// Example Input
// A = "abcabbccd"
// B = 3

// Example Output
// 2

// Example Explanation
// We can change both 'a' and one 'd' into 'b'.So the new string becomes "bbcbbbccb".
// So the minimum number of distinct character will be 2.

package Intermediate_DSA2.Strings.Java;

import java.util.ArrayList;
import java.util.Collections;

public class ChangeCharacter {
    public int solve(String A, int B) {
        int cnt[] = new int[26];
        for(int i = 0; i < A.length(); ++i){
            ++cnt[A.charAt(i)-'a'];

        }
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i = 0; i < 26; ++i){
            if(cnt[i] > 0){
                C.add(cnt[i]);
            }
        }
        Collections.sort(C);
        for(int i = 0; i < C.size(); ++i){
            B -= C.get(i);
            if(B < 0){
                return C.size() - i;
            }
        }
        return 1;
    }

     public int solve2(String A, int B) {

        int [] freq = new int[26];

        //freq map
        for(int i = 0; i< A.length();i++) {
            int index = Math.abs('a' - A.charAt(i));
            freq[index]++;
        }

        for(int i = 1; i <= B;i++) {

            int min = Integer.MAX_VALUE;
            for(int j = 0; j < 26;j++) {
                if(freq[j] > 0) {
                    min = Math.min(min, freq[j]);
                }
            }

            for(int j = 0; j < 26;j++) {
                if(min == freq[j]) {
                    freq[j]--;
                    break;
                }
            }
        }

        int ans  = 0;
        for( int i = 0; i< 26;i++) {
            if(freq[i] > 0) {
                ans++;
            }
        }

        return ans == 0 ? 1 : ans;

    }

    public static void main(String[] args) {
        String A = "abcabbccd";
        ChangeCharacter obj = new ChangeCharacter();
        int result = obj.solve(A, 3);
        System.out.println(result);
    }
}
