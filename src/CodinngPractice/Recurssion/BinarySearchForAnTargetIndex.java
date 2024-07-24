package src.CodinngPractice.Recurssion;

public class BinarySearchForAnTargetIndex {

    public int returnIndex(int[] num, int target){
        int start = 0;
        int end = num.length - 1;

        return getIndex(num,target,start,end);
    }



    public int getIndex(int[] num, int target, int start, int end){

        if(start > end){
            return -1;
        }

        int mid = start + (end - start)/2;

        if(target == num[mid]){
            return mid;
        }

        else if (target > num[mid]) {
            return getIndex(num,target,mid+1,end);
        }

        return getIndex(num,target,start,mid -1);

    }



    public static void main(String[] args) {
        BinarySearchForAnTargetIndex obj = new BinarySearchForAnTargetIndex();
        int num[] = {0,3,4,5,7,8,9,10,15};
        int target = 1;
        System.out.println(obj.returnIndex(num, target));
    }
}
