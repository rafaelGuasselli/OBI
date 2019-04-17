package e1021;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float valorTotal = in.nextFloat();

		int valorMoedas = Math.round((valorTotal % 1) * 1000)/10;
		int valorNotas = Math.round(valorTotal - (valorMoedas/100));
		
		int aux;
		System.out.println("NOTAS:");
		

		aux = (valorNotas - (valorNotas % 100))/100;
		System.out.println(aux + " nota(s) de R$ 100.00");
		valorNotas -= (aux * 100);
		
		aux = (valorNotas - (valorNotas % 50))/50;
		System.out.println(aux + " nota(s) de R$ 50.00");
		valorNotas -= (aux * 50);
		
		aux = (valorNotas - (valorNotas % 20))/20;
		System.out.println(aux + " nota(s) de R$ 20.00");
		valorNotas -= (aux * 20);
		
		aux = (valorNotas - (valorNotas % 10))/10;
		System.out.println(aux + " nota(s) de R$ 10.00");
		valorNotas -= (aux * 10);
		
		aux = (valorNotas - (valorNotas % 5))/5;
		System.out.println(aux + " nota(s) de R$ 5.00");
		valorNotas -= (aux * 5);
		
		aux = (valorNotas - (valorNotas % 2))/2;
		System.out.println(aux + " nota(s) de R$ 2.00");
		valorNotas -= (aux * 2);
		
		
		System.out.println("MOEDAS:");
		
		
		aux = (valorNotas - (valorNotas % 1))/1;
		System.out.println(aux + " moeda(s) de R$ 1.00");
		valorNotas -= (aux * 1);
		
		
		aux = ((valorMoedas - (valorMoedas % 50))/50);
		System.out.println(aux + " moeda(s) de R$ 0.50");
		valorMoedas = valorMoedas - (aux * 50);
		
		aux = ((valorMoedas - (valorMoedas % 25))/25);
		System.out.println(aux + " moeda(s) de R$ 0.25");
		valorMoedas -= (aux * 25);
		
		aux = ((valorMoedas - (valorMoedas % 10))/10);
		System.out.println(aux + " moeda(s) de R$ 0.10");
		valorMoedas -= (aux * 10);
		
		aux = ((valorMoedas - (valorMoedas % 5))/5);
		System.out.println(aux + " moeda(s) de R$ 0.05");
		valorMoedas -= (aux * 5);
	
		aux = ((valorMoedas - (valorMoedas % 1))/1);
		System.out.println(aux + " moeda(s) de R$ 0.01");
		valorMoedas -= (aux * 1);
	}
}
