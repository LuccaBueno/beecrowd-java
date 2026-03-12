import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int[] vet = {6,2,5,5,4,5,6,3,7,6};
		int LED = 0;
		int quant = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < quant; i++){
			String s = sc.nextLine();
			LED = 0; 
			for(int j = 0; j < s.length(); j++){
				LED += vet[Character.getNumericValue(s.charAt(j))];
			}
			System.out.println(LED + " leds");
		}
	}
}
