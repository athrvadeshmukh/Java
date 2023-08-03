public class Loop 
{
    public static void main(String[] args)
    {   
        //for loop
        for (int i=0; i<10; i++)
        {
            System.out.println("For Loop");
        }
        //While loop
        int i = 0;
        while(i<10)
        {
            System.out.println("This is While loop");
            i++;
        }

        int j = 0;
        do
        {
            System.out.print("This is Do While Loop\n");
            j++;
        }
        while(j<10);
        
    }
}

/* OUTPUT
For Loop
For Loop
For Loop
For Loop
For Loop
For Loop
For Loop
For Loop
For Loop
For Loop
This is While loop
This is While loop
This is While loop
This is While loop
This is While loop
This is While loop
This is While loop
This is While loop
This is While loop
This is While loop
This is Do While Loop
This is Do While Loop
This is Do While Loop
This is Do While Loop
This is Do While Loop
This is Do While Loop
This is Do While Loop
This is Do While Loop
This is Do While Loop
This is Do While Loop
 */
