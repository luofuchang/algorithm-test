package com.luo.sort;

/**
 * @ClassName SelectSort
 * @Description 选择排序
 * 在数组里面选择最小的，放到第一位，循环往复。
 * @Author 86181
 * @Dtae 2020/8/28 18:01
 * @Version 1.0
 **/
public class SelectSort {

    public static void selectSort(int[] array){

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int min = i;
                if (array[j] < array[min]){
                    array[i] ^= array[j];
                    array[j] ^= array[i];
                    array[i] ^= array[j];
                }
            }
        }
    }
}
