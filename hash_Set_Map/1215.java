import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<String> palavras = new TreeSet<>();

        while (sc.hasNextLine()) {
            String linha = sc.nextLine().toLowerCase();

            String[] partes = linha.split("[^a-zA-Z]+");//linha.split("[^a-z]+"); como tudo ja foi convertido para minusculo

            for (String p : partes) {
                if (!p.isEmpty()) {
                    palavras.add(p);
                }
            }
        }

        for (String p : palavras) {
            System.out.println(p);
        }

        sc.close();
    }
}
