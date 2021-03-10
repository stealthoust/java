package Lab1;
import java.io.*;
public class potegaite {

    private static double potegaite(double a, double n)
    { double suma=1;
        if(n==0) return 1;
        else {

            for (int i = 1; i <= n; i++) {
                suma *= a;
            }
        }
        return suma;
    }



    public static void main(String[]args)
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program obliczajacy a do potegi n");
        boolean sukces=false;
        while(!sukces) {
            try {
                double a, n;
                System.out.print("a=");
                String s = in.readLine();
                a = Double.parseDouble(s);
                System.out.print("n=");
                s = in.readLine();
                n = Double.parseDouble(s);
                if (n >= 0) {
                    //  double c = potegaite(a, n);
                    double dblResult = Math.pow(a, n);
                    System.out.println(a + " do potegi " + n + "=" + dblResult);
                    sukces = true;
                }

                else
                {

                    System.err.println("Blad! Wykladnik nie moze byc ujemny");
                }


            } catch (Exception e) {
                System.err.println("Blad! Niewlasciwy format danych!");
                sukces=false;
            }
        }
    }
}
