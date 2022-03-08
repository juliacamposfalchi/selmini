package aula2;

import java.util.Random;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//criação de variáveis e entrada de dados
		Random gerador = new Random();
		int [][] x = new int [4][4];
		
	// preenchimento e impressão de matriz
		for(int i=0; i<x.length; i++) {
			for(int j = 0; j<x.length; j++) {
				x[i][j] = gerador.nextInt(20);
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
	}
// soma dos elementos da diagonal principal e da diagonal secundária
	
		int ds =0; int dp = 0;
		for(int i=0; i< x.length; i++) {
		for(int j=0; j<x.length; j++) {
			if (i == j) {
				dp = dp + x[i][j];
			}
			if (i + j == x.length - 1) {
				ds = ds + x[i][j];
			}
		}
	}
	System.out.println("soma da diagonal principal = " + dp);
	System.out.println(" Soma da diagonal secundária =" + ds);
}}
