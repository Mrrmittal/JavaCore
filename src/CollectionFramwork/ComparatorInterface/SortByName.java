package src.CollectionFramwork.ComparatorInterface;

import src.CollectionFramwork.ComparableInterface.Employees;

import java.util.Comparator;

class SortByName implements Comparator<Employees> {

    @Override
    public int compare(Employees obj1, Employees obj2) {
        return obj1.getName().compareTo(obj2.getName());
    }
}
