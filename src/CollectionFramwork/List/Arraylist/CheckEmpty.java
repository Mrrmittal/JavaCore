package src.CollectionFramwork.List.Arraylist;

import java.util.ArrayList;

public class CheckEmpty {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();

        a1.add("Hello");
        a1.add("Hii");
        a1.add("Bye");
        a1.add("Smile");
        a1.add("Cry");
        a1.add("Dance");

        if(!a1.isEmpty()){
            a1.remove(a1);
            System.out.println("Has been Empty");
        }
        else{
            System.out.println("Already Empty");
        }
    }

}
