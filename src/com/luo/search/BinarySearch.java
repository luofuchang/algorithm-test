package com.luo.search;

import java.util.EmptyStackException;

/**
 * @ClassName BinarySearch
 * @Description 二分查找算法
 * @Author 86181
 * @Dtae 2020/8/29 10:23
 * @Version 1.0
 **/
public class BinarySearch {

    public static int binarySearch(int[] array, int key){

        // 数组开始标记
        int start = 0;
        // 数组结束标记
        int end = array.length -1;

        while (start <= end){
            //数组中间值标记. (end + start) / 2可能会造成整形溢出问题
            int mid = (end -start) / 2 + start;
            if (key < array[mid]){
                end = mid - 1;
            }else if (key > array[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }

        return -1;
    }
}
