package Lab1;
import java.io.*;
public class potega {

    private static long potega(int a, int n)
    {
        if(n==0) return 1;
        else return a*potega(a,n-1);

    }

    public static void main(String[]args)
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program obliczajacy a do potegi n");

        try {
            int a, n;
            System.out.print("a=");
            String s = in.readLine();
            a = Integer.parseInt(s);
            System.out.print("n=");
            s = in.readLine();
            n = Integer.parseInt(s);
            if (n >= 0) {
                long c = potega(a, n);
                System.out.println(a + "do potegi" + n + "=" + c);
            }
            else {
                System.err.println("Blad! WYkladnik nie moze byc ujemny");
            }


        } catch (Exception e) {
            System.err.println("Blad! Niewlasciwy format danych!");
        }
    }
}

