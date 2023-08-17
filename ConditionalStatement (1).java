public class ConditionalStatement
{
    public static void main(String[] args)
    {
        int age = 99;

        if(age>=18 && age<=60)
        {
            if(age>=20 && age<30)
            {
                System.out.println("you are in your 20's");
            }
            else if(age>=30 && age<40)
            {
                System.out.println("You are in your 30's");
            }
            else if(age>=40 && age<50)
            {
                System.out.println("You are in your 40's");
            }
            else if(age>=50 && age<60)
            {
                System.out.println("you are in your 50's");
            }
            else if(age==60)
            {
                System.out.println("You are 60 year old");
            }
            else
            {
            System.out.println("You have just became adult");
            }
        }
        else if (age<=18)
        {
            if (age>=13 && age<=17)
            {
                System.out.println("You are in your teenage");
            }
            if (age==12 && age>=5)
            {
                System.out.println("You are a kid");
            }
            else if(age==4 && age<=1)
            {
                System.out.println("You are Infant");
            }
            else
            {
                System.out.println("you are not born yet");
            }
        }
        else
        System.out.println("You are an senior citizen");
    }
}