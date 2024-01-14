package src.CollectionFramwork.List.Arraylist;

import java.util.ArrayList;

public class SearchForAnElement {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(123);
        arrayList.add(143);
        arrayList.add(1243);
        arrayList.add(234);
        arrayList.add(24);
        arrayList.add(2423);
        arrayList.add(2434);

        if(arrayList.contains(456)){
            System.out.println("Has an element");
        }
        else{
            System.out.println("Not Found");
        }

    }
}
