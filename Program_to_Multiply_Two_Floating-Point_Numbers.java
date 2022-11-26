import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        float c;
        float a=obj.nextFloat();
        float b=obj.nextFloat();
        c=a*b;
        System.out.format("%.2f",c);
    }
}