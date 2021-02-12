//package OOPs.Inheritence;
/**
 * Multiple Inheritance :
 *  - In Multiple Inheritance one Sub Class have more than one Super Class
 *  - and Inherit features from all super class
 *  - Java does not support Multiple Inheritance with classes.
 *  - we acheive Multiple Inheritance only  through Interfaces.
 * 
 */
interface one 
{ 
    public void print_geek(); 
} 
   
interface two 
{ 
    public void print_for(); 
} 

interface three2 extends one,two 
{ 
    public void print_geek(); 
} 
class child implements three2 
{ 
    @Override
    public void print_geek() { 
        System.out.println("Geeks"); 
    } 
   
    public void print_for() 
    { 
        System.out.println("for"); 
    } 
} 
// Derived Class...
public class MultipleInheritance {
    public static void main(String[] args) {
        child c = new child(); 
        c.print_geek(); 
        c.print_for(); 
        c.print_geek(); 
    }
}
// output : Geeks for Geeks in seperate line...