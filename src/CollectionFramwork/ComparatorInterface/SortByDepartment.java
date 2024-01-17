package src.CollectionFramwork.ComparatorInterface;

import src.CollectionFramwork.ComparableInterface.Employees;

import java.util.Comparator;

public class SortByDepartment implements Comparator<Employees> {

    @Override
    public int compare(Employees obj1, Employees obj2 ){
        return obj1.getDepartment().compareTo(obj2.getDepartment());
    }
}
