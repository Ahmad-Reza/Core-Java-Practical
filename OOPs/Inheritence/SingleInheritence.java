/**
 * Single Inheritence :
 *  - in this inheritence Sub class inherit one Super CLass

 */
//super/parent class
class one 
{ 
    public void print_geek() 
    { 
        System.out.println("Geeks"); 
    } 
} 
// child/sub/derived class 
class two extends one 
{ 
    public void print_for() 
    { 
        System.out.println("for"); 
    } 
} 
public class SingleInheritence
{
    public static void main(String[] args) {
        two g = new two(); 
        g.print_geek(); 
        g.print_for(); 
        g.print_geek(); 
    }
}
// output : Geeks for Geeks in seperate line...