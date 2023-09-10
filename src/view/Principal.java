package view;
/*	
 * 	Insere números aleatórios em uma matriz 3 x 5 e faz a chamada Threads 3 vezes,
 * 	onde cada chamada calcula a soma dos valores de cada linha da matriz
 * 
 */
import controller.ThreadSomaLinha;

public class Principal {

	public static void main(String[] args) {
		int matriz[][] = new int[3][5];
		int linha = matriz.length;int coluna = matriz[0].length;
		
		//Atribuicao de valores para a matriz
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				matriz[i][j] = (int) (Math.random()*100);
			}
		}
		
		//Imprime os valores da matriz
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		//Faz a chamada  das Threads 
		for (int i = 0; i < linha; i++) {
			Thread soma = new ThreadSomaLinha(matriz[i], i);//Passa os parametros: valores de uma linha da matriz como vetor e o numero da linha
			soma.start();
		}
		

	}

}
