package aula2;

import java.util.Random;

class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gerador = new Random();
		int[][] x = new int[4][4];
		int aux = 0;

		// preenchimento e impressão de matriz
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				x[i][j] = gerador.nextInt(20);
				System.out.print(x[i][j] + "\t");
				if (x[i][j] > aux) {
					aux = x[i][j];
				}
			}
			System.out.println();

		}
		System.out.println();
		System.out.println("Maior valor = " + aux);
	}

}

