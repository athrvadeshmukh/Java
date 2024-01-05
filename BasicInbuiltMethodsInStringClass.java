public class BasicInbuiltMethodsInStringClass 
{
    public static void main(String[] args)
    {
        String str = "Athrva Deshmukh";
        System.out.println(str); //Athrva Deshmukh
        System.out.println(str.toUpperCase());//ATHRVA DESHMUKH
        System.out.println(str.toLowerCase()); //athrva deshmukh
        System.out.println(str.length()); // 15 
        System.out.println(str.charAt(7)); //D
        int length = str.length();
        System.out.println(length);// 15
        System.out.println(str.substring(0,6)); // Athrva. 1st number means include index 0  and last no. means exclude index 6
        System.out.println(str.indexOf("A")); //0
        System.out.println(str.indexOf("a"));//5
        System.out.println(str.indexOf("h"));//2
        System.out.println(str.lastIndexOf("h"));//14

         
        
    }    
}
