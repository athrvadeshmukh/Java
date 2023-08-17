import java.util.Scanner;
public class PatternD 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many stars you want in your D Pattern : ");
        int n = scan.nextInt();

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==0 && j<(n-1)/2 || j==0 || i==n-1 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<n-1)
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

/*Enter how many stars you want in your D Pattern : 13
******       
*     *      
*     *      
*     *      
*     *      
*     *      
*     *      
*     *      
*     *      
*     *      
*     *      
*     *      
******        */