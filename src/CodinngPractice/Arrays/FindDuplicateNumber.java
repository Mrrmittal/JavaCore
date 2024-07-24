package src.CodinngPractice.Arrays;

//Write a program to return duplicate number of the given array.

import src.CodinngPractice.Recurssion.BinarySearchForAnTargetIndex;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumber {

    public int returnDuplicateNumber(int[] num){
        Set<Integer> set = new HashSet<>();

        for(int i : num){
            if(set.contains(i)){
                return i;
            }
            set.add(i);
        }

        return -1;
    }

    public static void main(String[] args) {
        FindDuplicateNumber obj = new FindDuplicateNumber();
        int num[] = {0,3,4,5,7,8,9,9,10,15};
        System.out.println(obj.returnDuplicateNumber(num));
    }
}
