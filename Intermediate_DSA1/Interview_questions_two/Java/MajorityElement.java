// Given an array of size N, find the majority element.
// The majority element is the element that appears more than floor(n/2) times.
// You may assume that the array is non-empty and the majority element always exists in the array.

// Problem Constraints
// 1 <= N <= 5*105
// 1 <= num[i] <= 109

// Input Format
// Only argument is an integer array.

// Output Format
// Return an integer.

// Example Input
// Input 1:
// [2, 1, 2]

// Input 2:
// [1, 1, 1]

// Example Output
// Input 1:
// 2

// Input 2:
// 1

// Example Explanation
// For Input 1:
// 2 occurs 2 times which is greater than 3/2.

// For Input 2:
//  1 is the only element in the array, so it is majority

package Intermediate_DSA1.Interview_questions_two.Java;

public class MajorityElement {
    public int majorElement(int[] A) {
        int n = A.length;
        int frequency = 0;
        int currentME = -1;
        for (int i = 0; i < n; i++) {
            if (frequency == 0) {
                currentME = A[i];
                frequency = 1;
            } else if (A[i] == currentME) {
                frequency++;
            } else {
                frequency--;
            }
        }

        frequency = 0;
        for (int i=0; i<n; i++) {
            if (A[i] == currentME) {
                frequency++;
            }
        }
        if (frequency > Math.floor(n/2)) {
            return currentME;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 1, 1};
        MajorityElement obj = new MajorityElement();
        int result = obj.majorElement(A);
        System.out.println("Mejority Elelmenr: " + result);
    }
}
