package iteratorresource;

public class Product{

	private String category;
	private int id;

	public Product(String category, int id){
		this.category = category;
		this.id = id;
	}
	
	public String getCategory(){
		return category;
	}
	
	public int getId(){
		return id;
	}
}
