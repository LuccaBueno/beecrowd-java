import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double[] menu = {4, 4.5, 5, 2, 1.50};
		int lanche = sc.nextInt();
		double quant = sc.nextDouble();
		System.out.printf("Total: R$ %.2f%n", menu[lanche-1]*quant);
		
	}
}
