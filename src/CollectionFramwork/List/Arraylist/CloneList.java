package src.CollectionFramwork.List.Arraylist;

import java.util.ArrayList;

public class CloneList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);

        System.out.println("List is : " +arrayList);

        ArrayList arrayList1 =(ArrayList)arrayList.clone();
        System.out.println("Cloned List : " +arrayList1);
    }
}
