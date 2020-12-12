package com.teenyda.controller.category.controller;

import com.teenyda.common.GlobalErrorInfoException;
import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.controller.category.dto.CategoryDto;
import com.teenyda.controller.category.exception.CategoryException;
import com.teenyda.controller.file.exception.FileUploadException;
import com.teenyda.entity.ProductCategory;
import com.teenyda.service.ProductCategoryService;
import com.teenyda.utils.CloneBeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ProductCategory)表控制层
 *
 * @author makejava
 * @since 2020-10-09 20:17:18
 */
@RestController
@RequestMapping("fruit")
public class ProductCategoryController extends AbstractApiController {
    /**
     * 服务对象
     */
    @Resource
    private ProductCategoryService productCategoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("category/{id}")
    public ResultBody<CategoryDto> selectOne(@PathVariable("id")Integer id) {
        ProductCategory productCategory = this.productCategoryService.queryById(id);
        CategoryDto categoryDto = CloneBeanUtils.copyProperties(productCategory, CategoryDto.class);
        return responseSuccessJson(categoryDto);
    }

    @GetMapping("category")
    public ResultBody<List<CategoryDto>> selectAll() {
        List<ProductCategory> productCategories = this.productCategoryService.queryAllByLimit(0, 100);
        List<CategoryDto> categoryDtos = CloneBeanUtils.copyListProperties(productCategories, CategoryDto::new);
        return responseSuccessJson(categoryDtos);
    }

    @PostMapping("category")
    public ResultBody<CategoryDto> addCategory(@RequestBody ProductCategory category) throws GlobalErrorInfoException {
        ProductCategory productCategory = this.productCategoryService.insert(category);
        CategoryDto categoryDto = CloneBeanUtils.copyProperties(productCategory, CategoryDto.class);
        return responseSuccessJson(categoryDto);
    }

    @PutMapping("category")
    public ResultBody<CategoryDto> updateCategory(@RequestBody ProductCategory category) {
        ProductCategory productCategory = this.productCategoryService.update(category);
        CategoryDto categoryDto = CloneBeanUtils.copyProperties(productCategory, CategoryDto.class);
        return responseSuccessJson(categoryDto);
    }

    @DeleteMapping("category")
    public ResultBody<CategoryDto> removeCategory(@RequestBody ProductCategory category) throws GlobalErrorInfoException {
        boolean res = this.productCategoryService.deleteById(category.getProductCategoryId());
        if (res)
            return responseSuccessJson();
        throw new GlobalErrorInfoException(CategoryException.ERROR_DELETE);
    }
}