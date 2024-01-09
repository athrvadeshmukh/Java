public class StaticKeyword1 
{
    static int age; // 1st 

    static{ // static block 2nd
        age = 18;
        System.out.println("Static Block 1st");
        System.out.println(age);
    }
    static void disp()
    {
        System.out.println("Static disp method after main method when we call it otherwise it will not execute");
    }
    public static void main(String [] args) //main method
    {
        System.out.println("Main method at last");
        disp();
    }    
}
