import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double input = sc.nextDouble();
		double v = input * 100;//tudo para centavos
		int V = (int)v; // economizar memoria double > int
		
		int cem =  V / 10000; 
		int resto = V - cem*10000;
		
		int cinquenta = resto / 5000;
		resto = resto - cinquenta*5000;
		
		int vinte = resto / 2000;
		resto = resto - vinte*2000;
		
		int dez = resto / 1000;
		resto = resto - dez*1000;
		
		int cinco = resto / 500;
		resto = resto - cinco*500;
		
		int dois = resto / 200;
		resto = resto - dois*200;
		
		int um = resto / 100;
		resto = resto - um*100;
		
		int m5 = resto / 50;
		resto = resto - m5*50;
		
		int m25 = resto / 25;
		resto = resto - m25*25;
		
		int m10 = resto / 10;
		resto = resto - m10*10;
		
		int m05 = resto / 5;
		resto = resto - m05*5;
		
		int m01 = resto / 1;
		resto = resto - m01*1;
		
		System.out.printf("NOTAS:%n%d nota(s) de R$ 100.00%n%d nota(s) de R$ 50.00%n%d nota(s) de R$ 20.00%n%d nota(s) de R$ 10.00%n%d nota(s) de R$ 5.00%n%d nota(s) de R$ 2.00%nMOEDAS:%n%d moeda(s) de R$ 1.00%n%d moeda(s) de R$ 0.50%n%d moeda(s) de R$ 0.25%n%d moeda(s) de R$ 0.10%n%d moeda(s) de R$ 0.05%n%d moeda(s) de R$ 0.01%n", cem, cinquenta, vinte, dez, cinco, dois, um, m5, m25, m10, m05, m01);
 
//int cinquenta = resto / 5000;
//resto %= 5000;
    }
 
}
