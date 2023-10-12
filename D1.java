import java.util.Scanner;
public class D1 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many stars you want to print to make diagonal : ");
        int n= scan.nextInt();

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==j)
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

/* OUTPUT
 Enter how many stars you want to print to make diagonal : 10
*         
 *        
  *       
   *      
    *     
     *    
      *   
       *  
        * 
         *
 */