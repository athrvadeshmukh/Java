import java.util.Scanner ;



class Student
{
   // int age;
  // String name;

    private int age; // not visible to other person
    private String name;

    

    public void SetData()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name : ");
        name = scan.nextLine();
        System.out.print("Enter your age : ");
        age = scan.nextInt();
        //age = 20;
        // name = "Athrva";
    }

    public void show()
    {
        System.out.println("name : "+name+" , "+"age : "+ age);
        //System.out.println(name+" "+age);
    }
}

class Encapsulation
{
    public static void main(String[] args)
    {
        Student objStudent = new Student();
        //objStudent.name = "Athrva";
        //objStudent.age = 20;
        objStudent.SetData();
        objStudent.show();

    }
}