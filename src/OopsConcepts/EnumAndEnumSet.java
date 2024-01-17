package src.OopsConcepts;

import java.util.EnumSet;

public class EnumAndEnumSet {
    /*
    Enum : Enum is special class of java that store some constant variables that are unchanged and file.
    EnumSet : Special class that help to represent the variables of Enum class collection.
                Methods Included: allOf(), clone()
              There are not special constructor exists in EnumSet
     */
//    Declaration of an Enum
    public static void main(String[] args) {


        enum status {
            Active, Running, Paused
        }

//    How to get all variable of enum

        EnumSet enumSet = EnumSet.allOf(status.class);
        System.out.println(enumSet);
    }
}
