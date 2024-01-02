public class ArrayIndexOutOfBoundException 
{
    public static void main(String args[])
    {           
        System.out.println("******************************");
        System.out.println("Exception handling type 1");
        int nums[] = {5,4,3,2,1};
        System.out.println(nums[1]); /* This line will give no exception */
        
        // System.out.println(nums[5]); // This line will give exception type 1

        System.out.println(nums[nums.length-1]); // exception handling type 1
        
      /*   for (int i=0; i<=5; i++)
        {
            System.out.println(nums[i]);
        }

        */  // Exception type 2
        System.out.println("******************************");
        System.out.println("Exception handling type 2");

        for(int i=0; i<5; i++) // exception handling type 2
        {
            System.out.println(nums[i]);
        }

        System.out.println("******************************");
        System.out.println("Exception handling type 3");


        for(int i=0; i<nums.length; i++) // exception handling type 3
        {
            System.out.println(nums[i]);
        }

        System.out.println("******************************");
        System.out.println("Exception handling type 4");

        for(int n : nums) // enhanced for loop exception handling
        {
            System.out.println(n);
        }
    }
}
