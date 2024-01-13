package src.ObjectClass.HashCode;

public class DiffObjectSameHashCode {
    /*
    Que: Que arise is different Object can have similar hashCode.
    Que: How Collection can Occur in hashCode().
    Sol: Yes, different Object can have the Similar hashCode. Because as we Know hashCode provide int value id number
         to an Object. That isn't be Unique.


         For Eg: Lets Suppose we have 2 piece of paper written A and B. So, we Store these paper in buckets. Then
                 we start to put A value paper in Bucket 1 and Paper B in Bucket number 2.

                 then we found a paper written ALEX then its hashCode() Will be:
                 Key = ALEX
                 HashCode Algo. = A(1) + L(12) + E(5) + X(24) = 42
                 HashCode = 42.

                 And if when we found Written DIRK then its hashCode will be Same as per the ALEX then Bucket of
                 Store paper also will be same. (42 number bucket)

                 Let Suppose if this same algorithm named paper Comes 40 to 50 time with different key Value.
                 Then if my manager ask paper with the Key value ALEX. So we will the Bucket number 42. But in this
                 Bucket there are 40 to 50 different key value paper.

                 Then a situation of Collision occur with me to check every paper in search of getting actual paper.

     */
}
