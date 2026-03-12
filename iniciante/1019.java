import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int hora = t/3600;
		int resto = t%3600;
		
		int minuto = resto/60;
		
		int segundo = resto%60;
		
		System.out.printf("%d:%d:%d%n", hora, minuto, segundo);
	}
}
