import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long[] fib = new long[93];

        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i < fib.length; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
		    int t_num = sc.nextInt();
        for(int i = 0; i < t_num; i++){
			      int fib_index = sc.nextInt();
            System.out.printf("Fib(%d) = %d%n", fib_index , fib[fib_index]);
        }
    }
}
