package com.kaishengit.collector;

import com.kaishengit.dao.ProductDao;
import com.kaishengit.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    @Autowired
    ProductDao productDao;
    @GetMapping("/")
    public String toHome(Model model){
        Product product = productDao.findById(11111);
        System.out.println(product);
        return "hello";
    }
}
