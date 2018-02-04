package com.kaishengit.dao.impl;

import com.kaishengit.dao.ProductDao;
import com.kaishengit.entity.Product;
import com.kaishengit.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductDaoImpl implements ProductDao {
    @Autowired
    ProductMapper productMapper;
    @Override
    public Product findById(int id) {

        return productMapper.selectByPrimaryKey(id);
    }
}
