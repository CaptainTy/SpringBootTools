package com.tionsy.springbootcomponents;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author tianyun
 * @version 1.0
 * @date Created in 2020年08月24日 15:30
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringbootComponentsApplication.class)
public class TestCalc4GuiBing {

    @Test
    public void test1(){
        int arr[] = {9,6,7,8,1,2,3,4};
        int temp[] = new int[arr.length];//新建一个临时数组存放
        mergeSort(arr,0,arr.length-1,temp);
        Arrays.stream(arr).forEach(System.out::print);
    }

    private void mergeSort(int[] arr, int low, int high, int[] temp) {
        if (low>=high)
            return;

       int mid = (low+high)/2;
       mergeSort(arr,low,mid,temp); //对左边序列进行归并排序
       mergeSort(arr,mid+1,high,temp);//对右边序列进行归并排序
       merge(arr,low,mid,high,temp);//合并两个有序序列

    }

    private void merge(int[] arr, int low, int mid, int high, int[] temp) {
        int i = 0;
        int j = low;
        int k = mid + 1; //左边序列和右边序列起始索引
        while (j <= mid && k <= high) {
            if (arr[j] < arr[k]) {
                temp[i++] = arr[j++];
            } else {
                temp[i++] = arr[k++];
            }
        }
        //若左边序列还有剩余，则将其全部拷贝进tmp[]中
        while (j <= mid) {
            temp[i++] = arr[j++];
        }
        while (k <= high) {
            temp[i++] = arr[k++];
        }
        // 将temp中的数组拷贝回arr[]
        for (int t = 0; t < i; t++) {
            arr[low + t] = temp[t];
        }
    }
}
