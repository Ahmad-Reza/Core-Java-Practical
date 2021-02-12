/**
 * Multi Level Inheritence :
 *  - in Multi Level Inheritence sub/derived class inherit Base Class as weell
 *  - act as the Base Class for other Class. 
 */

// Base class
class one1
{ 
    public void print_geek() 
    { 
        System.out.println("Geeks"); 
    } 
} 
  
class two1 extends one1 
{ 
    public void print_for() 
    { 
        System.out.println("for"); 
    } 
} 
 
class three extends two1 
{ 
    public void print_geek() 
    { 
        System.out.println("Geeks"); 
    } 
} 
public class MultiLevelInheritence {
    public static void main(String[] args) {
        three g = new three(); 
        g.print_geek(); 
        g.print_for(); 
        g.print_geek(); 
    }
}
// output : Geeks for Geeks in seperate line...