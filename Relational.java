public class Relational {
    public static void main(String[] args)
    {
        int a = 10;
        int b = 30;
        int c = 10;

        
        boolean result1 = a==b;
        boolean result2 = a!=b;
        boolean result3 = a>=b;
        boolean result4 = a<=b;
        boolean result5 = a>b;
        boolean result6 = a<b;
        boolean result7 = a==c;

        
        System.out.println("Statement of a==b is = " + result1);
        System.out.println("Statement of a!=b is = " + result2);
        System.out.println("Statement of a>=b is = " + result3); 
        System.out.println("Statement of a<=b is = " + result4);
        System.out.println("Statement of a>b is = " + result5);
        System.out.println("Statement of a<b is = " + result6); 
        System.out.println("Statement of a==c is = " + result7); 

    }
    
}

    /*              OUTPUT-:
                Statement of a==b is = false
                Statement of a!=b is = true
                Statement of a>=b is = false
                Statement of a<=b is = true
                Statement of a>b is = false
                Statement of a<b is = true
                Statement of a==c is = true
     */