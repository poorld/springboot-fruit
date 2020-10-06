package com.teenyda.controller.category.service;

import com.teenyda.dao.ProductCategory;

import java.util.List;

public interface CategoryService {

    int addCategory(ProductCategory category);

    void removeCategory(Integer categoryId);

    void updateCategory(ProductCategory category);

    ProductCategory getCategoryById(ProductCategory categoryId);

    List<ProductCategory> getCategorys();
}
