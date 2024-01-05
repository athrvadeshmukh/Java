public class ReverseString 
{
    public static void main(String[] args)
    {
        String str1 = "athrvadeshmukh";
        String str2 = "";

        for(int i=str1.length()-1; i>=0; i--)
        {
            str2 = str2+str1.charAt(i);
        }
        System.out.println("Before Reverse:  "+str1);
        System.out.println("After Reverse : "+str2);

        String str3 = "Athrva Deshmukh";
        String str4 = "";
        String arr[] = str3.split(" ");

        for(int i=arr.length-1; i>=0; i--)
        {
            str4 = str4+arr[i] +" ";

        }
        System.out.println("Before Reverse:  "+str3);
        System.out.println("After Reverse : "+str4);

        String str5 = "Athrva Deshmukh";
        String str6 = "";
        String sarr[] = str5.split(" ");

        for(String elem:sarr)
        {
            for(int i=elem.length()-1; i>=0; i--)
            {
                str6= str6+elem.charAt(i);
            }
            str6=str6+" ";
        }
        System.out.println("Before Reverse:  "+str5);
        System.out.println("After Reverse : "+str6);
    }    
}


// OUTPUT
/*
Before Reverse:  athrvadeshmukh
After Reverse : hkumhsedavrhta
Before Reverse:  Athrva Deshmukh
After Reverse : Deshmukh Athrva 
Before Reverse:  Athrva Deshmukh
After Reverse : avrhtA hkumhseD 
 */