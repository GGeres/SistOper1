package controller;

public class Threads2 extends Thread {
	int Mat[][] = new int [3][4];
	
	public Threads2(int Mat[][]) {
		this.Mat = Mat;
	}
	
	public void run() {
		int i;
		int j;
		int col[] = new int [4];
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 4; j++) {
				Mat[i][j] = (int) (Math.random()*100);
			}
		}
		// Somando os valores de cada coluna
        for (j = 0; j < 4; j++) {
            col[j] = Mat[0][j] + Mat[1][j] + Mat[2][j];
        }

        // Exibindo a soma de cada coluna
        for (j = 0; j < 4; j++) {
            System.out.println("Soma da coluna " + j + " = " + col[j]);
	    }
	}
}
