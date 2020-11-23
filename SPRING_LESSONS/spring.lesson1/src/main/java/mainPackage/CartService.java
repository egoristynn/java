package mainPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class CartService {

    ProductRepository productRepository;
    List<Product> itemList = new ArrayList<>();

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProductList (){
        return productRepository.findAll();
    }

    public List<Product> addItem(Product product){
        itemList.add(product);
        return itemList;
    }

    public List<Product> deleteItem(Product product){
        itemList.remove(product);
        return itemList;
    }

    public Double sumOfProducts(){
        Double result = 0.0;
        for (Product p:itemList) {
            result += p.getPrice();
        }
        return result;
    }
}
