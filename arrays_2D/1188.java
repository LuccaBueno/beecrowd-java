import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double[][] matriz = new double[12][12];
		char B = sc.next().charAt(0);
		double resultado = 0;
		int cont_media = 0;
		
		for(int i = 0; i < 12; i++){
			for(int j = 0; j < 12; j++){
				
				matriz[i][j] = sc.nextDouble();
				
				if(j < i && j > 11-i ){
					resultado += matriz[i][j];
					cont_media++;
					
				}
			}
		}
		
		if(B == 'S'){
			System.out.printf("%.1f%n", resultado);
		}else{
			System.out.printf("%.1f%n", resultado/cont_media);
						
		}
	   
    }
}
