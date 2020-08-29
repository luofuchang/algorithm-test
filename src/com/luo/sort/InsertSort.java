package com.luo.sort;

/**
 * @ClassName InsertSort
 * @Description 插入排序算法
 * 每次都将当前元素插入到左边已经排序的数组中，使得插入之后的左侧数组有序
 * @Author 86181
 * @Dtae 2020/8/27 15:06
 * @Version 1.0
 **/
public class InsertSort {

    public static void insertSort(int[] array){
        int n = array.length;
        for (int i = 1; i < n; i++) {
            // 为了将当前元素插入到已经排序的数组需要从后往前遍历
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]){
                    array[j] ^= array[j-1];
                    array[j-1] ^= array[j];
                    array[j] ^= array[j-1];
                }else {
                    continue;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {3,6,8,2,9,0};
        insertSort(array);
        for (int i : array) {
            System.out.print(i+",");
        }
    }
}
