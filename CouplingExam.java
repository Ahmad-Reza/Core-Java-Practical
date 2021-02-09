/**
 * coupling : 
 * -> measure of how much a class depends on another class
 * ->
 */

//1.) tight coupling
//tight coupling means the two classes often change together
//ex:If you want to change the skin, you would also have to change the design of your body as well
// because the two are joined together – they are tightly coupled. 
//The best example of tight coupling is RMI(Remote Method Invocation).
class Volume{
    int result;
    Volume(int length, int breath, int hight)
    {
        this.result = length*breath*hight;
    }

}

//2.) loose coupling
//loose coupling means they(two class) are mostly indepdent
// ex:If you change your shirt, then you are not forced to change your body.
// when you can do that, then you have loose coupling. When you can’t do that, then you have tight coupling.
// The examples of Loose coupling are Interface, JMS.
final class Box
{
    int volume;
    Box(int length, int breath, int hight)
    {
        this.volume = length*breath*hight;
    }
    int getResult()
    {
        return volume;
    }
}
public class CouplingExam {
    
    public static void main(String[] args)
    {
        //tight couplig
        Volume v1 = new Volume(6,7,8);        
        System.out.println(v1.result); 
       
        //loosely couplig
        Box b1 = new Box(8, 8, 10);
        System.out.println(b1.getResult());
    }
}
