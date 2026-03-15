import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		double x = sc.nextDouble();
    		double[] vetor = new double[100];
    		vetor[0] = x;
    		for(int i = 1; i<100; i++){
    			vetor[i] = vetor[i-1]/2;
    		}
    		for(int i = 0; i<100; i++){
    			System.out.printf("N[%d] = %.4f%n", i, vetor[i]);
    		}
		
    }
}
