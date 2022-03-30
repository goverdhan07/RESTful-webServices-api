package net.codejava.ProductRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //A controller basically controls the flow of the data.
public class ProductController {
    @Autowired
    public ProductService service;

    @GetMapping("/products")
    public List<Product> list() {
        return service.listAll();
    }

//    public void save(Product product) {
//        service.save(product);
//    }
}

//    @GetMapping("/products/{id}")
//    public Product get(@PathVariable Integer id){
//        return service.get(id);
//    }
//
//    public void delete(Integer id){
//        service.deleteById(id);
//    }
//}
