import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt()) {
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[][] matriz = new int[N][M];
			int[][] matriz2 = new int[N][M];
			
			for(int i = 0; i < matriz.length; i++){
				for(int j = 0; j < matriz[i].length; j++){
					
					matriz[i][j] = sc.nextInt();
					
				}
			}
			
			
			for(int i = 0; i < matriz.length; i++){
				for(int j = 0; j < matriz[i].length; j++){
					
					if(matriz[i][j] == 1){
						
						matriz2[i][j] = 9;
						
					}
					
					else{
						
						int count = 0;
						
						//cima
						if(i - 1 >= 0 && matriz[i-1][j] == 1){
							count++;
						}
						
						//baixo
						if(i + 1 < matriz.length && matriz[i+1][j] == 1){
							count++;
						}
						
						//esquerda
						if(j - 1 >= 0 && matriz[i][j-1] == 1){
							count++;
						}
						
						//direita
						if(j + 1 < matriz[i].length && matriz[i][j+1] == 1){
							count++;
						}
						
						matriz2[i][j] = count;

					}
					
					System.out.print(matriz2[i][j]);
					
					
					
				}
				
				System.out.println();
				
			}
		}
    }
}
