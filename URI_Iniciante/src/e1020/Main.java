
package e1020;

import java.util.Scanner;
//by Gabriel Rebechi
public class Main {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int idade, dias, meses, anos;
		idade = scan.nextInt();
		anos = idade/365;
		meses = (idade%365)/30;
		dias = (idade%365)%30;
		System.out.println(anos + " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)");
	}
}
