public class ZigZagArray {
    public static void zigzagArray(int[] arr) {
        boolean isLess = true;
        for (int i = 1; i < arr.length - 1; i++) {
            if ((isLess && arr[i] > arr[i + 1]) || (!isLess && arr[i] < arr[i + 1])) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            isLess = !isLess;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 8, 6, 2, 1};
        zigzagArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}