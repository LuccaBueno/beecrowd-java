import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
      
    		float[] vetor = new float[100];
    		for(int i = 0; i<100; i++){
      			vetor[i] = sc.nextFloat();
      			
      			if(vetor[i]<=10){
      				  System.out.printf("A[%d] = %.1f%n", i, vetor[i]);
      			}	
		    }
    }
}
