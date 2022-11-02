package iteratorresource;

import java.util.ArrayList;
import java.util.List;

public class ProductAggregateMethod implements ProductAggregate{

	public List productList;
	
	public ProductAggregateMethod(){
		
		productList = new ArrayList();
	}
	
	public void addProduct(Product product){
		productList.add(product);
	}

	public void removeProduct(Product product){
		productList.remove(product);
	}
	
	public ProductIterator getProductIterator(){
		return new ProductIteratorMethod(productList);
	}
}
