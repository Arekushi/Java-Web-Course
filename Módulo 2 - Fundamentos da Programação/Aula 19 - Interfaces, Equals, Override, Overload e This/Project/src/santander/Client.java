package santander;

public class Client {
	private Integer id;
	private String fullName;
	private String rg;
	private String cpf;
	
	public Client(Integer id, String fullname, String rg, String cpf) {
		this.id = id;
		this.fullName = fullname;
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public String getRG() {
		return rg;
	}
	
	public String getCPF() {
		return cpf;
	}
}
