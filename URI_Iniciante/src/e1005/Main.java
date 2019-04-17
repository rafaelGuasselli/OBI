
package e1005;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso1 = 3.5;//peso da prova A
        double peso2 = 7.5;//peso da prova B
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        a = a * peso1;
        b = b * peso2;
        double res = (a+b) / (peso1+peso2);
        System.out.printf("MEDIA = %2.5f\n", res);//%2f significa que é double,
                                                //%2.5f é um double com 5 casas dps da virgula
    }
}
