import java.util.Scanner;
public class PatternX 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of stars you want to print to create X pattern: ");
        int n = scan.nextInt();

        for(int i=0; i<n;  i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==j || i+j==n-1)
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

/*Enter number of stars you want to print to create X pattern: 11
*         *
 *       * 
  *     *  
   *   *   
    * *    
     *     
    * *    
   *   *   
  *     *  
 *       * 
*         *          */