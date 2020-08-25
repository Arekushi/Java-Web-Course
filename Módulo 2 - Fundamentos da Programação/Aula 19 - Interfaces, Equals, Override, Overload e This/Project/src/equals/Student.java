package equals;

public class Student {
	private String name;
	private Integer id;
	
	public Student(String name, Integer id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getId() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			return id == ((Student) obj).id;
		} catch(Exception e) {
			return false;
		}
	}
}
