package e1036;

import java.util.Scanner;
//by Gabriel Rebechi
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double a, b, c, delta, r1, r2;
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		delta = (b*b) - (4*a*c);
		if((2*a==0) || (delta<0)){
			System.out.print("Impossivel calcular\n");
		}else{
			r1 = ((-1 * b) + Math.sqrt(delta))/(2*a);
			r2 = ((-1 * b) - Math.sqrt(delta))/(2*a);
			System.out.print("R1 = ");
			System.out.printf("%.5f", r1);
			System.out.print("\nR2 = ");
			System.out.printf("%.5f", r2);
			System.out.print("\n");
		}
		
	}
}
