package com.luo.sort;

/**
 * @ClassName QuickSort
 * @Description 快速排序，属于分治算法
 * 与归并排序的区别： 无需对整体再一次排序
 * @Author 86181
 * @Dtae 2020/8/28 18:08
 * @Version 1.0
 **/
public class QuickSort {

    public static void quickSort(int[] array, int start, int end){
        if (end <= start){
            return;
        }

        int j = partition(array, start, end);

        quickSort(array,start,j-1);
        quickSort(array,j+1,end);
    }

    private static int partition(int[] array, int start, int end) {

        /*
         *  i, j 两个指针分别从左到右开始寻找第一个大于v的与第一个小于v的值
         */
        int i = start;
        int j = end+1;
        int v = array[start];

        while (true){
            // 找到第一个大于v的值与i
            while (less(array[++i],v)){
                if (i == end){
                    break;
                }
            }

            while (less(v,array[--j])){
                if (j == start){
                    break;
                }
            }

            if (i >= j){
                break;
            }

            exchange(array,i,j);
        }

        exchange(array,start,j);

        return j;
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
