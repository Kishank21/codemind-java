import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        double f,c;
        c=obj.nextDouble();
        f=32+(c*9/5);
        System.out.format("%.2f",f);
    }
}