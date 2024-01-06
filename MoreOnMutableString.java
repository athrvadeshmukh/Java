public class MoreOnMutableString 
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder(); //16 as default capacity
        System.out.println(sb.capacity()); //16
        sb.append("abcdefghijklmopq");
        System.out.println(sb.capacity()); // can have capacity of 16
        sb.append("r");
        System.out.println(sb.capacity()); // it shows how many characters you can add its capacity increases to 34 from 16 when the capacity increases by 1
        System.out.println(sb.length());// length = 17 it shows how many character are present

        StringBuffer sb1 = new StringBuffer("Athrva");//default capacity 16
        System.out.println(sb1);
        System.out.println(sb1.capacity());// new capacity 16+6=22
        System.out.println(sb1.charAt(1));
        sb1.setCharAt(1, 'T');
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder(150); // set new capacity as 150 instead of 16
        System.out.println(sb2.capacity());
        sb2.append("Athrva");
        System.out.println(sb2);
        sb2.trimToSize(); // removes the waste capacity
        System.out.println(sb2.capacity()); // now its capacity is 6 because we have trim the waste size 

        StringBuilder sb3 = new StringBuilder("Athrva");
        System.out.println(sb3);
        System.out.println(sb3.reverse());


    }    
}
