package aula2;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declara��o de vari�veis
		Scanner teclado = new Scanner(System.in);
		int totaldealunos;
		
		// entrada do total de alunos
		System.out.println("Total de alunos: ");
		totaldealunos = teclado.nextInt();
		
		// declara��o dos arrays
		String[] nome = new String[totaldealunos];
		double [][] nota = new double[totaldealunos][3];
	}

}
