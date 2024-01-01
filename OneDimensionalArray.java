public class OneDimensionalArray 
{
    public static void main(String[] args)
    {
        int nums[] = {1,2,3,4,5};
        
        // 1.  method 1 of printing array
        System.out.println("Method 1 of printing array");

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);

        System.out.println("*****************************************");
        
        //2. Method 2 of printing array

        System.out.println("Method 2 of printing array using For Loop");

        for(int i=0; i<=4; i++)
        {
            System.out.println(nums[i]);
        }

        System.out.println("*****************************************");
        
        //3. Method 3 of printing array when value is unknown

        System.out.println("Method 3 of printing array when value is unknown");

        int unknown[] = new int[5];
        unknown[0] = 5;
        unknown[1] = 4;
        unknown[2] = 3;
        unknown[3] = 2;
        unknown[4] = 1;
        for(int i=0; i<=4; i++)
        {
            System.out.println(unknown[i]);
        }

        //3. Method 3 of printing array when value is unknown

        System.out.println("Method 4 of printing array when values are  Strings");

        String names[] = {"Athrva","Gourav","Sonu","Nushad","Devendra","Ayush"};
        for(int i=0; i<=5; i++)
        {
            System.out.println(names[i]);
        }
    }
}
