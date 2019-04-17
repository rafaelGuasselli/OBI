
package e1004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int v1 = entrada.nextInt();
        int v2 = entrada.nextInt();
        
        int res = v1 * v2;
        
        System.out.println("PROD = "+ res);
    }
}
