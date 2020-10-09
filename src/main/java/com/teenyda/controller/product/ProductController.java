package com.teenyda.controller.product;

import com.teenyda.controller.product.service.IProductService;
import com.teenyda.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-10-01 13:00
 * @description:
 **/

@RequestMapping("/fruit")
@RestController
public class ProductController {

    @Autowired
    IProductService productService;

    @PostMapping("/product")
    public void addProduct(){
        Product product = new Product();
        product.setProductCategoryId(11001);
        product.setName("新疆葡萄");
        product.setExplain("特色新疆美味葡萄巴拉巴拉");
        product.setShopPrice(new BigDecimal(35.2));
        product.setPrice(new BigDecimal(23.5));

        productService.addProduct(product);
    }
}
