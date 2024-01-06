public class FinalVsImmutablity 
{
    public static void main(String[]args)
    {   /* 
        int a = 3;
        a=6;
        System.out.println(a);
        */

        final int b = 3;
                  b = 6;
        System.out.println(b); // value will not assigned to b due to final keyword

        final StringBuffer sb = new StringBuffer("Athrva");
        sb.append("Deshmukh");
        System.out.println(sb);

        sb = new StringBuffer("D");
        sb.append("1");
        System.out.println(sb);    // cant initiliaze new value to sb due to final keyword 
        
       
    }    
}

