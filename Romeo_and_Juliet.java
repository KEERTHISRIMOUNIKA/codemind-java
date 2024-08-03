import java.util.Scanner;
public class max
{
    public static void main(String[] args)
    {
        int X,Y,Z,R;
        Scanner read = new Scanner(System.in);
        X = read.nextInt();
        Y = read.nextInt();
        Z = read.nextInt();
        R =((5*X)+(10*Y))/Z;
        System.out.println(R);
        
    }
}