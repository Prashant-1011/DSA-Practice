// Problem Description
// Some organizes a series of contests aimed at helping learners enhance their coding skills.
// Each learner can participate in multiple contests,
// and their participation is represented by integers in an array.
// The goal is to identify how frequently each learner has participated in these contests.
// This information will help SCALER determine which learners are participating the least,
// allowing them to provide targeted support and encouragement.
// Given an array A that represents the participants of various contests,
// where each integer corresponds to a specific learner,
// and an array B containing the learners for whom you want to check participation frequency,
// your task is to find the frequency of each learner from array B in the array A and return
// a list containing all these frequencies

// Problem Constraints
// 1 <= |A| <= 105
// 1 <= |B| <= 105
// 1 <= A[i] <= 105
// 1 <= B[i] <= 105

// Input Format
// First argument A is an array of integers.
// Second argument B is an array of integers denoting the queries.

// Output Format
// Return an array of integers containing the frequency of each learner in B as found in array A.

// Example Input
// Input 1:
// A = [1, 2, 1, 1]
// B = [1, 2]

// Input 2:
// A = [2, 5, 9, 2, 8]
// B = [3, 2]

// Example Output
// Output 1:
// [3, 1]

// Output 2:
// [0, 2]

// Example Explanation
// For Input 1:
// The frequency of learner 1 in the array A is 3 (they participated in three contests).
// The frequency of learner 2 in the array A is 1 (they participated in one contest).

// For Input 2:
// The frequency of learner 3 in the array A is 0 (they did not participate in any contest).
// The frequency of learner 2 in the array A is 2 (they participated in two contests).

package Intermediate_DSA2.Hashing_1.Java;

import java.util.ArrayList;
import java.util.HashMap;

public class FrequencyOfElementQuery {
    public ArrayList<Integer> learnerFrequesncy(int[] A, int[] B) {
        int len = A.length;
        HashMap<Integer, Integer> myMap = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (myMap.containsKey(A[i])) {
                myMap.replace(A[i], myMap.get(A[i]) + 1);
            } else {
                myMap.put(A[i],1);
            }
        }

        for (int i = 0; i < B.length; i++) {
            res.add(myMap.getOrDefault(B[i], 0));
        }

        return res;
    }

    public static void main(String[] args) {
        int[] A = {2, 5, 9, 2, 8};
        int[] B = {3, 2};

        FrequencyOfElementQuery obj = new FrequencyOfElementQuery();
        ArrayList<Integer> result = obj.learnerFrequesncy(A, B);

        System.out.println("result" + result);
    }
}
