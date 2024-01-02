class Calc
{
    public int add(int nums[])
    {
        int result = 0;
        for(int n : nums)
        {
            result = result+n;

        }
        return result;

    }
}

public class AnonymousArray 
{
    public static void main(String[] args)
    {
        Calc obj = new Calc();
        //int nums[] = {5,4,3,7};
        int result = obj.add(new int[] {5,4,3,7});// anonymous array can be used once only
        System.out.println(result);

    }
    
}
