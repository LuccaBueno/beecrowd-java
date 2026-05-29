import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int termo = sc.nextInt();
		
		int[] vetor = new int[termo];
		
		StringBuilder sb = new StringBuilder();
		if(termo > 0){
			
			vetor[0] = 0;
		}
		if(termo > 1){
			
			vetor[1] = 1;
			
		}		
		for(int i = 2; i < termo; i++){
			
			vetor[i]=vetor[i - 1] + vetor[i - 2];
			
		}
		
		for(int i = 0; i < termo; i++){
			
			sb.append(vetor[i]);
			
			if(i < termo - 1){
				
				sb.append(' ');

			}
			
		}
		
		System.out.print(sb);
    }
}
