// Problem Description
// Say you have an array A,
// for which the ith element is the price of a given stock on day i.
// If you were only permitted to complete at most one transaction
// (ie, buy one and sell one share of the stock), 
// design an algorithm to find the maximum profit.
// Return the maximum possible profit.

// Problem Constraints
// 0 <= A.size() <= 700000
// 1 <= A[i] <= 107

// Input Format
// The first and the only argument is an array of integers, A.

// Output Format
// Return an integer, representing the maximum possible profit.

// Example Input
// Input 1:
// A = [1, 2]

// Input 2:
// A = [1, 4, 5, 2, 4]

// Example Output
// Output 1:
// 1

// Output 2:
// 4

// Example Explanation
// Explanation 1:
// Buy the stock on day 0, and sell it on day 1.

// Explanation 2:
// Buy the stock on day 0, and sell it on day 2.

package Intermediate_DSA1.carry_forward_pracctice.Java;

public class BuySellStock {
    //My answer, will fail some use cases
    public int sellStockDay(int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        boolean foundBuyday = false;

        for (int item: A) {
            min = Math.min(min, item);
        }

        for(int i = 0; i < n; i++) {
            if (A[i] == min && foundBuyday == false) {
                foundBuyday = true;
            }

            if(foundBuyday && A[i] > max) {
                max = A[i];
            }
        }

        return max - min;
    }

    //Scalar
    public int maxProfit(final int[] A) {
        if(A.length == 0 || A.length == 1){
            return 0;
        }
        
        int max = A[A.length - 1];
        
        int profit = 0;
        for(int i = A.length - 2; i >= 0; i--){
            if(A[i] > max){
                max = A[i];
            }
            // max stores the maximum value to the right of A[i]
            profit = Math.max(profit, max - A[i]);
        }
        
        return profit;
    }

    public static void main(String[] args) {
        int[] A = {4, 5, 2, 4, 1};
        BuySellStock obj = new BuySellStock();
        int result = obj.maxProfit(A);
        System.out.println("Max Profit: " + result);
    }
}
