package mainPackage;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> productList = new ArrayList<>();

    public ProductRepository() {
    }

    @PostConstruct
    public void init(){
        productList.add(new Product(1l, "apple", 10.0));
        productList.add(new Product(2l, "pineapple", 20.0));
        productList.add(new Product(3l, "pen", 30.0));
        productList.add(new Product(4l, "pencil", 35.0));
        productList.add(new Product(5l, "banana", 50.0));
        System.out.println("init ProductRepository");
    }

    public List<Product> findAll(){
        return Collections.unmodifiableList(productList);
    }

    public Product findProductById(Long id) {
        Product result = null;
        for (Product p: productList) {
            if (p.getId().equals(id)) {
                result = p;
                break;
            }
        }
        return result;
    }

}

