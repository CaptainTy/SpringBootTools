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
 * @date Created in 2020年08月26日 08:52
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringbootComponentsApplication.class)
public class TestCalc2 {

    /**
     * 给定一个数组，将0移动到数组的末尾，并且保证非零元素的相对位置不变
     * 1.在原数组上操作
     * 2.尽量减少操作的次数
     */
    @Test
    public void test1(){
        int[] arr = {0,1,2,0,3,4};
        int[] zeros = this.moveZeros(arr);
        Arrays.stream(zeros).forEach(System.out::print);
    }

    public int[] moveZeros(int [] arr) {
        int j = 0; //非零元素位置的指针
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                if (i!=j) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
                j++; //把非零元素移动到j位置后，j往前+1
            }
        }
        return arr;
    }

    public int[] moveZeros2(int [] arr) {
        int j = 0; //指向非零元素的位置
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                arr[j] = arr[i];
                if (i!=j){
                    arr[i]=0;
                }
                j++;
            }
        }

        return arr;
    }

}
