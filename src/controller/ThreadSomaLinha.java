package controller;

public class ThreadSomaLinha extends Thread{

	private int linha[];
	private int nLinha;
	
	public ThreadSomaLinha(int linha[],int nLinha) {
		this.linha = linha;
		this.nLinha = nLinha;
	}

	@Override
	public void run() {
		calcLinha();
	}

	private void calcLinha() {
		int soma = 0;
		int tamanho = linha.length;
		
		try {
			sleep(nLinha*1);	//Bloqueia a Thread temporariamente por 1 milissegundo vezes o nº da linha da matriz
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Soma dos valores de cada linha
		for (int i = 0; i < tamanho; i++) {
			soma += linha[i]; 
		}
		
		System.out.println("Soma da linha "+(nLinha+1)+": "+soma);
	}
}
