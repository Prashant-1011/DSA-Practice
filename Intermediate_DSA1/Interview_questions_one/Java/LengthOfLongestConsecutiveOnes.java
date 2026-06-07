// Given a binary string A. It is allowed to do at most one swap between any 0 and 1.
// Find and return the length of the longest consecutive 1’s that can be achieved.

// Input Format
// The only argument given is string A.

// Output Format
// Return the length of the longest consecutive 1’s that can be achieved.

// Constraints
// 1 <= length of string <= 1000000
// A contains only characters 0 and 1.

// For Example
// Input 1:
//     A = "111000"
// Output 1:
//     3

// Input 2:
//     A = "111011101"
// Output 2:
//     7

package Intermediate_DSA1.Interview_questions_one.Java;

public class LengthOfLongestConsecutiveOnes {
    public int longestConsecutiveOnes(String A) {
        int n = A.length();

        int countOne = 0;
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '1') {
                countOne++;
            }
        }
        if (countOne == n) {
            return n;
        }
        int ans = 0;
        int L = 0;
        int R = 0;
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '0') {
                if (L == 0) {
                    for (int k = i-1; k >= 0; k--) {
                        if (A.charAt(k) == '1') {
                            L++;
                        } else {
                            break;
                        }
                    }
                } else {
                    L = R;
                }
                R = 0;
                for (int k = i+1; k < n; k++) {
                    if (A.charAt(k) == '1') {
                        R++;
                    } else {
                        break;
                    }
                }

                if (countOne > L+R) {
                    ans = Math.max(ans, R+L+1);
                } else {
                    ans = Math.max(ans, L+R);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        LengthOfLongestConsecutiveOnes obj = new LengthOfLongestConsecutiveOnes();
        
        // Test cases
        String[] testCases = {
            "111000",      // Expected: 3 (3 left, 0 right, 3 ones total -> 3 not > 3)
            "111011101",   // Expected: 7 (3 left, 3 right at pos 3, 7 ones total -> 7 > 6)
            "11111",       // Expected: 5 (all 1s, no zeros)
            "0",           // Expected: 0 (lone 0, no 1s to swap)
            "1",           // Expected: 1 (single 1)
            "10",          // Expected: 1 (1 left, 0 right, 1 one total -> 1 not > 1)
            "01",          // Expected: 1 (0 left, 1 right, 1 one total -> 1 not > 1)
            "1011101",     // Expected: 5 (4 left, 0 right at pos 5, 6 ones -> 6 > 4)
            "101",         // Expected: 2 (1 left, 1 right at pos 1, 2 ones -> 2 not > 2)
            "11011",       // Expected: 4 (2 left, 2 right at pos 2, 4 ones -> 4 not > 4)
            "10101",       // Expected: 2 (1 left, 1 right, 3 ones -> 3 > 2, pick max)
            "1110111",     // Expected: 6 (3 left, 3 right at pos 3, 6 ones -> 6 not > 6)
            "0000",        // Expected: 0 (all zeros, no 1s)
            "11100111"     // Expected: 5 (3 left, 3 right at pos 3, 6 ones -> 6 > 6)
        };
        
        int[] expected = {3, 7, 5, 0, 1, 1, 1, 5, 2, 4, 3, 6, 0, 4};
        
        System.out.println("Testing LengthOfLongestConsecutiveOnes:");
        System.out.println("==========================================");
        
        int passed = 0;
        int failed = 0;
        
        for (int i = 0; i < testCases.length; i++) {
            int result = obj.longestConsecutiveOnes(testCases[i]);
            boolean isPass = result == expected[i];
            String status = isPass ? "✓ PASS" : "✗ FAIL";
            
            System.out.println(status + " | Input: \"" + testCases[i] + "\" | Expected: " + expected[i] + " | Got: " + result);
            
            if (isPass) {
                passed++;
            } else {
                failed++;
            }
        }
        
        System.out.println("==========================================");
        System.out.println("Results: " + passed + " passed, " + failed + " failed out of " + testCases.length + " tests");
    }
}
