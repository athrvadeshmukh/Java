public class Mutable 
{
    public static void main(String[] args)
    {   
        System.out.println("******************");
        System.out.println("String Builder - : ");
        StringBuilder sb = new StringBuilder("Athrva");
        System.out.println(sb);
        sb.append("Deshmukh");
        System.out.println(sb);
        
        System.out.println("******************");
        System.out.println("String Buffer - : ");
        StringBuffer name = new StringBuffer("D");
        System.out.println(name);
        name.append(1);
        System.out.println(name);
        System.out.println("******************");
    }    
}
