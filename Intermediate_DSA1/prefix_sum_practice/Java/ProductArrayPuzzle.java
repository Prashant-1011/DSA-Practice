// Given an array of integers A, find and return the product array of the same size where the ith element of the product array
// will be equal to the product of all the elements divided by the ith element of the array.
// Note: It is always possible to form the product array with integer (32 bit) values.
// Solve it without using the division operator.

// Input Format
// The only argument given is the integer array A.
// Output Format

// Return the product array.
// Constraints
// 2 <= length of the array <= 1000
// 1 <= A[i] <= 10
// For Example

// Input 1:
// A = [1, 2, 3, 4, 5]
// Output 1:
//[120, 60, 40, 30, 24]

// Input 2:
//A = [5, 1, 10, 1]
// Output 2:
//[10, 50, 5, 50]

package Intermediate_DSA1.prefix_sum_practice.Java;

import java.util.Arrays;

public class ProductArrayPuzzle {
    public int[] productArray(int[] A) {
        int n = A.length;
        int[] productArray = new int[n];
        int totalProduct = 1;
        //Finding total product of the array
        for(int i = 0; i < n; i++) {
            if (A[i] == 0) {
                totalProduct = 0;
                break;
            }
            totalProduct *= A[i];
        }

        if (totalProduct == 0) {
            Arrays.fill(productArray, 0);
            return productArray;
        }

        //Finding the product array
        productArray[0] = totalProduct / A[0];
        for(int i = 1; i < n; i++) {
            productArray[i] = totalProduct / A[i];
        }

        return productArray;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        ProductArrayPuzzle obj = new ProductArrayPuzzle();
        int[] result = obj.productArray(A);
        System.out.println("Product array for the give array: " + Arrays.toString(result));
     }
}
