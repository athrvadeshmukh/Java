public class EnhancedForLoopInArrays
{
    public static void main(String[] args)
    {
        // 1D Array
        System.out.println("********************");
        System.out.println("1D ARRAY USING ENHANCED FOR LOOP");
        int nums [] = {5,4,7,8};
        for(int n:nums)
        {
            System.out.println(n);
        }

        // 2 D array
        System.out.println("********************");
        System.out.println("2D ARRAY USING ENHANCED FOR LOOP");
         int nums1 [][] = {
            {5,2,3,4,8}, {3,4,5,6,7}, {1,2,3,4,5}

         };
         for(int a[]:nums1)
         {
            for(int b:a)
            {
               System.out.print(b + " ");
            }
            System.out.println();
         }
          // JAGGED array
        System.out.println("********************");
        System.out.println("Jagged ARRAY USING ENHANCED FOR LOOP");
         int nums2 [][] = {
            {5,2,3,4,8}, {3,4,5,7}, {1,2,3,4,5,9,10},{2}

         };
         for(int c[]:nums2)
         {
            for(int d:c)
            {
               System.out.print(d + " ");
            }
            System.out.println();
         }

    }
    
}

/* Output
1D ARRAY USING ENHANCED FOR LOOP
5
4
7
8
********************
2D ARRAY USING ENHANCED FOR LOOP
5 2 3 4 8 
3 4 5 6 7 
1 2 3 4 5 
********************
Jagged ARRAY USING ENHANCED FOR LOOP
5 2 3 4 8 
3 4 5 7 
1 2 3 4 5 9 10 
2 
 
*/
