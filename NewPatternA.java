import java.util.Scanner;
public class NewPatternA 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of stars you want to print to get (A) Pattern : ");
        int n = scan.nextInt();

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 && i>0) 
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


/* Enter the number of stars you want to print to get (A) Pattern : 17
 *******         
*       *        
*       *        
*       *        
*       *        
*       *        
*       *        
*       *        
*********        
*       *        
*       *        
*       *        
*       *        
*       *        
*       *        
*       *        
*       *         */