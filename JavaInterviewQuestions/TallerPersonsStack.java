package JavaInterviewQuestions;

import java.util.*;
//Taller person in-front
class Pair {
    int value;
    int index;

    Pair(int v, int i) {
        value = v;
        index = i;
    }
}
public class TallerPersonsStack {

    // public static int[] countTaller(int[] arr) {
    //     int n = arr.length;
    //     int[] result = new int[n];

    //     Stack<Integer> stack = new Stack<>();

    //     for(int i = 0; i < n; i++) {

    //         while(!stack.isEmpty() && stack.peek() <= arr[i]) {
    //             stack.pop();
    //         }

    //         result[i] = stack.size();
    //         stack.push(arr[i]);
    //     }

    //     return result;
    // }

    // public static void main(String[] args) {
    //     int[] arr = {5,4,3,1,2,0};
    //     System.out.println(Arrays.toString(countTaller(arr)));
    // }

    public static void mergeSort(Pair[] arr, int left, int right, int[] result) {
        if (left >= right) return;

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid, result);
        mergeSort(arr, mid + 1, right, result);

        merge(arr, left, mid, right, result);
    }

    public static void merge(Pair[] arr, int left, int mid, int right, int[] result) {

        List<Pair> temp = new ArrayList<>();

        int i = left;
        int j = mid + 1;

        while (i <= mid && j <= right) {

            if (arr[i].value > arr[j].value) {
                result[arr[j].index] += (mid - i + 1);
                temp.add(arr[j++]);
            } else {
                temp.add(arr[i++]);
            }
        }

        while (i <= mid) temp.add(arr[i++]);
        while (j <= right) temp.add(arr[j++]);

        for (int k = left; k <= right; k++) {
            arr[k] = temp.get(k - left);
        }
    }

    public static int[] countTaller(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        Pair[] arr = new Pair[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(nums[i], i);
        }

        mergeSort(arr, 0, n - 1, result);

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {5,4,3,1,2};

        System.out.println(Arrays.toString(countTaller(arr)));
    }
}
