package Intermediate_DSA1.prefix_sum_practice.Java;

public class EquilibriumIndex {
    public int index(int[] A) {
        int n = A.length;
        if(n == 1) {
            return 0;
        }

        int[] ps = new int[n];
        ps[0] = A[0];
        for(int i = 1; i < n; i++) {
            ps[i] = ps[i-1] + A[i];
        }

        for(int i = 0; i < n; i++) {
            int Sl = i == 0 ? 0 : ps[i - 1];
            int Sr = i == n - 1 ? 0 : ps[n-1] - ps[i];
            if(Sl == Sr){
                return i;
            }
        }

        return -1;
    }

    public int solve(int[] A) {
        int len = A.length;
        int sum_left = 0;
        int sum = 0;
        // find sum of all elements to check sum to right on fly
        for(int i = 0; i < len; i++) {
            sum += A[i];
        }

        for(int i = 0; i < len; i++) {
            int sL = sum_left;
            int sR = sum - sum_left - A[i];

            if(sL == sR) {
                return i;
            }

            sum_left += A[i];
        }
        return -1;
    }

    //Scalar
    public int solve2(int[] A) {
        long sum1 = 0;  
        for(int i = 0; i < A.length ; i++) 
            sum1 += A[i];
        long sum2 = 0;  // sum of elements at lower indexes
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < A.length ; i++){
            sum1 -= A[i];   // sum of elements at higher indexes
            if(sum1 == sum2){
                ans = i;
                break;
            }
            sum2 += A[i];
        }
        if(ans == Integer.MAX_VALUE)
            ans =- 1;   // If no equilibrium index found, then return -1
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        EquilibriumIndex obj = new EquilibriumIndex();
        int result = obj.index(A);
        if(result > 0) {
            System.out.println("Equilibrium Index: " + result);
        } else {
            System.out.println("There are no equilibrium index: " + result);
        }
    }
}
