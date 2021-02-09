/**
 * Casting :
 * conversion one data type to another data type
 * 
 */

public class CastingExam {

    public static void main(String[] args) {
        
        // 1. implicit casting "done by compiler"
            int value = 100;
            long v = value;
            System.out.println("implicit exam:"+v);

        // 1. explicit casting "done by code(which is write by us)"
            long value1 = 123445;
            int v1 = (int)value1;
            System.out.println("explicit exam:"+v1);
           
            int bigValue	=	3000; //
            byte small	=	(byte)	bigValue; //size=1 byte(-128 to +127)
            System.out.println(small);
    }
    
}
