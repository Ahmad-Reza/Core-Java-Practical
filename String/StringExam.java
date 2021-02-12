/**
 * stirngs
 * immutable: string object once created can not be modified.. 
 */

public class StringExam {
    public static void main(String[] args) {
        //immutable: string object once created can not be modified.. 
        //string object created in heap(which is not reusable)
        String str1 = new String("value");
        str1.concat("value2");
        System.out.println(str1); //output will come "value" bcoz refrence is also immutable.

     
        //the value will be stored in String Constant pool(which is reusable)
            // 1.) muttable
            // 2.) threadsafe
            // 3.) Not-efficient consume lots of when you concat two string in loop.
        String str2 = "value4"; 
        str2 = str2.concat("value2");
        System.out.println(str2); //o/p- value4value2

        // StringBuffer objects are not immutable...
            // 1.) muttable
            // 2.) threadsafe
            // 3.) efficient compare to string

        StringBuffer str3 = new StringBuffer("value3");
        str3.append("mango");
        System.out.println(str3);

        // StringBuilder objects are not immutable...
            // 1.) muttable
            // 2.) Not threadsafe
            // 3.) efficient compare to StringBuffer and string
        StringBuilder sb =new StringBuilder("apple");
        sb.append("orange");
        System.out.println(sb);

        //most usable String methods...
            String	str	=	"abcdefghijk";
            //char	charAt(int paramInt)
            System.out.println(str.charAt(2));	//- c
            System.out.println("ABCDEFGH".length());  //8
            System.out.println("abcdefghij".toString());	//abcdefghij
            System.out.println("ABC".equalsIgnoreCase("abc"));  //true
            System.out.println("abcdefghij".substring(3));	//cdefghij
            System.out.println("abcdefghij".substring(3,7));	//defg
    }
    
}
