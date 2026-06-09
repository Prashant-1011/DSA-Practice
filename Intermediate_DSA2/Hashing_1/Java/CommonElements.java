// Problem Description
// Given two integer arrays, A and B of size N and M, respectively.
// Your task is to find all the common elements in both the array.

// NOTE:
// Each element in the result should appear as many times as it appears in both arrays.
// The result can be in any order.

// Problem Constraints
// 1 <= N, M <= 105
// 1 <= A[i] <= 109

// Input Format
// First argument is an integer array A of size N.
// Second argument is an integer array B of size M.

// Output Format
// Return an integer array denoting the common elements.

// Example Input
// Input 1:
//  A = [1, 2, 2, 1]
//  B = [2, 3, 1, 2]

// Input 2:
//  A = [2, 1, 4, 10]
//  B = [3, 6, 2, 10, 10]

// Example Output
// Output 1:
//  [1, 2, 2]

// Output 2:
//  [2, 10]

// Example Explanation
// Explanation 1:
//  Elements (1, 2, 2) appears in both the array. Note 2 appears twice in both the array.

// Explantion 2:
//  Elements (2, 10) appears in both the array.

package Intermediate_DSA2.Hashing_1.Java;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElements {
    public ArrayList<Integer> commonElements(int[] A, int[] B) {
        int lenA = A.length;
        int lenB = B.length;
        HashMap<Integer, Integer> mapA = new HashMap<>();
        HashMap<Integer, Integer> mapB = new HashMap<>();

        for (int num : A) {
            if (mapA.containsKey(num)) {
                mapA.replace(num, mapA.get(num)+1);
            } else {
                mapA.put(num, 1);
            }
        }

        for (int num : B) {
            if (mapB.containsKey(num)) {
                mapB.replace(num, mapB.get(num)+1);
            } else {
                mapB.put(num, 1);
            }
        }

        int n = lenA < lenB ? lenA : lenB;

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0 ; i < n; i++) {
            if (mapA.containsKey(A[i]) &&  mapB.containsKey(A[i])) {
                res.add(A[i]);
                if (mapA.get(A[i]) > 1 ) {
                    mapA.replace(A[i], mapA.get(A[i]) -1);
                } else {
                    mapA.remove(A[i]);
                }

                if (mapB.get(A[i]) > 1 ) {
                    mapB.replace(A[i], mapB.get(A[i])-1);
                } else {
                    mapB.remove(A[i]);
                }
            }
        }

        return res;
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int len1 = A.size();
        int len2 = B.size();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        //int ans = 0;

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < len1; i++) {
            if(hm.containsKey(A.get(i))) {
                hm.replace(A.get(i), hm.get(A.get(i)) + 1);
            }
            else {
                hm.put(A.get(i), 1);
            }
        }

        for(int i = 0; i < len2; i++) {
            if(hm.containsKey(B.get(i))) {
                if(hm.get(B.get(i)) > 0) {
                    ans.add(B.get(i));
                    hm.replace(B.get(i), hm.get(B.get(i)) - 1);
                }
            }
             
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = {2, 1, 4, 10};
        int[] B = {3, 6, 2, 10, 10};

        CommonElements obj = new CommonElements();
        ArrayList<Integer> result = obj.commonElements(A, B);

        System.out.println("Result: " + result);
    }
}
