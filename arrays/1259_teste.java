import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] par = new int[n];
		int cont_par = 0;
		
		int[] impar = new int[n];
		int cont_impar = 0;
		
		
		for(int i = 0; i<n; i++){
			int input = sc.nextInt();
			if(input%2 == 0){
				par[cont_par] = input;
				cont_par++;
			}else{
				impar[cont_impar] = input;
				cont_impar++;
			}
		}

		for(int i = 0; i<cont_par; i++){
			for(int j = 1; j<cont_par; j++){
				if(par[j] < par[j-1]){
					int temp = par[j-1];
					par[j-1] = par[j];
					par[j]=temp;
					
				}
				
			}
		}
		for(int i = 0; i<cont_impar; i++){
			for(int j = 1; j<cont_impar ; j++){
				if(impar[j] > impar[j-1]){
					int temp = impar[j-1];
					impar[j-1] = impar[j];
					impar[j] = temp;
				}
				
			}
		}
		
		//System.out.printf("par%n");
		
		for(int i = 0; i<cont_par; i++){
			System.out.printf("%d%n", par[i]);
		}
		//System.out.printf("impar%n");
		
		for(int i = 0; i<cont_impar; i++){
			System.out.printf("%d%n", impar[i]);
		}
		
		
		
		
	}
}
