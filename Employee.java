
public class Employee {
private String name;
	
	
	private String rank;

	public Employee(String name, String rank) {
		this.name = name;
		this.rank = rank;
	}

	
	public String getName() {
		return name;
	}

	
	public String getRank() {
		return rank;
	}


	public String toString() {
		return  name + ", " + rank;
	}
	
}
