public class Logical {
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        int c=30;
        System.out.println("Value of a==b && a<b && a<c = " + (a==b && a<b && a<c));
        System.out.println("Value of a<b && a<c && b<c && a<=c = " + (a<b && a<c && b<c && a<=c));
        System.out.println("Value of a==b || a<b || a>b = " + (a==b || a<b || a>b));
        System.out.println("Value of !true is = " + !true);
        System.out.println("Value of !(a==b) is = " + !(a==b));

    }
    
}

                        /*     OUTPUT-:
                            Value of a==b && a<b && a<c = false
                            Value of a<b && a<c && b<c && a<=c = true
                            Value of a==b || a<b || a>b = true
                            Value of !true is = false
                            Value of !true is = true

                        */
