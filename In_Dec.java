class In_Dec{
    public static void main(String[] args)
    {
        int a = 5;
        int b = a++ + ++a + ++a + a++ + --a + a--;

        System.out.println(a);
        System.out.println(b);
    }

    
}

//Output: 7
//44
