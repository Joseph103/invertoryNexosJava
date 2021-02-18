package com.nexos.inventary.model.transform;

import com.nexos.inventary.model.Product;
import com.nexos.inventary.model.UserNexos;
import com.nexos.inventary.model.dto.ProductDto;

public class ProductTransform {
    public static final ProductTransform productTransform = new ProductTransform();

    public ProductDto productToDto(Product product)
    {
        ProductDto productDtoResponse = new ProductDto();;

        if (product != null){
            if (product.getId() != null){
                productDtoResponse.setId(product.getId());
            }
            productDtoResponse.setAmount(product.getAmount());
            productDtoResponse.setName(product.getName());
            productDtoResponse.setEntryDate(product.getEntryDate());
            productDtoResponse.setModificationDate(product.getModificationDate());
            UserNexos user = new UserNexos();
            user.setId(product.getUserId().getId());
            user.setIdCargo(product.getUserId().getIdCargo());
            productDtoResponse.setUserId(user);
        }

        return productDtoResponse;
    }

    public Product dtoToProduct(ProductDto productDto) {
        Product productResponse = new Product();

        if (productDto != null){
            if (productDto.getId() != null){
                productResponse.setId(productDto.getId());
            }

            productResponse.setAmount(productDto.getAmount());
            productResponse.setName(productDto.getName());
            productResponse.setEntryDate(productDto.getEntryDate());
            productResponse.setModificationDate(productDto.getModificationDate());
            UserNexos user = new UserNexos();
            user.setId(productDto.getUserId().getId());
            user.setIdCargo(productDto.getUserId().getIdCargo());
            productResponse.setUserId(user);
        }

        return productResponse;
    }
}
