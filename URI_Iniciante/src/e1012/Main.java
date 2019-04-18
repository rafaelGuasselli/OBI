
package e1012;

import java.util.Scanner;
//by Gabriel Rebechi
public class Main {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double a, b, c, areaTri, areaCirc, areaTrap, areaQuad, areaRet;
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		areaTri = (a * c)/2;
		areaCirc = 3.14159 * c * c;
		areaTrap = ((a + b) * c)/2;
		areaQuad = b * b;
		areaRet = a * b;
		
		System.out.printf("TRIANGULO: %.3f\n", areaTri);
		System.out.printf("CIRCULO: %.3f\n", areaCirc);
		System.out.printf("TRAPEZIO: %.3f\n", areaTrap);
		System.out.printf("QUADRADO: %.3f\n", areaQuad);
		System.out.printf("RETANGULO: %.3f\n", areaRet);
	}
}
