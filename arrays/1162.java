import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k;
		
		int quant_trens = sc.nextInt();
		
		for(int z = 0; z<quant_trens; z++){
			int quant_vagoes = sc.nextInt();
			int[] vetor = new int[quant_vagoes];
			
			for(int i = 0; i<quant_vagoes; i++){
				vetor[i] = sc.nextInt();
			}
			
			int contador = 0;
			for(int i = 0; i<vetor.length; i++){
				for(int j = 0; j<vetor.length-1; j++){
					if(vetor[j]>vetor[j+1]){
						k = vetor[j];
						vetor[j]=vetor[j+1];
						vetor[j+1] = k;
						contador++;
					}
				}
			}
			System.out.printf("Optimal train swapping takes %d swaps.%n", contador);
		}
		
		
    }
}
