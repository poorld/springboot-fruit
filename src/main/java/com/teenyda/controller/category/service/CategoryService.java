package com.teenyda.controller.category.service;

import com.teenyda.controller.category.dto.CategoryDto;
import com.teenyda.domain.ProductCategory;

import java.util.List;

public interface CategoryService {

    int addCategory(ProductCategory category);

    void removeCategory(Integer categoryId);

    void updateCategory(ProductCategory category);

    ProductCategory getCategoryById(ProductCategory categoryId);

    List<CategoryDto> getCategorys();
}
