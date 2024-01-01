public class InstanceObj {
    int a=2;
    String name="Athrva";
    public static void main(String[] args)
    {   
        // declare the variable
        // declare the object

        int num=9; //premitive
        InstanceObj obj1= new InstanceObj(); // reference
        InstanceObj obj2= new InstanceObj();
       
        obj1.name = "Deshmukh";
       
        System.out.println(obj1.a);
        System.out.println(obj1.name);

        System.out.println(obj2.a);
        System.out.println(obj2.name);


    }

   
}
