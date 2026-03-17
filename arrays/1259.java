import java.util.Scanner;
import java.util.Arrays;

public class bee{
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
		Arrays.sort(par,0,cont_par);
		Arrays.sort(impar,0,cont_impar);
		
		//System.out.printf("par%n");
		
		for(int i = 0; i<cont_par; i++){
			System.out.println(par[i]);
		}
		//System.out.printf("impar%n");
		
		for(int i = cont_impar - 1; i>= 0; i--){
			System.out.println(impar[i]);
		}
		
		
		
		
	}
}
