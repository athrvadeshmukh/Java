public class StringConcatanation 
{
    public static void main(String[] args)
    {
        String s1 = new String("Athrva"); // mutable string no changes 
        s1.concat("Deshmukh"); // it will not concat because string is mutable
        System.out.println(s1); // Athrva

        s1 = s1.concat("Deshmukh");
        System.out.println(s1); /* AthrvaDeshmukh this string got concat because we have assigned a new address 
                                to variable s1 but still the value of s1 is not changed it is still mutuable */

        System.out.println("****************");

        String s2 = new String("pwjava");
        String s3 = s2.concat("skills");
        String s4 = new String("pwjava");
        s4 = s4.concat("skills");
        System.out.println(s2); // pwjava
        System.out.println(s3); // pwjavaskills
        System.out.println(s4); // pwjavaskills

        System.out.println("********************************");
        System.out.println("Concatination using + operator");

        String name = "Athrva";
        String str = name+" "+21+"/"+05+"/"+2003;
        System.out.println(str);

        String s5 = "pw";
        String s6 = "pw"+"java";
        String s7 = "pw"+"java"+"skills";
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);


    }
}
