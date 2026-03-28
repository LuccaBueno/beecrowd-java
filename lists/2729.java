import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // limpa o buffer

        for (int i = 0; i < n; i++) {

            Set<String> palavras = new TreeSet<>();

            String linha = sc.nextLine();
            String[] partes = linha.split(" ");

            for (String p : partes) {
                palavras.add(p);
            }

            boolean primeiro = true;
            for (String p : palavras) {
                if (!primeiro) {
                    System.out.print(" ");
                }
                System.out.print(p);
                primeiro = false;
            }
            System.out.println();
        }

        sc.close();
    }
}
