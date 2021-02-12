/**
 * Objects :- java.lang package
 *  - Every class in java directly or indirectly derived from Object class
 *  - if a class does not extend/inherit any class then it is directly child class of Object class
 *  - Hence Object class acts as root inheritence hierarchy in any java program
 * 
 */
// Java program to demonstrate working of hasCode() 
class Student 
{ 
    int last_roll = 100;  
    int roll_no; 
  
    // Constructor 
    Student() 
    { 
        roll_no = last_roll; 
        last_roll++; 
    } 
  
    // Overriding hashCode() its neccessary 
    @Override
    public int hashCode() 
    { 
        return roll_no; 
    } 
}
//Demonstration of equals() method
class Complex { 
    private double re, im;     
      
    public Complex(double re, double im) { 
        this.re = re; 
        this.im = im; 
    } 
   
    @Override
    public boolean equals(Object o) { 
  
        // If the object is compared with itself then return true   
        if (o == this) { 
            return true; 
        } 
  
        /* Check if o is an instance of Complex or not 
          "null instanceof [type]" also returns false */
        if (!(o instanceof Complex)) { 
            return false; 
        } 
          
        // typecast o to Complex so that we can compare data members  
        Complex c = (Complex) o; 
          
        // Compare the data members and return accordingly  
        return Double.compare(re, c.re) == 0
                && Double.compare(im, c.im) == 0; 
    }
} 
public class ObjectClassMethod {
    public static void main(String[] args) {

        // a. toString() - method
        // - provides String representation of an object and used to convert an object to string
        // - default toString() method for class object returns a string consisting of the name of 
        // - the class of which the object is an instance, the at-sign character `@’, and the unsigned hexadecimal 
       
        ObjectClassMethod obm = new ObjectClassMethod();
        // Both print same output : ObjectClassMethod@33833882
        System.out.println(obm);
        System.out.println(obm.toString()); 

        // b. hashCode() - method
        // - for every object JVM creats a unique number which is Hashcode
        // - it returns distinct integer for distinct objects
        // - Hashcode is not equal to object adress 
        // - It convert the internal address of object to an integer by using an algorithm

        Student sobj = new Student();
        System.out.println(sobj); // output : Student@64 (note that 4*16^0 + 6*16^1 = 100)
        System.out.println(sobj.hashCode()); //output : 100

        // c. equals() :
        // comapre Object Instance (==)
        // compare Object value (equals method)

        Complex c1 = new Complex(10, 15); 
        Complex c2 = new Complex(10, 15); 
        
        if (c1 == c2) { 
            System.out.println("Equal "); 
        } else { 
            System.out.println("Not Equal "); 
        } 
        // output : Not Equal
        if (c1.equals(c2)) { 
            System.out.println("Equal "); 
        } else { 
            System.out.println("Not Equal "); 
        } 
        // output : Equal
    }

}
