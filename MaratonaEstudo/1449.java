import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		
		int T = sc.nextInt();//instancias
		
		
		for(int k = 0; k < T; k++){
			
			map.clear();
			
			int M = sc.nextInt();//palavras
			int N = sc.nextInt();//linhas
			
			sc.nextLine();
			
			for(int i = 0; i < M; i++){
				String key = sc.nextLine();
				String value = sc.nextLine();
				
				map.put(key, value);
			}
			for(int i = 0; i < N; i++){
			
				String lang1 = sc.nextLine();
				
				String[] palavras = lang1.split(" ");
				
				for(int j = 0; j < palavras.length; j++){
					
					
					if(map.containsKey(palavras[j])){
						
						sb.append(map.get(palavras[j]));
						
					}else{
						
						sb.append(palavras[j]);
						
					}
					
					if(j != palavras.length - 1){
						
						sb.append(" ");
						
					}
					
				}
				
				sb.append("\n");
			
			}
			
			System.out.println(sb);
			
			sb.setLength(0);
		}
    }
}
