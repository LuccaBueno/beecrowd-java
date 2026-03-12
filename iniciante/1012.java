import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    		double Pi = 3.14159;
    		double A = sc.nextDouble();
    		double B = sc.nextDouble();
    		double C = sc.nextDouble();
    		
    		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", (A*C)/2, Pi*C*C, (A+B) * C/2, B*B, A*B);
        
    }
 
}
