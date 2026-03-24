import java.util.LinkedList;
import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
			
			int quant_Cart = sc.nextInt();
			if(quant_Cart == 0) break;
			
			LinkedList<Integer> linkedList = new LinkedList<>();
			
			for(int i = 1; i <= quant_Cart; i++){
				linkedList.add(i);
			}
			
			System.out.print("Discarded cards:");
			boolean primeiro = true;
			
			while(linkedList.size() > 1){
				int removido = linkedList.removeFirst();
				 
				if(primeiro){
					System.out.print(" " + removido);
					primeiro = false;
				}else{
					System.out.print(", " + removido);
				}
				
				linkedList.addLast(linkedList.removeFirst());
			}
			
			System.out.println();
			System.out.println("Remaining card: " + linkedList.getFirst());
		}
	}
}
