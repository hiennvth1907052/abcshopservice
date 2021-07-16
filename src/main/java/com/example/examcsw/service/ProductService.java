package com.example.examcsw.service;

import com.example.examcsw.entity.Product;
import com.example.examcsw.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@Component(value = "product")
@WebService
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    @WebMethod
    public List<Product> getList(){
        return productRepository.findAll();
    }
    @WebMethod
    public void save(Product product){
        productRepository.save(product);
    }
}
