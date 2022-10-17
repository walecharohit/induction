package iteratorresource;

public interface ProductAggregate{

	void addProduct(Product product);
	void removeProduct(Product product);
	ProductIterator getProductIterator();
}

