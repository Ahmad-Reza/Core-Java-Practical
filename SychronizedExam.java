/**
 * sychronized( also means thread safe)
 * why we want to make our program thread safe..
 * --Because when we call the two thread at the same time for same method then
 *   there maybe collosion in both thread. due to collosion we will get everytime diffr-diffr value 
 */

public class SychronizedExam {

    int count;
    //you have to use "synchronized" for thread safe/synchronized...

    public synchronized void increment()
    {
        count++;
    }
    public static void main(String[] args) throws Exception{
        SychronizedExam sobj = new SychronizedExam();
        Thread t1 = new Thread(new Runnable(){
            public void run()
            {
                for(int i=1; i<1000; i++)
                    sobj.increment();
            }
        });

        Thread t2 = new Thread(new Runnable(){
            public void run()
            {
                for(int i=1; i<1000; i++)
                    sobj.increment();
            }
        });
        t1.start();        
        t2.start();
        
        t1.join();  
        t2.join();
       
        //program should be run 2000 times but its not run. 
        //its gives diffrent-different output untill you not synchronized "increment" method
        System.out.println("count:"+sobj.count);
    }
    
}
