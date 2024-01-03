public class MutableStringAndMemoryMap 
{   public static void main(String[] args)
    {

    
    String s1=new String("Athrva");
    String s2=new String("Athrva");
    System.out.println(s1==s2); // it will give flase

    String s3="Athrva";
    String s4="Athrva";
    System.out.println(s3==s4); //true
    
    }
}
