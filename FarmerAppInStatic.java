/*

Static variables are called class variable because same copy of data is used among all classes
whenever a common copy of data is shared among all the objects of the class we will go with the static variable
beacause during the class loading it self memory will be allocated in the heap area and the same data will be used among all 
objects because memory will be allocated once and hence it is more efficient

 */
import java.util.Scanner;

class Farmer
{
    int pa;
    float td;
    float si;
    static float ri;

    static
    {
        ri = 8.5f;
    }

    void input()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the rerquired amount : ");
        pa = scan.nextInt();

        System.out.println("Enter the time duration : ");
        td = scan.nextFloat();

        //ri = 8.5f;
    }
    void compute()
    {
        si = (pa*ri*td)/100f;
    }
    void disp()
    {
        System.out.println("Simple Interest is : "+si);
    }
}
public class FarmerAppInStatic 
{
    public static void main(String[] args)
    {
        Farmer f1 = new Farmer();
        f1.input();
        f1.compute();
        f1.disp();

        Farmer f2 = new Farmer();
        f2.input();
        f2.compute();
        f2.disp();
    }    
}
