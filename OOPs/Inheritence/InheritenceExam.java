/**
 * Inheritence :
 * - its an important feature of OOP
 * - its the mechanism of inherit the features( variabls/field and methods) of another class
 * - Inheritence has three important termonology
 * - There is "extends" keyword to inherit supper/parent/base class
 *  a. Supper/Base/Parent Class
 *  b. Sub/child/derived/extended class
 *  c. Reusability
 * 
 * Example : suppose we have a Bicycle class has two fields "gear, speed" and two three methods 
 *           applyBreak, speedUp whic calculate the speed and third method is toString to print info of Bicycle 
 *           and we need a another class(MountainBike) which has all the features of Bicycle class and apart from Bicycle features its has features of seatHeight
 */
//Super Class
class Bicycle
{
    // this is instance variable
    int gear;
    int speed;  
    public Bicycle(int gear, int speed)
    {
        //here "this" keyword represent instance variable.
        this.gear = gear;
        this.speed = speed;
    }
    public void applyBreak(int decrement)
    {
        speed -= decrement;
    }
    public void speedUp(int inrement)
    {
        speed -= inrement;
    }
    //this method for print Bicycle information
    public String toString()
    {
        return ("gear:"+gear+"\n speed:"+speed);
    }
}

//this is the child/derived class
class MountainBike extends Bicycle
{
    int seatHeight;
    public MountainBike(int gear, int speed, int setHeight)
    {
        super(gear, speed); //this invoke base class(Bicycle) constructor
        this.seatHeight = setHeight;
    }
    //overring toString() method of Bicycle to print more info
    public String toString()
    {
        return (super.toString()+"\n seatHeight:"+seatHeight);       
    }

}
public class InheritenceExam {
    public static void main(String[] args) {
        //Here is the Object of child class which is Hold the whole fields and 
        //methods of child class as well parent class 
        MountainBike mb = new MountainBike(3, 100, 50);
        System.out.println(mb.toString());
    }
}
