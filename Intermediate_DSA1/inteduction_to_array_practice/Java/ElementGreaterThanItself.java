package Java;
// A = [3, 1, 2]
public class ElementGreaterThanItself {
    public int solve(int[] A) {
        int n = A.length;
        final int inf = (int)(1e9);
        int maxElement = -inf;
        int count = 0;
        for(int i = 0; i < n; i++){
            if (A[i] > maxElement) {
                maxElement = A[i];
                count = 1;
            } else if (maxElement == A[i]) {
                count += 1;
            }
        }
        return n - count;
    }

    public static void main(String[] args) {
        int[] A = new int[]{3, 1, 2, 3, 4};
        ElementGreaterThanItself obj = new ElementGreaterThanItself();
        int ans = obj.solve(A);
        System.err.println("Count: " + ans);
    }
}
