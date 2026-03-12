import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
    		int Num_f = sc.nextInt();
    		int Hora = sc.nextInt();
    		double Valor_h = sc.nextDouble();
    		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", Num_f, Hora * Valor_h);
    }
 
}
