import java.util.Scanner;
public class wire
{
    public static void main(String[] args)
    {
        int X, Y, Z, R;
        Scanner read = new Scanner(System.in);
        X = read.nextInt();
        Y = read.nextInt();
        Z = read.nextInt();
        R =(2*(X+Y))*Z;
        System.out.println(R);
        
    }
}