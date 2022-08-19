package Algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1, 2, 3, 8, -1}, 1));

    }

    public static int binarySearch(int[] a, int key) {
        int low = 0;
        int hight = a.length - 1;
        while (low <= hight) {
            int middle = low + (hight - low) / 2;
            if (key < a[middle]) {
                hight = middle - 1;
            } else if (key > a[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
