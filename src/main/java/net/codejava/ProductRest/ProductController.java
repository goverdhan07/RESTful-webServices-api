package net.codejava.ProductRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller //A controller basically controls the flow of the data.
public class ProductController {
    @Autowired
    public ProductService service;

    @GetMapping("/products")
    public List<Product> list() {
        return service.listAll();
    }
}


//    public void save(Product product){
//        service.save(product);
//    }
//
//    @GetMapping("/products/{id}")
//    public Product get(Integer id){
//        return service.findById(id).get();
//    }
//
//    public void delete(Integer id){
//        service.deleteById(id);
//    }
//}
