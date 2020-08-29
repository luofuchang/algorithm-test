package com.luo.sort;

/**
 * @ClassName BubbleSort
 * @Description 冒泡排序（优化版本）
 * 冒泡排序的特点是从右往前逐渐有序
 * @Author 86181
 * @Dtae 2020/8/28 17:54
 * @Version 1.0
 **/
public class BubbleSort {

    public static void bubbleSort(int[] array){
        int sortBorder = array.length - 1;
        int lastIndex = 0;

        for (int i = 0; i < array.length; i++) {

            boolean isSorted = true;

            for (int j = 0; j < sortBorder; j++) {
                if (array[j] > array[j+1]){
                    array[j] ^= array[j+1];
                    array[j+1] ^= array[j];
                    array[j] ^= array[j+1];

                    isSorted = false;
                    lastIndex = j;
                }
            }

            sortBorder = lastIndex;

            if (isSorted){
                break;
            }
        }
    }
}
