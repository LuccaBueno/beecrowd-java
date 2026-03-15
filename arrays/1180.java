import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
    		int[] vetor = new int[n];
    		
    		for(int i = 0; i<vetor.length; i++){
    			vetor[i] = sc.nextInt();
    		}
    		
    		int index = 0;
    		int menor = vetor[0];
    		
    		for(int i = 1; i<vetor.length; i++){
    			if(vetor[i]<menor){
    				menor = vetor[i];
    				index = i;
    			}
    		}
    		System.out.printf("Menor valor: %d%nPosicao: %d%n", menor, index);
    }
}
