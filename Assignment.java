public class Assignment {
    public static void main(String[] args)
    {
        int a1, a2, a3, a4;
        a1=a2=a3=a4=10;
        System.out.println("a1 a2 a3 and a4 will get assigend the same value = " + a1+" " +a2+ " " +a3+ " " +a4);

        int a=10;
        a +=7;
        System.out.println("Value of a was 10 and then the new assigned value of a will get added is = " + a);

        int b=10;
        b -=7;
        System.out.println("Value of b was 10 and then the new assigned value of b will get subtracted is = " + b);

        int c=10;
        c /=7;
        System.out.println("Value of c was 10 and then the new assigned value of c will get divided is = " + c);

        int d=10;
        d *=7;
        System.out.println("Value of d was 10 and then the new assigned value of d will get Multipled is = " + d);

        int e=10;
        e %=7;
        System.out.println("Value of e was 10 and then the new assigned value of e will get added is = " + e);

        float f=10f;
        f /=7;
        System.out.println("Value of f was 10 and then the new assigned value of f will get divided is = " + f);
    }


    
}

//OUTPUT-
//a1 a2 a3 and a4 will get assigend the same value = 10 10 10 10
//Value of a was 10 and then the new assigned value of a will get added is = 17
//Value of b was 10 and then the new assigned value of b will get subtracted is = 3
//Value of c was 10 and then the new assigned value of c will get divided is = 1
//Value of d was 10 and then the new assigned value of d will get Multipled is = 70
//Value of e was 10 and then the new assigned value of e will get added is = 3
//Value of f was 10 and then the new assigned value of f will get divided is = 1.4285715 
