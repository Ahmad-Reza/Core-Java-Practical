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
        Integer	number =	new Integer(55);//int
        Integer	number2 =	new Integer("55");//String
        Float	number3 =	new Float(55.0);//double	argument
        Float	number4 =	new Float(55.0f);//float	argument
        Float	number5 =	new Float("55.0f");//String
        Character	c1 =	new Character('C');//Only	char	constructor
        //Character	c2	=	new	Character(124);//COMPILER	ERROR
        Boolean	b =	new Boolean(true);
        //"true"	"True"	"tRUe"	- all	String	Values	give	True
        //Anything	else	gives	false
        Boolean	b1 =	new Boolean("true");//value	stored	- true
        Boolean	b2 =	new Boolean("True");//value	stored	- true
        Boolean	b3 =	new Boolean("False");//value	stored	- false
        Boolean	b4 =	new Boolean("SomeString");//value	stored	- false

        // another way to creating wrapper object.. 
        Integer wobj = Integer.valueOf("111", 2);
        System.out.println(wobj);
    }
}