package printables;

public abstract class File {
	protected String name;
	protected String type;
	
	public File(String name, String type) {
		this.name = name;
		this.type = type;
	}
}
