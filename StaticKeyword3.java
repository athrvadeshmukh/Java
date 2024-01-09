class Demo1
{
    static int a;
    static int b;

    int m; // object varibale , instance , fields
    int n;

    static 
    {
        a=10;
        b=20;
        System.out.println("control in static block");
    }
    
    {
        m=100;
        n=200;
        System.out.println("Control in non static block");
    }

    static void disp1()
    {
        System.out.println("Value of static variable " + a);
        System.out.println("Value of Static variable " + b);
    }

    void disp2()
    {
        System.out.println("Value of non static variable or instance variable " + m);
        System.out.println("Value of non Static variable or instance variable " + n);
    }
}


public class StaticKeyword3 
{
    public static void main(String[] args)
    {
        Demo1 d1 = new Demo1();
        d1.disp1();
        d1.disp2();
    }
}
