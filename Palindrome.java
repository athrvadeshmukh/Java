import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string to check whether it is palindrome or not");
        String str1 = scan.nextLine();//MADAM
        String str2 = "";

        for(int i= str1.length()-1; i>=0; i--)
        {
            str2 = str2+str1.charAt(i);
        }
        if(str1.equals(str2))
        {
            System.out.println("IT is palindrome");

        }
        else
        {
            System.out.println("Not a plaindrome");
        }

    }    
}

/*Enter your string to check whether it is palindrome or not
nitin
IT is palindrome

Enter your string to check whether it is palindrome or not
athrva
Not a plaindrome

Enter your string to check whether it is palindrome or not
MADAM
IT is palindrome*/