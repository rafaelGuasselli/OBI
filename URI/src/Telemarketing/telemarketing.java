package Telemarketing;

import java.util.Scanner;

public class telemarketing {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int l = in.nextInt();
		int[] t = new int[l];

		int[] agente = new int[n];
		int[] contador = new int[n];
		
		n = clamp(n, 1, 1000);
		l = clamp(l, 1, 1000000);
		for (int i = 0; i < l; i++) {
			t[i] = in.nextInt();
			t[i] = clamp(t[i], 1, 30);
		}

		int x = 0;
		while (x < l) {
			for (int i = 0; i < n; i++) {
				if (x >= l) {
					break;
				}
				if (agente[i] == 0) {
					agente[i] = t[x];
					contador[i]++;
					x++;
				}
				agente[i]--;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + " " + contador[i]);
		}
	}

	public static int clamp(int val, int min, int max) {
		return Math.max(min, Math.min(max, val));
	}

}
