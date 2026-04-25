import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
    		float[][] matriz = new float [12][12];
    		float resultado = 0;
    		int L;
    		
    		L = sc.nextInt();
    		
    		char T = sc.next().charAt(0);
    		T = Character.toUpperCase(T);
    		
    		for(int i = 0; i < 12; i++){
    			for(int j = 0; j < 12; j++){
    				matriz[i][j] = sc.nextFloat();
    			}
    		}
    		
    		switch(T){
    			case 'S':
    				for(int j = 0; j<12; j++){
    					resultado += matriz[L][j];
    				}
    				System.out.printf("%.1f%n", resultado);
    				break;
    				
    			case 'M':
    				for(int j = 0; j<12; j++){
    					resultado += matriz[L][j];
    				}
    				System.out.printf("%.1f%n", resultado/12);
    				
    				break;
    		}
           
	   
    }
}
