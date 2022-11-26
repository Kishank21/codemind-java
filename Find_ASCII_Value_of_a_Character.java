import java.util.Scanner;
class Asci {

    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        char ch =obj.next().charAt(0);
        int ascii = ch;
        int castAscii = (int) ch;
        System.out.println(ascii);
    }
}