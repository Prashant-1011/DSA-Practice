package Java;
public class SumOfMinMaxElement {
    public int solve(int[] A) {
        final int inf = (int)(1e9);
        int mn = inf , mx = -inf;
        for(int i = 0 ; i < A.length ; i++){
            mn = Math.min(mn , A[i]);
            mx = Math.max(mx , A[i]);
        }
        return mn + mx;
    }

    public static void main(String[] args) {
        // correct array initialization syntax in Java
        // int A[] = new int[]{-2, 1, -4, 5, 3};
        // int[] A = new int[]{-2, 1, -4, 5, 3};
        int[] A = {-2, 1, -4, 5, 3};
        SumOfMinMaxElement obj = new SumOfMinMaxElement();
        int answer = obj.solve(A);
        System.out.print("sum of min and max = " + answer);
    }
}