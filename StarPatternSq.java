import java.util.Scanner;
public class StarPatternSq 
{
    public static void main(String[] args)
    {
        Scanner Scan= new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = Scan.nextInt();
        for(int i=0; i<n; i++)
        {
            for(int j=0;  j<n; j++)
            {
                if(i==0 || j==0 || i==n-1 || j==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
       

    }
}


//Output


/* 
Enter your number : 
20
********************
*                  *
*                  *
*                  *
*                  *
*                  *
*                  *
*                  *
*                  *
*                  *
*                  *
*                  *
*                  *
*                  *
*                  *
*                  *
*                  *
*                  *
*                  *
********************
 

*/
