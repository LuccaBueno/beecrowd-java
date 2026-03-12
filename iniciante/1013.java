import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
         Scanner sc = new Scanner(System.in);
      		int A = sc.nextInt();
      		int B = sc.nextInt();
      		int C = sc.nextInt();
      		int maior = (A + B + Math.abs(A - B)) / 2;
      		if (C>maior){
      			maior = C;
      		}
      		System.out.printf("%d eh o maior\n", maior);
 
    }
 
}
