package iteratorresource;
import java.util.List;

Public class ProductIteratorMethod implements ProductIterator{

	public List productList;
	int position;
	Product product;
	
	public ProductIteratorMethod(List productList){
		this.productList = productList;
	}
	
	public Product nextProduct(){
		System.out.println(position);	
		product = (Product)productList.get(position);
		position++;
		return product;
	}
	
	public boolean isLastProduct(){
		if(position < productList.size()){
			return false;
		}
		return true;
	}
}
