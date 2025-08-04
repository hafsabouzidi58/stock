package org.sid.demo;

import com.mongodb.connection.Stream;
import org.sid.demo.dao.CategoryRepository;
import org.sid.demo.dao.ProductRepository;
import org.sid.demo.documents.Category;
import org.sid.demo.documents.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(CategoryRepository categoryRepository , ProductRepository productRepository){
        return strings ->{

            categoryRepository.deleteAll();

            Category c1 = new Category("A","Samsung","good",new ArrayList<Product>());
            Category c2 = new Category("B","iphone","good",new ArrayList<Product>());

            categoryRepository.save(c1);
            categoryRepository.save(c2);


            productRepository.deleteAll();
            Product p1 = new Product("P1", c1, 50, true, 50000, "iphoneX", "good Product");
            Product p2 = new Product("P2", c1, 40, true, 7000, "S8", "good Product");
            Product p3 = new Product("P3", c1, 30, true, 3300, "S6", "good Product");


            productRepository.save(p1);
            productRepository.save(p2);
            productRepository.save(p3);


            c1.getProducts().add(p2);
            c1.getProducts().add(p3);

            c1.getProducts().add(p1);


            categoryRepository.save(c1);
            categoryRepository.save(c2);


        };
    }



}
