import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);;
		int V = sc.nextInt();
		
		int Cem = V / 100;
		int Resto = V % 100;
		
		int Cinquenta = Resto / 50;
		Resto = Resto % 50;
		
		int Vinte = Resto / 20;
		Resto = Resto % 20;
		
		int Dez = Resto / 10;
		Resto = Resto % 10;
		
		int Cinco = Resto / 5;
		Resto = Resto % 5;
		
		int Dois = Resto / 2;
		Resto = Resto % 2;
		
		int Um = Resto / 1;
		Resto = Resto % 1;
		System.out.println(V);
		System.out.printf("%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n%d nota(s) de R$ 1,00\n", Cem, Cinquenta, Vinte, Dez, Cinco, Dois, Um);
	}
}
