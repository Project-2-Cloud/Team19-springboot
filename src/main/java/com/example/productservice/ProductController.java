package com.example.productservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ProductController {

    @RequestMapping("/products")
    public List<Product> getAllProducts() {
        return Arrays.asList(
                new Product(
                        "1",
                        "Family Pack",
                        "100+ family-friendly attractions & leisures, 3000+ restaurants & food offers, includes rental & delivery offers too !",
                        "https://drive.google.com/uc?export=view&id=1yayC1zB3Hg5pQFwTOQ1plyxUkWH8a9Km",
                        150
                ),
                new Product(
                        "2",
                        "Tourist Pack",
                        "200+ tourist attractions & leisures, 400+ fine dining restaurants, Over 1000 food & beverage offers and plenty of rental offers too.",
                        "https://drive.google.com/uc?export=view&id=1iU2FN06wIjRrIX1cQpHaF77jy-h_sHUg",
                        150
                ),
                new Product(
                        "3",
                        "Student Pack",
                        "200+ promo's for fun and crazy activities, 400+ Bars and restaurants, Over 3000 food & beverage offers, new special abbey tours and beers too !",
                        "https://drive.google.com/uc?export=view&id=1-YDkoPVEWIwFG5Uqs48jhzd8yMdY3ja5",
                        150
                ),
                new Product(
                        "4",
                        "Combo Pack",
                        "Benefit from all the promotions and coupons that we offer for a reduced price !",
                        "https://drive.google.com/uc?export=view&id=1RJECSSE8cZZvkGl5fUAkVSfDFURoy_e5",
                        350
                )
        );
    }
}
