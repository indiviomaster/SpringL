package com.geekbrains.controllers;

import com.geekbrains.entites.Product;
import com.geekbrains.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductsController {


    private ProductService productService;
    private List<Product> products;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/showProduct")
    public String hello(Model uiModel, @ModelAttribute("product") Product product) {


        System.out.println("**Show product**");
        return "products";
    }

//
    @RequestMapping(path = "/showProductById", method = RequestMethod.GET)
    @ResponseBody
    public Product showProductById(Model uiModel, @RequestParam Long id) {
        Product product = productService.getProductById(id);
        return product;
    }

    @RequestMapping(path = "/showProductById/{pid}", method = RequestMethod.GET)
    @ResponseBody
    public Product showProductById(@PathVariable("pid") Long id) {
        Product product = productService.getProductById(id);
        return product;
    }

    @RequestMapping(path = "/setProductById", method = RequestMethod.POST)
    public void setProduct(@RequestBody Product product) {
        System.out.println(product.getTitle() + " " + product.getCost());
    }

    @RequestMapping("/showForm")
    public String showSimpleForm(Model uiModel) {
        Product product = new Product();
        uiModel.addAttribute("product", product);
        return "product-form";
    }


    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("product") Product product) {
        return "product-form-result";
    }


}
