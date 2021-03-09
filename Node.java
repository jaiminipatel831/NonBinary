import java.util.ArrayList;
import java.util.List;

public class Node {
private Employee data;
	
	
	private List<Node> children = new ArrayList<>();

	public Node(Employee data) {
		this.data = data;
	}


	public Employee getData() {
		return data;
	}

	
	public List<Node> getChildren() {
		return children;
	}
}
