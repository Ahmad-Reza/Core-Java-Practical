/**
 * wrapper class wraps around data type and returns object
 * there is eight wrapper class[Byte, Short, Integer, Double, String, Character, Long, Float]
 * primitive DT[used when you need efficiency]
 * wrapper class[used when you need object]
 * 
 * wrapper class Need..
 * 
 * Because Collection framework/Data structure works only with object
 * Generics don't allow using primitive DT as the Type Parameter.
 * Multithreding: need object to synchronization.
 * 
 */
import java.lang.*;

class WrapperExam{
    public static void main(String[] args)
    {
        Integer wobj = Integer.valueOf("111", 2);
        System.out.println(wobj);
    }
}