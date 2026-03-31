import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
		HashSet<Integer> registros = new HashSet<>();
      
    Scanner sc = new Scanner(System.in);
		int quant = sc.nextInt();
		
		for(int i = 0; i < quant; i++){
			int res_aluno = sc.nextInt();
			registros.add(res_aluno);
		}
      
        System.out.println(registros.size());
    }
}
