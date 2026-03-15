import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		int[] vetor = new int[20];
    		int k;
    		for(int i = 0; i<vetor.length; i++){
    			vetor[i] = sc.nextInt();
    		}
    		for(int i = 0; i<vetor.length/2; i++){
    			k = vetor[i];
    			vetor[i] = vetor[vetor.length-1-i];
    			vetor[vetor.length-1-i] = k;
    		}
    		for(int i = 0; i<vetor.length; i++){
    			System.out.printf("N[%d] = %d%n", i, vetor[i]);	
    		}
    }
}

