import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] par = new int[5];
		int par_cont = 0;
		
		int[] impar = new int[5];
		int impar_cont = 0;
		
		
		for(int i = 0; i < 15; i++){
			int valor = sc.nextInt();
			
			if(valor%2 == 0){
				
				par[par_cont] = valor;
				par_cont++;
				
				if(par_cont == 5){
					
					for(int j = 0; j<5; j++){
						System.out.printf("par[%d] = %d%n", j, par[j]);
						
					}
					par_cont = 0;
				}
				
			}else{
				
				impar[impar_cont] = valor;
				impar_cont++;
				
				if(impar_cont == 5){
					
					for(int j = 0; j<5; j++){
						System.out.printf("impar[%d] = %d%n", j, impar[j]);
						
					}
					
					impar_cont = 0;
					
				}
				
			}
				
		}
		
		for(int i = 0; i<impar_cont; i++){
			System.out.printf("impar[%d] = %d%n", i, impar[i]);
						
		}
		
		for(int i = 0; i<par_cont; i++){
			System.out.printf("par[%d] = %d%n", i, par[i]);
						
		}
    }
}
