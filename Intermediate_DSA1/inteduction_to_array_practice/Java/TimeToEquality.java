// Problem Description
// Given an integer array A of size N. 
// In one second, you can increase the value of one element by 1.
// Find the minimum time in seconds to make all elements of the array equal.

// Problem Constraints
// 1 <= N <= 1000000
// 1 <= A[i] <= 1000

// Input Format
// First argument is an integer array A.

// Output Format
// Return an integer denoting the minimum time to make all elements equal.

// Example Input
// A = [2, 4, 1, 3, 2]

// Example Output
// 8

// Example Explanation
// We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.

package Java;

public class TimeToEquality {
    public int equality(int[] A) {
        final int inf = (int)(1e9);
        int mn = -inf;
        int count = 0;

        //First finding the max emlement
        for(int i = 0; i < A.length - 1; i++){
            if(A[i] > mn) {
                mn = A[i];
            }
        }

        //Finding the seconds required for the equality
        for(int i = 0; i < A.length; i++) {
            if(A[i] == mn) {
                continue;
            }
            count += mn - A[i];
        }

        return count;
    }

    public static void main(String[] args) {
        int[] A = {2, 4, 1, 3, 2};
        TimeToEquality obj = new TimeToEquality();
        int result = obj.equality(A);
        System.out.println("Time required for the equality: " + result);
    }
}
