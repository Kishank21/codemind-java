import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int c;
        int a=obj.nextInt();
        int b=obj.nextInt();
        c=a/b;
        System.out.format("%d",c);
    }
}