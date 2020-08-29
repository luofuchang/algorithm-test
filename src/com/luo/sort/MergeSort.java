package com.luo.sort;

/**
 * @ClassName MergeSort
 * @Description 归并排序算法
 * 核心思想： 假设在已经部分有序的序列里面，通过交换这些局部有序序列的位置，让整体有序
 * @Author 86181
 * @Dtae 2020/8/26 14:46
 * @Version 1.0
 **/
public class MergeSort {

    /**
     * 该方法用来拆解原数组为一个个单一的元素
     */
    public static void mergeSortUp2Down(int[] array, int start, int end){

        if (start >= end){
            return;
        }
        // 把除法换成位运算
        int mid = (start + end) >> 1;
        // 分
        mergeSortUp2Down(array, start, mid);
        mergeSortUp2Down(array,mid+1, end);

        // 拆完后进入排序处理阶段
        merge(array, start, mid, end);
    }

    /**
     * 每一次进入该方法就代表一个小阶段的归并，需要一个临时数组存储排序的数据（不修改原始数组）
     * 归并完了可能还有一部分数据本身有序，把他们加入到临时数组后面，最后把归并的结果写回原数组。
     * @param array
     * @param start
     * @param mid
     * @param end
     */
    private static void merge(int[] array, int start, int mid, int end) {

        // 归并是两两对比，不是对比两个数，用i、j代表两组元素的第一个
        int i = start;
        int j = mid + 1;
        int index = 0;

        // 存储新排序的数据
        int[] tmp = new int[end-start +1];

        while (i <= mid && j <= end){
            if (array[j] <= array[i]){
                tmp[index++] = array[j++];
            }else {
                tmp[index++] = array[i++];
            }
        }

        //将左边剩余元素填充进temp中
        while (i <= mid){
            tmp[index++] = array[i++];
        }

        //将左边剩余元素填充进temp中
        while (j <= end){
            tmp[index++] = array[j++];
        }

        // 把现在的有序数据写回到原始 数组里面
        for (index = 0; index < tmp.length; index++) {
            array[start+index] = tmp[index];
        }
    }

}
