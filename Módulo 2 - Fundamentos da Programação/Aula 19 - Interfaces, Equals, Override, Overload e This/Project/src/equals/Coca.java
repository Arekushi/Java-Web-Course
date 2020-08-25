package equals;

public class Coca {
	private Integer size;
	private Double price;
	
	public Coca(Integer size, Double price) {
		this.size = size;
		this.price = price;
	}
	
	public Integer getSize() {
		return size;
	}
	
	public Double getPrice() {
		return price;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			return size == ((Coca) obj).size;
		} catch(Exception e) {
			return false;
		}
	}
}
