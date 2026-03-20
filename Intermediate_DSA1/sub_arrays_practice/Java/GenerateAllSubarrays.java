// Problem Description
// You are given an array A of N integers.
// Return a 2D array consisting of all the subarrays of the array
// Note : The order of the subarrays in the resulting 2D array does not matter.

// Problem Constraints
// 1 <= N <= 100
// 1 <= A[i] <= 105

// Input Format
// First argument A is an array of integers.

// Output Format
// Return a 2D array of integers in any order.

// Example Input
// Input 1:
// A = [1, 2, 3]

// Input 2:
// A = [5, 2, 1, 4]

// Example Output
// Output 1:
// [[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]

// Output 2:
// [[1 ], [1 4 ], [2 ], [2 1 ], [2 1 4 ], [4 ], [5 ], [5 2 ], [5 2 1 ], [5 2 1 4 ] ]

// Example Explanation
// For Input 1:
// All the subarrays of the array are returned. There are a total of 6 subarrays.
// For Input 2:
// All the subarrays of the array are returned. There are a total of 10 subarrays.

package Intermediate_DSA1.sub_arrays_practice.Java;
import java.util.ArrayList;

public class GenerateAllSubarrays {
    public ArrayList<ArrayList<Integer>> allSubarrays(int[] A) {
        int n = A.length;
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
        for (int L = 0; L < n; L++) {
            for (int R = L; R < n; R++) {
                ArrayList<Integer> subarray = new ArrayList<>();
                for (int k = L; k <= R; k++) {
                    subarray.add(A[k]);
                }
                resultList.add(subarray);
            }
        }

        return resultList;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        GenerateAllSubarrays obj = new GenerateAllSubarrays();
        ArrayList<ArrayList<Integer>> result = obj.allSubarrays(A);
        System.out.println("All subarrys: " + result);
    }
}
