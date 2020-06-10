package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Payment {
    private Receipt receipt;
    public Payment(Product ... prod) {
        ArrayList<Product> products = new ArrayList<>();
        Collections.addAll(products, prod);
        this.receipt = new Receipt(products);
        System.out.println("Стоимость всех продуктов в чеке " + receipt.getPrice() + " Долларов");
    }


    public static class Receipt{
        private ArrayList<Product> products;
        private double price;

        public Receipt(ArrayList<Product> products) {
            this.products = products;
            this.price = getTotalPrice();
        }

        public double getTotalPrice() {
            double totalPrice = 0;
            for (Product product: products) {
                totalPrice += product.getPrice();
            }
            return totalPrice;
        }

        public ArrayList<Product> getProducts() {
            return products;
        }

        public void setProducts(ArrayList<Product> products) {
            this.products = products;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
        public void addProduct(Product product) {
            products.add(product);
        }

        public void removeProduct(Product product){
            products.remove(product);
        }

        @Override
        public String toString() {
            return "Receipt {" +
                    "products=" + products +
                    ", price=" + price +
                    '}';
        }
    }
    
}
