package src.CodinngPractice.Searching;

import src.CodinngPractice.Recurssion.BinarySearchForAnTargetIndex;

public class BinarySearchForATargetElement {

    public int returnIndex(int num[], int target){
        int output = 0;

        int start = 0;
        int end = num.length -1;

        while (start < end){
            int mid = start + (end-start)/2;

            if(target == num[mid]){
                output = num[mid];
            }

            else if (target > num[mid]) {
                start = mid +1;
            }

            else if (target < num[mid]) {
                end = mid - 1;
            }

            else {
                return -1;
            }
        }
        return output;
    }



    public static void main(String[] args) {
        BinarySearchForAnTargetIndex obj = new BinarySearchForAnTargetIndex();
        int num[] = {0,3,4,5,7,8,9,10,15};
        int target = 15;
        System.out.println(obj.returnIndex(num, target));
    }
}
