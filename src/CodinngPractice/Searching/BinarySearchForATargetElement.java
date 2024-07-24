package src.CodinngPractice.Searching;

import src.CodinngPractice.Recurssion.BinarySearchForAnTargetIndex;

public class BinarySearchForATargetElement {

    public int getIndex(int num[], int target){

        int start = 0;
        int end = num.length -1;

        while (start <= end){
            int mid = start + (end-start)/2;

            if(target == num[mid]){
                return mid;
            }

            else if (target > num[mid]) {
                start = mid +1;
            }

            else if (target < num[mid]) {
                end = mid - 1;
            }
        }

        return -1;
    }



    public static void main(String[] args) {
        BinarySearchForATargetElement obj = new BinarySearchForATargetElement();
        int num[] = {0,3,4,5,7,8,9,10,15};
        int target = 0;
        System.out.println(obj.getIndex(num, target));
    }
}
