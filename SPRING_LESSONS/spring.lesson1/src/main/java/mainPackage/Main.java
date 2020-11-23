package mainPackage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductRepository productRepository = context.getBean("productRepository", ProductRepository.class);
        CartService cartService = context.getBean("cartService", CartService.class);
        System.out.println(cartService.getProductList());
    }
}
