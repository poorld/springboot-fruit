package com.teenyda.controller.category.service;

import com.teenyda.controller.category.dto.CategoryDto;
import com.teenyda.dao.ProductCategory;
import com.teenyda.mapping.ProductCategoryMapper;
import com.teenyda.utils.CloneBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-10-06 09:58
 * @description: 商品分类
 **/

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    ProductCategoryMapper mapper;

    @Override
    public int addCategory(ProductCategory category) {
        return mapper.insertProductCategory(category);
    }

    @Override
    public void removeCategory(Integer categoryId) {
        mapper.deleteProductCategory(categoryId);
    }

    @Override
    public void updateCategory(ProductCategory category) {
        mapper.updateProductCategory(category);
    }

    @Override
    public ProductCategory getCategoryById(ProductCategory category) {
        return mapper.queryProductCategoryLimit1(category);
    }

    @Override
    public List<CategoryDto> getCategorys() {
        List<ProductCategory> categories = mapper.queryProductCategory(null);
        return CloneBeanUtils.copyListProperties(categories, CategoryDto::new);
    }
}
