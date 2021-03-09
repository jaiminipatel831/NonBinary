import java.util.Random;
public class Tree {
private Node root;
	
	
	public Tree(String presidentName) {
		root = new Node(new Employee(presidentName, "President"));
		
		
		generate();
	}
	
	
	private void generate() {
		
		String[] names = new String[] {
			"Lowell Keeling",
			"Gilberto Oberbrunner",
			"Palma Marvin",
			"Karolann Williamson",
			"Eda Shields",
			"Jaida Kerluke",
			"Laura Abshire",
			"Blanca Prohaska",
			"Kallie Rath",
			"Hester Harvey",
			"Erna Kozey",
			"Marie Ebert",
			"Fabian Zboncak",
			"Alexandro Skiles",
			"Ima Satterfield"
		};
		int nameIndex = 0;
		
		
		Random random = new Random();
		
		
		int numSeniorVPs = random.nextInt(4);
		for (int i = 0; i < numSeniorVPs; i++) {
			root.getChildren().add(new Node(new Employee(names[nameIndex++], "Senior VP")));			
		}

		
		int numVPs = random.nextInt(4);
		for (int i = 0; i < numVPs; i++) {
			root.getChildren().add(new Node(new Employee(names[nameIndex++], "VP")));			
		}
	
		int numDeans = random.nextInt(4);
		for (int i = 0; i < numDeans; i++) {
			root.getChildren().add(new Node(new Employee(names[nameIndex++], "Dean")));			
		}
		
		
		int numChairs = random.nextInt(4);
		for (int i = 0; i < numChairs; i++) {
			root.getChildren().add(new Node(new Employee(names[nameIndex++], "Chair")));			
		}
		
	
		int numFaculties = random.nextInt(4);
		for (int i = 0; i < numFaculties; i++) {
			root.getChildren().add(new Node(new Employee(names[nameIndex++], "Faculty")));			
		}					
	}
	
	private void preorder(Node r) 
	{
		
		if (r == null) {
			return;
		}
		
		System.out.println(r.getData());
		
		for (Node child: r.getChildren()) {
			preorder(child);
		}
	}

	public void preorder() {
		preorder(root);
	}
}
