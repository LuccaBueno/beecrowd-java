import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String input = sc.nextLine();
			input = input.toUpperCase();
			StringBuilder sb = new StringBuilder();
			
			boolean maiusculo = true;
			for(int i = 0; i < input.length(); i++){
				char letra = input.charAt(i);
				if(letra != ' '){
					if(maiusculo){
						sb.append(letra);
						maiusculo = false;
					}else{
						sb.append(Character.toLowerCase(letra));
						maiusculo = true;
					}
				}else{
					sb.append(' ');
				}
			}
			System.out.println(sb);
	    }
    }
}
