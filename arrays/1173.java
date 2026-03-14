import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    		int[] x = new int[10];
    			x[0] = sc.nextInt();
    
    		for(int i = 1; i < 10; i++){
    			x[i] = x[i-1]*2;
    		}
    		for(int i = 0; i < 10; i++){
    			System.out.printf("N[%d] = %d%n", i, x[i]);
    			
    		}
	}
}
