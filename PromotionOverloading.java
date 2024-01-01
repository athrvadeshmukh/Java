class Calc
{   // Remove Byte from program then you will see promotion 
    public void show(byte n)
    {
        System.out.println("Byte :"+ n);
    }

    // Remove short then will see promotion again
    public void show(short n)
    {
        System.out.println("Short :"+ n);
    }
    
    // Remove int then will see promotion again
    public void show(int n)
    {
        System.out.println("Int :"+ n);
    }

    // Remove char then will see promotion again
    public void show(char n)
    {
        System.out.println("Char :"+ n);
    }

    // Remove double then will see promotion again
    public void show(double n)
    {
        System.out.println("double :"+ n);
    }
}
public class PromotionOverloading {
    public static void main(String[] args)
    {
        Calc obj = new Calc();
        byte b = 2; // to see promotion change the data type from byte to any data type eg- char short int double
        // or you can simply remove the byte from program then you will see that it will consider 2 as short data type
        // you can use any integer double or character in variable b
        
        obj.show(b);
    
    }

}

// Promotion will happen like this 
/* byte --> short --> int --> long --> float --> double
   char --> int --> long --> float --> double
 */