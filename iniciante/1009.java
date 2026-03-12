import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    		String Nome = sc.next();
    		double Salario = sc.nextDouble();
    		double T_vendas = sc.nextDouble();
    		System.out.printf("TOTAL = R$ %.2f%n", Salario + T_vendas * 0.15);
 
    }
 
}
