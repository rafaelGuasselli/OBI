import java.util.Scanner;

public class solucao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] diferenca = new int[n];
		int[] sequencia = new int[n];
		
		for(int i = 0;i < n;i++) {
			diferenca[i] = in.nextInt();
			sequencia[i] = -1;
		}
		
		int soma = 0;
		int maior = 0;
		int a = 0;
		for(int x = 0;x < n;x++) {
			for(int y = x;a < n;y = roda(y + 1, n)) {
				if(diferenca[y] + soma > 0) {
					soma += diferenca[y];
					sequencia[a] = y;
				}
				a++;
			}
			if(soma == 7) {
				for(int i = 0;i < sequencia.length;i++) {
					//System.out.println(sequencia[i]);
				}
			}
			if(soma > maior && sequencial(sequencia)) {
				maior = soma;
				
			}
			soma = 0;
			a = 0;
		}
		System.out.println(maior);
		
	}
	
	public static int roda(int a, int b) {
		if(a < b) {
			return a;
		}else {
			return 0;
		}
	}
	
	public static boolean sequencial(int[] a) {
		int teste = 0;
		boolean sequencia = true;
		for(int i = 0;i < a.length;i++) {
			System.out.println(a[i] + " " + teste);
			if(a[i] == -1) {
				break;
			}
			
			if(a[i] != teste) {
				sequencia = false;
			}
			
			teste++;
		}
		for(int i = 0; i < a.length;i++) {
			a[i] = -1;
		}
		
		
		return sequencia;
	}
}
