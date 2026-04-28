import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
		    float[][] matriz = new float[12][12];
        float resultado = 0;
      
		    int coluna = sc.nextInt();
		    char B = sc.next().charAt(0);
		
		    for(int i = 0; i < 12; i++){
			    for(int j = 0; j < 12; j++){
				    matriz[i][j] = sc.nextFloat();
				    if(j == coluna){
					
					  resultado += matriz[i][j];
					
				    }
			    }
		    }
		    if(B == 'S'){
			    System.out.printf("%.1f%n", resultado);
	    	}else{
			    System.out.printf("%.1f%n", resultado/12);
						
	    	}
	   
    }
}
