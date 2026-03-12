import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
    		int T = sc.nextInt();
    		int Vm = sc.nextInt();
    		double D = T * Vm;
    		System.out.printf("%.3f\n", D/12);
 
    }
 
}
