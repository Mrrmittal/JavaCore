/**
 * Author: Jatin Mittal
 * Date: 01-10-2024
 */

package src;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,20};
        int[] array2 = array;

        Integer a = 99;
        Integer b = a;
        b = 12;

        array2[3] = 99;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        System.out.println(a);
        System.out.println(b);
    }
}
