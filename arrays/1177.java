import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
        nt[] vetor = new int[1000];
    		int t = sc.nextInt();
    		for(int i = 0; i<1000; i++){
      			vetor[i] = i%t;
      			System.out.printf("N[%d] = %d%n", i, vetor[i]);
    		}
    }
}
