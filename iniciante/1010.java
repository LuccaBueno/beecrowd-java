import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
		
    		int Cod_1 = sc.nextInt();
    		int N_pecas1 = sc.nextInt();
    		double V1 = sc.nextDouble();
    		
    		
    		int Cod_2 = sc.nextInt();
    		int N_pecas2 = sc.nextInt();
    		double V2 = sc.nextDouble();
    		double Vp = (N_pecas2 * V2) + (N_pecas1 * V1);
    		
    
    		System.out.printf("VALOR A PAGAR: R$ %.2f%n", Vp);
 
    }
 
}
