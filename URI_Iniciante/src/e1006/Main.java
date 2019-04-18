
package e1006;

import java.util.Scanner;
//by Gabriel Rebechi
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();
        
        A  = (A*2)/10;
        B = (B*3)/10;
        C = (C*5)/10;
        double res = A+B+C;
        System.out.printf("MEDIA = %.1f\n",res);
    }
}
