import java.util.Scanner;

public class Main {
	public static int cont = 0;
	
	public static int fibonacci(int n){
		cont++;
		
		if(n == 0){
			return 0;
		}
		if(n == 1){
			return 1;
		}
		
		return fibonacci(n-1)+fibonacci(n-2);
	}
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++){
			
			cont = 0;
			
			int input = sc.nextInt();
			
			int res = fibonacci(input);
			
			System.out.printf("fib(%d) = %d calls = %d%n", input, cont-1, res);
		}
    }
}
