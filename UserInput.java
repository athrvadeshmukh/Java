import java.util.Scanner;

public class UserInput 
{
    public static void main(String[] args)
    {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Your name");
            String name = scan.nextLine();

            System.out.println("Enter your age only in Integers eg- 1,2,3,4,10");
            int age = scan.nextInt();

            System.out.println("Enter your gender");
            String gen = scan.next();

            System.out.println("Enter birth date eg- 01, 10, 20 only in this format only numbers");
            int date = scan.nextInt();

            System.out.println("Enter birth Month  eg- 01, 02, 10, 12 only in this format only numbers");
            int month = scan.nextInt();

            System.out.println("Enter birth year eg- 1995, 2000, 2003 only in this format only numbers");
            int year = scan.nextInt();

            System.out.println("Enter your Caste Gen, OBC, ST, SC, other");
            String caste = scan.next();

            System.out.println("Your name is " + name);
            System.out.println("Your age is " + age);
            System.out.println("Your Gender is " + gen);
            System.out.println("Your Date of birth is " + date + "/" + month + "/" + year);
            System.out.println("Your caste is " + caste);
    }



}

/*                   Output  -

                    Enter Your name
                    Athrva Deshmukh
                    Enter your age
                    20
                    Enter your gender
                    Male
                    Enter birth date eg- 01, 10, 20 only in this format
                    21
                    Enter birth Month  eg- 01, 02, 10, 12 only in this format
                    05
                    Enter birth year eg- 1995, 2000, 2003 only in this format
                    2003
                    Enter your Caste Gen, OBC, ST, SC, other
                    Gen
                    
                    Your name is Athrva Deshmukh
                    Your age is 20
                    Your Gender is Male
                    Your Date of birth is 21/5/2003
                    Your caste is Gen 
                                                                                                                        */
