// Problem Description
// Given an integer array A of size N, find the first repeating element in it.
// We need to find the element that occurs more than once and whose index of the
// first occurrence is the smallest.
// If there is no repeating element, return -1.

// Problem Constraints
// 1 <= N <= 105
// 1 <= A[i] <= 109

// Input Format
// The first and only argument is an integer array A of size N.

// Output Format
// Return an integer denoting the first repeating element.

// Example Input
// Input 1:
//  A = [10, 5, 3, 4, 3, 5, 6]

// Input 2:
//  A = [6, 10, 5, 4, 9, 120]

// Example Output
// Output 1:
//  5

// Output 2:
//  -1

// Example Explanation
// Explanation 1:
//  5 is the first element that repeats

// Explanation 2:
//  There is no repeating element, output -1

package Intermediate_DSA2.Hashing_1.Java;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstRepeatingElement {
    public int reapitingElement(int[] A) {
        int len = A.length;
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < len; i++) {
            if (myMap.containsKey(A[i])) {
                if (myMap.get(A[i]) < ans) {
                    ans = myMap.get(A[i]);
                }
            } else {
                myMap.put(A[i], 1);
            }
        }

        if (ans == Integer.MAX_VALUE) {
            return -1;
        } else {
            return A[ans];
        }
    }

    //scale
    public int solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> vis = new HashMap<Integer, Integer>();
        int ans = -1;
        for(int i = A.size()-1; i >= 0; --i){
            if(vis.containsKey(A.get(i))){
                ans = A.get(i);
            }
            else{
                vis.put(A.get(i), 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {6, 10, 5, 4, 9, 120};
        FirstRepeatingElement obj = new FirstRepeatingElement();
        int result = obj.reapitingElement(A);
        System.out.println(result);
    }
}
