import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int k = 0; k < n; k++){
			String a1 = sc.next();
			String a2 = sc.next();
			
			StringBuilder res = new StringBuilder();
			
			int maior = Math.max(a1.length(), a2.length());
			
			for(int i = 0; i < maior; i++){
				
				if(i < a1.length()){
					
					res.append(a1.charAt(i));
					
				}
				if(i < a2.length()){
					
					res.append(a2.charAt(i));
					
				}
				
				
			}
			System.out.println(res);
		}
	}
}
