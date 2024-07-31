import java.util.Scanner;
public class tankFilling
{
    public static void main(String[] args)
    {
        int X,Y,Z;
        Scanner read = new Scanner(System.in);
        X = read.nextInt();
        Y = read.nextInt();
        Z = (X*Y)/(X+Y);
        System.out.println(Z);
    }
}