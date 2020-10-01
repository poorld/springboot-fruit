package com.teenyda.controller.product.service;

import com.teenyda.dao.Product;
import com.teenyda.mapping.base.ProductBaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-10-01 12:57
 * @description:
 **/

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    ProductBaseMapper productBaseMapper;

    @Override
    public void addProduct(Product product) {
        productBaseMapper.insertProduct(product);
    }
}
