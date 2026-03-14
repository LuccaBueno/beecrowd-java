import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];

        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
        }

        Arrays.sort(x);

        for(int i = 0; i < n; i++){

            int contador = 0;

            for(int j = 0; j < n; j++){
                if(x[i] == x[j]){
                    contador++;
                }
            }

            if(i == n-1 || x[i] != x[i+1]){
                System.out.printf("%d aparece %d vez(es)%n", x[i], contador);
            }

        }
    }
}
