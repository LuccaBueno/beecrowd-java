import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();
        leitor.nextLine();

        for (int i = 0; i < n; i++) {

            String frase = leitor.nextLine().trim();

            String[] frase2 = frase.split("\\s+");

            StringBuilder copia = new StringBuilder();

            for (int j = 0; j < frase2.length; j++) {

                if (!frase2[j].isEmpty()) {
                    copia.append(frase2[j].charAt(0));
                }
            }

            System.out.println(copia);
        }

        leitor.close();
    }
}
