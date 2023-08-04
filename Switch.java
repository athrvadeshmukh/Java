public class Switch
{
    public static void main(String[] args)
    {
        int num=0;
        System.out.println("select 1");
        System.out.println("select 2");
        System.out.println("select 3");
        System.out.println("select random number");

        switch(num)
        {
            case 1: System.out.println("Hello World");
            break;
            case 2: System.out.println("This is switch case program");
            break;
            case 3: System.out.println("Made by using java");
            break;
            default: System.out.println("Default");
        }
    }
}

/*  Output-:
    select 1
    select 2
    select 3
    select random number
    Defaul */
