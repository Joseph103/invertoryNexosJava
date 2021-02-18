package com.nexos.inventary.service;

import com.nexos.inventary.model.Product;
import com.nexos.inventary.model.dto.ProductDto;
import com.nexos.inventary.model.transform.ProductTransform;
import com.nexos.inventary.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class ProductServices {


    private final ProductRepository productRepository;
    private final ProductTransform productTransform = new ProductTransform();

    @Autowired
    public ProductServices(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts(){
        try {
                return productRepository.findAll();
        }catch (Exception ex){
            System.out.println("GET ERROR: "+ ex.getMessage());
        }

        return Collections.emptyList();
    }

    public ProductDto saveProduct(ProductDto productDto){
        try{
            if (productDto != null){
                Product product = productTransform.dtoToProduct(productDto);
                Product product1 = productRepository.save(product);
                return productTransform.productToDto(product1);
            }
        }catch (Exception ex){
            System.out.println("SAVE PRODUCT ERROR: "+ ex.getMessage());
        }

        return productDto;
    }

    public ProductDto editProduct(ProductDto productDto){
        try {
            if (productDto != null){
                Product product = productRepository.findById(productDto.getId()).get();
                product.setAmount(productDto.getAmount());
                product.setName(productDto.getName());
                product.setModificationDate(new Date());

                return productTransform.productToDto(productRepository.save(product));
            }
        }catch (Exception ex){
            System.out.println("EDIT PRODUCT ERROR: "+ ex.getMessage());
        }

        return productDto;
    }

    public void deleteProduct(ProductDto productDto){
        try {
            if (productDto != null) {
                productRepository.delete(productTransform.dtoToProduct(productDto));
            }
        }catch (Exception ex){
            System.out.println("DELETE PRODUCT ERROR: "+ ex.getMessage());
        }
    }
}