public class LengthVsLengthParenthesis
{
    public static void main(String[] args)
    {
        // 1D Array
        System.out.println("********************");
        System.out.println("1D ARRAY USING Length");
        int nums [] = {5,4,7,8};
        System.out.println(nums.length); // 4

        // 2 D array
        System.out.println("********************");
        System.out.println("2D ARRAY USING Length");
         int nums1 [][] = {
            {5,2,3,4,8}, {3,4,5,6,7}, {1,2,3,4,5}

         };
         System.out.println(nums1.length);//3
         System.out.println(nums1[0].length);//5 (length of inner array elements)
        
        // Strings
        System.out.println("********************");
        System.out.println("Strings USING Length()");
        String name = "Athrva";
        String name1 = "Deshmukh";
        System.out.println(name.length() + name1.length());//14
    }

}
