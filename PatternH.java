import java.util.Scanner;

import javax.naming.event.NamingExceptionEvent;
public class PatternH 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the numbers of stars you wanted to Print : ");
        int n = scan.nextInt();

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==(n-1)/2 || j==n-1 || j==0)
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
/* Enter the numbers of stars you wanted to Print : 10
                    *        *
                    *        *
                    *        *
                    *        *
                    **********
                    *        *
                    *        *
                    *        *
                    *        *
                    *        *
    */
