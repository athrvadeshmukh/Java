public class WaysToComapareStrings 
{
    public static void main(String[] args)
    {
        String s1 = "athrva";
        String s2 = new String("athrva");
        String s3 = "athrva";
        String s4 = "ATHRVA";
        String s5 = new String("athrva");
        
        System.out.println("*********************");
        System.out.println("== : ");
        System.out.println(s1==s2); // false
        System.out.println(s1==s3); // True
        System.out.println(s1==s4); // false
        System.out.println(s1==s5); // false
        System.out.println(s2==s3); // false
        System.out.println(s2==s4); // false
        System.out.println(s2==s5); // false
        System.out.println(s3==s4); // false
        System.out.println(s3==s5); // false
        System.out.println(s4==s5); // false
        
        System.out.println("*********************");
        System.out.println("equals() : ");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals(s4)); // false
        System.out.println(s1.equals(s5)); // true
        System.out.println(s2.equals(s3)); // true
        System.out.println(s2.equals(s4)); // false
        System.out.println(s2.equals(s5)); // true
        System.out.println(s3.equals(s4)); // false
        System.out.println(s3.equals(s5)); // true
        System.out.println(s4.equals(s5)); // false
        System.out.println(s1.equals(s4)); // false
        
        System.out.println("*********************");
        System.out.println("equalsIgnoreCase() :  ");
        System.out.println(s1.equalsIgnoreCase(s4)); // true
        System.out.println(s2.equalsIgnoreCase(s4)); // true
        System.out.println(s3.equalsIgnoreCase(s4)); // true
        System.out.println(s5.equalsIgnoreCase(s4)); // true



    }    
}
