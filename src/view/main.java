package view;

import javax.swing.JOptionPane;

import controller.ThreadVetor;

public class main {

	public static void main(String[] args) {
		int aux = 0;									// criar variavel de entrada
		int par = 2;
		int impar = 1;
		double [] vetorThread = new double [1000];		// ciar vetor 
		
		aux = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));  
		
		for (int i = 0; i < 1000; i ++) {				// carregamento do vetor com randomico
			vetorThread[i] = (double) (Math.random()* 100);
		}
		
		if (aux %2 != 0) {
			for (int op = 0 ; op < 2; op++) {
				ThreadVetor vetor = new ThreadVetor(par, impar, vetorThread);
				vetor.start();	
				System.out.println("Iempo impar " + vetor.calcfor() + " seg");
				}
		} 
		else {
			for (int op = 0 ; op < 2; op++) {
				ThreadVetor vetor = new ThreadVetor(par, impar, vetorThread);
				vetor.start();	
				System.out.println("Tempo par é de " + vetor.calcforeach() + " seg");
			}
		}
	}
}
