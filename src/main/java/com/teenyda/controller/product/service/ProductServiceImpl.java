package com.teenyda.controller.product.service;

import com.teenyda.controller.product.dto.ProductQueryDto;
import com.teenyda.controller.product.dto.SimpleProductDto;
import com.teenyda.dao.*;
import com.teenyda.entity.*;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * (Product)表服务实现类
 *
 * @author makejava
 * @since 2020-10-09 17:10:52
 */
@Service("productService")
@Log
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductDao productDao;
    @Resource
    private ProductCategoryDao productCategoryDao;
    @Resource
    private SpecDao specDao;
    @Resource
    private ProductDiscountsDao productDiscountsDao;
    @Resource
    private ProductInfoImageDao InfoImageDao;
    @Resource
    private ProductBannerImageDao bannerImageDao;
    @Resource
    private ProductTagDao productTagDao;

    /**
     * 通过ID查询单条数据
     *
     * @param productId 主键
     * @return 实例对象
     */
    @Override
    public Product queryById(Integer productId) {
        return this.productDao.queryById(productId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Product> queryAllByLimit(int offset, int limit) {
        return this.productDao.queryAllByLimit();
    }

    @Override
    public List<SimpleProductDto> simpleProduct(int offset, int limit) {
        return this.productDao.simpleProduct();
    }

    @Override
    public SimpleProductDto simpleProductById(int productId) {
        return this.productDao.simpleProductById(productId);
    }

    @Override
    public List<SimpleProductDto> queryByCategoryId(Integer categoryId) {
        return this.productDao.queryByCategoryId(categoryId);
    }

    @Override
    public List<SimpleProductDto> queryByCategoryIdAndName(Integer categoryId, String name) {
        return this.productDao.queryByCategoryAndName(categoryId, name);
    }

    @Override
    public List<Product> queryAll() {
        return this.productDao.queryAll(null);
    }

    @Override
    public List<Product> queryByCategory(List<ProductCategory> productCategories) {
        return this.productDao.queryByCategory(productCategories);
    }

    @Override
    public List<Product> query(ProductQueryDto queryDto) {
        return this.productDao.query(queryDto);
    }

    /**
     * 新增数据
     *
     * @param product 实例对象
     * @return 实例对象
     */
    @Override
    @Transactional
    public Product insert(Product product) {
        log.info("添加产品");
        product.setCreateTime(new Date());
        this.productDao.insert(product);
        Integer productId = product.getProductId();
        log.info(product.getProductId() + "");
        log.info("产品id=" + productId);
        // 获取规格
        List<Spec> spec = product.getSpec();
        for (Spec item : spec){
            item.setProductId(productId);
        }

        // 获取优惠
        List<Discounts> discounts = product.getDiscounts();
        List<ProductDiscounts> dcList = new ArrayList<>();
        for (Discounts d : discounts) {
            ProductDiscounts dc = new ProductDiscounts();
            dc.setProductId(productId);
            dc.setDiscountsId(d.getDiscountsId());
            dcList.add(dc);
        }

        // 获取水果介绍图片
        List<ProductInfoImage> infoImages = product.getProductInfoImages();
        for (ProductInfoImage infoImage : infoImages) {
            infoImage.setProductId(productId);
        }

        // 获取幻灯片
        List<ProductBannerImage> bannerImages = product.getProductBannerImages();
        for (ProductBannerImage bannerImage : bannerImages) {
            bannerImage.setProductId(productId);
        }

        // 获取标签
        List<Tag> tags = product.getTags();
        List<ProductTag> productTags = new ArrayList<>();
        for (Tag tag : tags) {
            ProductTag pt = new ProductTag();
            pt.setProductId(productId);
            pt.setTagId(tag.getTagId());
            productTags.add(pt);
        }

        this.specDao.insertBatch(spec);
        if (dcList.size() > 0) {
            this.productDiscountsDao.insertBatch(dcList);
        }
        this.InfoImageDao.insertBatch(infoImages);
        this.bannerImageDao.insertBatch(bannerImages);
        if (productTags.size() > 0) {
            this.productTagDao.insertBatch(productTags);
        }
        return product;
    }

    /**
     * 修改数据
     *
     * @param product 实例对象
     * @return 实例对象
     */
    @Override
    public Product update(Product product) {
        this.productDao.update(product);
        return this.queryById(product.getProductId());
    }

    /**
     * 通过主键删除数据
     *
     * @param productId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer productId) {
        return this.productDao.deleteById(productId) > 0;
    }
}