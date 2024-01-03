public class Strings 
{
    public static void main(String[] args)
    {   
        // Immutable String
        String name = "Athrva";
        System.out.println(name);
        name.concat("Deshmukh"); // conact can be used for only  Strings
        System.out.println(name);

        // Mutable String
        StringBuilder name1 = new StringBuilder("Athrva");
        System.out.println(name1);
        name1.append("Deshmukh"); // same as concat but append is used in StringBuilder class
        System.out.println(name1);



    }    
}
