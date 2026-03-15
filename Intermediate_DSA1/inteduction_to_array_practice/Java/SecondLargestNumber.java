package Java;

public class SecondLargestNumber {
    public int solve(int[] A) {
        final int inf = (int)(1e9);
        int firstLargestNumber = -inf;
        int secondLagrgestNumber = firstLargestNumber + 1;
        int len = A.length;

        for(int i = 0; i < len; i++) {
            if (A[i] > firstLargestNumber) {
                secondLagrgestNumber = firstLargestNumber;
                firstLargestNumber = A[i];
            } else if ((A[i] > secondLagrgestNumber) && A[i] != firstLargestNumber) {
                secondLagrgestNumber = A[i];
            }
        }
        if (secondLagrgestNumber == -inf) {
            return -1;
        }
        return secondLagrgestNumber;
    }

    public static void main(String[] args) {
        int[] A = new int[]{2, 1, 2};
        SecondLargestNumber obj = new SecondLargestNumber();
        int ans = obj.solve(A);
        System.err.println("The second largest number is: " + ans);
    }
}
