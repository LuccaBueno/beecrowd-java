import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<N1; i++){
			String A1 = sc.next();
			String B1 = sc.next();
  			if(A1.endsWith(B1)){
  				System.out.println("encaixa");
  			}else{
  				System.out.println("nao encaixa");
  			}
		}
	}
}
