package com.nexos.inventary.controller;

import com.nexos.inventary.model.Product;
import com.nexos.inventary.model.dto.ProductDto;
import com.nexos.inventary.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

    private final ProductServices productServices;

    @Autowired
    public ProductController(ProductServices productServices) {
        this.productServices = productServices;
    }

    @GetMapping(path="/get")
    public List<Product> getProducts(){

        return productServices.getProducts();
    }
    @PostMapping(path="/save")
    public ProductDto saveProduct(@RequestBody ProductDto productDto){

        return productServices.saveProduct(productDto);
    }
    @PostMapping(path="/edit")
    public ProductDto editProduct(@RequestBody ProductDto productDto){

        return productServices.editProduct(productDto);
    }
    @PostMapping(path="/delete")
    public void deleteProduct(@RequestBody ProductDto productDto){

         productServices.deleteProduct(productDto);
    }
}
