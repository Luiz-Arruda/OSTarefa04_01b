package controller;

public class ThreadVetor extends Thread{
	
	private double [] threadVet;
	private int par;
	private int impar;
	
	public ThreadVetor(int par, int impar, double []threadVet) {
		this.par = par;
		this.impar = impar;
		this.threadVet = threadVet;
	}

	@Override
	public void run() {
		if (par == 2) {
			calcfor();
		}
		else {
		calcforeach();
		}
	}

	public double calcfor () {
		int num = par;
		double tempoInicial = System.nanoTime();
		for (int i = 0; i < 1000; i ++) {
			threadVet[i] = threadVet[i] +0; 
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);   // conversao para segundo
		return tempoTotal + num;
	}
	
	public double calcforeach() {
		int num = impar;
		double tempoInicial = System.nanoTime();
		for (double d : threadVet) {
			threadVet = threadVet; 
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);		// conversao para segundo
		return tempoTotal + num;
	}
}
