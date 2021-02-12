//package OOPs.Inheritence;
/**
 * Hierarchical Inheritance :
 *  - In Hierarchical Inheritance one class serves as a Super Class for more than one Sub Class
 * 
 */
class one2
{ 
    public void print_geek() 
    { 
        System.out.println("Geeks"); 
    } 
} 
  
class two2 extends one2 
{ 
    public void print_for() 
    { 
        System.out.println("for"); 
    } 
} 
  
class three1 extends one2 
{ 
    /*............*/
} 
public class HierarchicalInheritance {
    public static void main(String[] args) {
       three1 g = new three1(); 
        g.print_geek(); 
        two2 t = new two2(); 
        t.print_for(); 
        g.print_geek(); 
    }
}
// output : Geeks for Geeks in seperate line...
