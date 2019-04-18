
package e1014;

import java.util.Scanner;
//by Gabriel Rebechi
public class Main {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int dist = scan.nextInt();
		double totalKm = scan.nextDouble();
		System.out.printf("%.3f km/l\n", dist / totalKm);
	}
}
