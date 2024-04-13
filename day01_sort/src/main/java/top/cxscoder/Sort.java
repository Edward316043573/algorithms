package top.cxscoder;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Edward
 * @date 2024-04-12 0:37
 * @copyright Copyright (c) 2024 Edward
 */
public class Sort {
    public static void main(String[] args) {
        Sort sort = new Sort();
        Random random = new Random();
        int randomLength = random.nextInt(100);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("before sort:" + Arrays.toString(arr));
//        sort.bubbleSort(arr);
//        sort.selectSort(arr);
        sort.insertionSort(arr);
        System.out.println("after sort" + Arrays.toString(arr));
    }

    /**
     * BubbleSort
     */
    private void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * SelectionSort
     *
     * @param arr
     */
    private void SelectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // i ~ n-1 找到最小值 放到位置i
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
    }

    private void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                swap(arr, j, j - 1);
            }
        }
    }

    /**
     * a method to swap the position of two num
     *
     * @param arr
     * @param i
     * @param j
     */
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
