package com.annjbarr.sainsburys.services;

import com.annjbarr.sainsburys.models.Product;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private static final String PRODUCT_PAGE_URL = "https://jsainsburyplc.github.io/serverside-test/site/www.sainsburys.co.uk/webapp/wcs/stores/servlet/gb/groceries/berries-cherries-currants6039.html";

    public List<Product> getProducts() {
        try {
            Document doc = Jsoup.connect(PRODUCT_PAGE_URL).get();
            Elements products = doc.select(".product");
            for (Element product : products) {
                String productUrl = product.selectFirst("a").absUrl("href");

            }
        } catch (IOException e) {
            return new ArrayList<Product>();
        }
    }

    private Product getProduct(String productUrl) {
        try {
            Document doc = Jsoup.connect(productUrl).get();

        } catch (IOException e) {
            return null;
        }
    }
}
