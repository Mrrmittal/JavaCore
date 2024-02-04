package src.CodinngPractice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteAnElement {

    public int[] removeElement(int[] array, int element){
        int[] array2 = new int[array.length - 1];
        int index = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] != element){
                array2[index] = array[i];
                index++;
            }
        }
        return array2;
    }

    public static void main(String[] args) {
        DeleteAnElement obj = new DeleteAnElement();
        int[] array = {10,20,30,40,50,60,70,80,90,100};
        System.out.println("Original Array is : " + Arrays.toString(array));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an element you want to remove : ");
        int element = sc.nextInt();
        int[] newArray =  obj.removeElement(array,element);
        System.out.println("Your new array : " +Arrays.toString(newArray));
    }
}
