import java.util.LinkedList;
import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
			
			int quantCart = sc.nextInt();
			if (quantCart == 0) break;
			
			LinkedList<Integer> linkedList = new LinkedList<>();
			
			for(int i = 1; i <= quantCart; i++){
				linkedList.add(i);
			}
			
			StringBuilder sb = new StringBuilder("Discarded cards: ");
			
			 while (linkedList.size() > 1){
                sb.append(linkedList.removeFirst());

                if (linkedList.size() > 1){
                    sb.append(", ");
                }

                linkedList.addLast(linkedList.removeFirst());
            }

			System.out.println(sb);
			System.out.println("Remaining card: " + linkedList.getFirst());
		}
	}
}
