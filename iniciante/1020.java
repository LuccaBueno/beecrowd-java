import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int t_dias = sc.nextInt();
		int anos = t_dias/365;
		int resto = t_dias%365;

		int meses = resto/30;
		
		int dias = resto%30;
		
		System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", anos, meses, dias);
	}
}
