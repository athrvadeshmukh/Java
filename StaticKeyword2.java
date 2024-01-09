class Demo
    {

    
        static void disp1()
        {
            System.out.println("Static disp 1");
        }
        void disp2()
        {
            System.out.println("Non Static disp 2");
        }
    }
public class StaticKeyword2 
{
    
    public static void main(String[] args)
    {
        Demo.disp1();
        // Demo.disp(); it is invalid because it is non static
       
        // creating object
        Demo d1 = new Demo();
        d1.disp1(); // not required but you can write it also like this
        d1.disp2();
    }
}
