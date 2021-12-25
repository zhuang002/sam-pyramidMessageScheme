import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		for (int i=0;i<n;i++) {
			Node root = readinTree(sc);
			System.out.println(root.getDepth()*20);
		}
	}

	private static Node readinTree(Scanner sc) {
		// TODO Auto-generated method stub
		return null;
	}

}


class Node {
	String id;
	Node parent;
	List<Node> children=new ArrayList<>();
	
	public Node(String id) {
		this.id = id;
	}

	public int getDepth() {
		// TODO Auto-generated method stub
		return 0;
	}
}