import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		char[] alfabetoMaiusculo = {'A', 'B', 'C', 'D', 'E', 'F', 'G','H', 'I', 'J', 'K', 'L', 'M', 'N','O', 'P', 'Q', 'R', 'S', 'T', 'U','V', 'W', 'X', 'Y', 'Z'};
		
			int n = sc.nextInt();
			sc.nextLine();
			
			for(int i = 0; i < n; i++){
				
				String input = sc.nextLine();
				
				int pace = sc.nextInt();
				sc.nextLine();
				
				
				StringBuilder sb = new StringBuilder();
				
				for(int j = 0; j < input.length(); j++){
					
					char letra = input.charAt(j);
					
					sb.append(alfabetoMaiusculo[((letra - 'A') - pace + 26) % 26]);
					//somar 26 para não ficar negativo
				}
				
				System.out.println(sb);
				
			}
	}
	
}
