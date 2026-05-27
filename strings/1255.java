import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int k = 0; k < n; k++){
			String input = sc.nextLine();
			input = input.toLowerCase();
			
			
			int vetor [] = new int[26];
			
			for(int i = 0; i < input.length(); i++){
				
				char letra = input.charAt(i);
				
				if(letra >= 'a' && letra <= 'z'){
					
					vetor[letra - 'a']++;
					
				}
			}
			
			int maior = vetor [0];
			for(int i = 1; i < 26; i++){
				if(vetor[i] > maior){
					maior = vetor[i];
				}
			}
			
			for(int i = 0; i < 26; i++){
				if(vetor[i] == maior){
					char letraCorrespondente = (char)(i + 'a');
					System.out.print(letraCorrespondente);
				}
				
			}
			System.out.println();
		}
    }
}
