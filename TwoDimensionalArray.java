public class TwoDimensionalArray 
{   
    public static void main(String[] args)
    {   
        System.out.println("Method 1");

        int nums[][] = new int [3][2];
        nums[0][0] = 5;
        nums[0][1] = 2;
        nums[1][0] = 8;
        nums[1][1] = 3;
        nums[2][0] = 9;
        nums[2][1] = 4;

        for(int i=0; i<=2; i++) // rows i 
        {
            for(int j=0; j<=1; j++) // columns j
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println(); // new line 

        }

        System.out.println("************************");
        
        System.out.println("Method 2");

        int num1[][] = { 
                            {5,2},
                            {8,3}, 
                            {9,4}
                        };

        for(int i=0; i<=2; i++)
        {
            for(int j=0; j<=1; j++)
            {
                System.out.print(num1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("************************");
        
        System.out.println("Method 3 1st way of writing Jagged Arrays");

        int jagged[][] = { 
                            {5,2,3,6},
                            {8,3}, 
                            {9,4,8}
                        };

        for(int i=0; i<=2; i++)
        {
            for(int j=0; j<jagged[i].length; j++)
            {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("************************");
        
        System.out.println("Method 4 another way of writing Jagged Arrays");
        int jagged1[][] = new int [3][];// rows are fixed but columns 
        jagged1[0] = new int [4];
        jagged1[1] = new int [2];
        jagged1[2] = new int [3];

        jagged1[0][0] = 5;
        jagged1[0][1] = 2;
        jagged1[0][2] = 3;
        jagged1[0][3] = 6;
        jagged1[1][0] = 8;
        jagged1[1][1] = 3;
        jagged1[2][0] = 9;
        jagged1[2][1] = 4;
        jagged1[2][2] = 8;
        

        for(int i=0; i<=2; i++)
        {
            for(int j=0; j<jagged1[i].length; j++)
            {
                System.out.print(jagged1[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*output 

Method 1
5 2 
8 3 
9 4 
************************
Method 2
5 2 
8 3 
9 4 
************************
Method 3 1st way of writing Jagged Arrays
5 2 3 6 
8 3 
9 4 8 
************************
Method 4 another way of writing Jagged Arrays
5 2 3 6 
8 3 
9 4 8 
 
*/