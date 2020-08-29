package com.luo.sort;

/**
 * @ClassName ShellSort
 * @Description 希尔排序算法
 * 基于插入排序，对于大规模的乱序数组排序速度较慢
 * 交换不相邻的元素以对数组的局部进行排序，并最终用插入排序将局部有序的数组排序
 * 对大型数座排序效率很高，不需要额外的内存空间
 * @Author 86181
 * @Dtae 2020/8/27 15:30
 * @Version 1.0
 **/
public class ShellSort {

    public static void shellSort(int[] array){
        int n = array.length;

        // 设置增量
        // 插入排序的增量式1，属于相邻元素比较，现在换成不相邻元素比较
        int h = 1;
        while (h < n / 3){
            h  = 3 * h + 1;
        }
        // 增量最小为1，也就是相邻两个元素比较
        while (h >= 1){
            // 对相聚h的两个元素使用插入排序
            for (int i = h; i < n; i++) {
                // j >= h, 如果j >= 0, 则array[j-h]越界
                for (int j = i; j >= h && less(array[j],array[j-h]) ; j-=h) {
                    exchange(array,j,j-h);
                }
            }
        }
    }

    public static void exchange(int[] array, int i, int j){
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static boolean less(Comparable v, Comparable w){
        // 若 v < w 则返回负数
        return v.compareTo(w) < 0;
    }
}
