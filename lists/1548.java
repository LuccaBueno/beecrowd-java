import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int quantAlunos = sc.nextInt();
		
		for(int i = 0; i < quantAlunos; i++){		
		
			ArrayList<Integer> arrayList = new ArrayList<>();
			
			int quantNotas = sc.nextInt();
			
			for(int j = 0; j < quantNotas; j++){
				arrayList.add(sc.nextInt());
			}
			
			ArrayList<Integer> novoArray = new ArrayList<>(arrayList);
			Collections.sort(novoArray, Collections.reverseOrder());
			
			int naoMudaram = 0;
			
			for(int k = 0; k < arrayList.size(); k++){
				if(arrayList.get(k).equals(novoArray.get(k))){
					naoMudaram++;
				}
			}
			
			//System.out.println(arrayList);
			//System.out.println(novoArray);
			System.out.println(naoMudaram);
			
		}
	}
}
