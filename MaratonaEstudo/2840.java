import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double R = sc.nextDouble();
		double L = sc.nextDouble();
		double volume = (4/3.0)*3.1415*R*R*R;
		double quant = L/volume;
		System.out.printf("%.0f%n",Math.floor(quant));
	}
}
